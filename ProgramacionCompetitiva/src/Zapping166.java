
import java.util.Scanner;

public class Zapping166 {

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

			int numeroMayor, numeroMenor;
			
			if (num2 > num1) {
				numeroMayor = num2;
				numeroMenor = num1;
			} else {
				numeroMayor = num1;
				numeroMenor = num2;
			}
			
			if (num1 == 0 && num2 == 0) {
				System.exit(0);
			} else if (numeroMayor - numeroMenor >= 50) {
				System.out.println(numeroMenor + (99 - numeroMayor));
			} else {
				System.out.println(numeroMayor-numeroMenor);
			}

		}

	}
}