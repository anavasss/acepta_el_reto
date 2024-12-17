import java.util.Scanner;

public class BandurriaHero634 {
	static Scanner leer;

	public static void main(String[] args) {
		leer = new Scanner(System.in);
		int numCasosDePrueba = leer.nextInt();
		leer.nextLine();
		for (int i = 1; i <= numCasosDePrueba; i++) {
			casoDePrueba();
		}
	}

	static void casoDePrueba() {
		String notas = leer.nextLine();
		int puntuacion = 0;
		int puntuacionFinal = 0;
		for (int j = 0; j < notas.length(); j++) {
			if (notas.charAt(j) == 'O') {
				puntuacion += 10;
				puntuacionFinal += puntuacion;
			} else {
				puntuacion = 0;
			}
		}
		System.out.println(puntuacionFinal);
	}
}