
import java.util.Scanner;

public class LaPiezaPerdida168 {

	static Scanner leer;

	public static void main(String[] args) {

		leer = new Scanner(System.in);
		
		while (casoDePrueba()) {
		}

	}

	static boolean casoDePrueba() {

		int piezasTotales = leer.nextInt();

		if (piezasTotales == 0) {
			return false;
		}

		int sumaPiezas = 0;

		for (int i = 1; i < piezasTotales; i++) {
			int entrada = leer.nextInt();
			sumaPiezas += entrada;
		}

		int totalPiezas = (piezasTotales + piezasTotales * piezasTotales) / 2;

		System.out.println(totalPiezas - sumaPiezas);
		return true;

	}
}