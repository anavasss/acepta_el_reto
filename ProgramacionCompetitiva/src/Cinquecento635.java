import java.util.Scanner;

public class Cinquecento635 {
	
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
		
		double anio = leer.nextDouble();
		
		double numero = anio/100;
		
		double siglo = Math.ceil(numero);
		
		System.out.println((int)siglo);
		
	}
}