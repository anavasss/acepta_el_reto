
import java.util.Scanner;

public class PerimetroDeUnRectangulo155 {

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
				
				if (num1 < 0 || num2 < 0) {
					System.exit(0);
				} else {
					System.out.println((num1 + num2)*2);
				}
				
			}
			
		}
}