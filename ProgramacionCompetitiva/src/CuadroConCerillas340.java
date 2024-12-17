import java.util.Scanner;

public class CuadroConCerillas340 {

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

		System.out.println(((num1+1)*num2)+((num2+1)*num1));

	}

}