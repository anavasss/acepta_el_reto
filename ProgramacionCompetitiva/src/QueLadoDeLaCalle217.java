
import java.util.Scanner;

public class QueLadoDeLaCalle217 {

		static Scanner leer;

		public static void main(String[] args) {
				
				casoDePrueba();
				
		}

		static void casoDePrueba() {
			
			leer = new Scanner(System.in);
			
			boolean hacerBucle = true;
			
			while (hacerBucle) {
				int numero = leer.nextInt();
				
				if (numero == 0) {
					System.exit(0);
				} else if (numero % 2 == 0) {
					System.out.println("DERECHA");
				} else {
					System.out.println("IZQUIERDA");
				}
				
			}
			
		}
}