
import java.util.Scanner;

public class Calorias363 {

	static Scanner leer;

	public static void main(String[] args) {

		leer = new Scanner(System.in);

		while (casoDePrueba()) {
		}

	}

	static boolean casoDePrueba() {

		int caloriasQuemadas = leer.nextInt();

		if (caloriasQuemadas == 0) {
			return false;
		}

		int numComidas = leer.nextInt();

		int calorias = 0;
		for (int i = 0; i < numComidas; i++) {
			calorias += leer.nextInt();
		}

		double resultado = Math.ceil((double) calorias / (double) caloriasQuemadas);

		System.out.println((int) resultado);

		return true;

	}
}