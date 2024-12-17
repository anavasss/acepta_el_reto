
import java.util.Scanner;

public class RacimosUvas433 {

	static Scanner leer;

	public static void main(String[] args) {

		leer = new Scanner(System.in);
		while (casoDePrueba()) {
		}

	}

	static boolean casoDePrueba() {

		int numero = leer.nextInt();

		if (numero == 0)
			return false;

		int total = 0;
		int uvas = 0;

		while (numero > uvas) {
			total++;
			uvas += total;
		}

		System.out.println(total);

		return true;

	}

}