
import java.util.Scanner;

public class AreaDeUnRectangulo164 {

		static Scanner leer;

		public static void main(String[] args) {
				
				casoDePrueba();
				
		}

		static void casoDePrueba() {
			
			leer = new Scanner(System.in);
			
			boolean hacerBucle = true;
			
			while (hacerBucle) {
				int num1 = leer.nextInt();
				int num2 = leer.nextInt();
				int num3 = leer.nextInt();
				int num4 = leer.nextInt();
				
				if (num1 > num3 || num2 > num4) {
					System.exit(0);
				} else {
					int base = num3-num1;
					int altura = num4-num2;
					
					System.out.println(base*altura);
				}
				
			}
			
		}
}