import java.util.Scanner;

public class HolaMundo116 {

	static Scanner leer;

	public static void main(String[] args) {

		leer = new Scanner(System.in);

		int numCasosDePrueba = leer.nextInt();

		for (int i = 1; i <= numCasosDePrueba; i++) {

			casoDePrueba();

		}

	}

	static void casoDePrueba() {

		System.out.println("Hola mundo.");

	}

}