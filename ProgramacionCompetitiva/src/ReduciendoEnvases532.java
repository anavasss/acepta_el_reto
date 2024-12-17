import java.util.Scanner;

public class ReduciendoEnvases532 {

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

		System.out.println(num2 - num1);

	}

}