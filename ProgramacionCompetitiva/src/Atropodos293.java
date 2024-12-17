import java.util.Scanner;

public class Atropodos293 {

	static Scanner leer;

	public static void main(String[] args) {

		leer = new Scanner(System.in);

		int numCasosDePrueba = leer.nextInt();

		for (int i = 1; i <= numCasosDePrueba; i++) {

			casoDePrueba();

		}

	}

	static void casoDePrueba() {

		int num1 = leer.nextInt();
		int num2 = leer.nextInt();
		int num3 = leer.nextInt();
		int num4 = leer.nextInt();
		int num5 = leer.nextInt();

		System.out.println((num1 * 6) + (num2 * 8) + (num3 * 10) + (num4 * (num5 * 2)));

	}

}