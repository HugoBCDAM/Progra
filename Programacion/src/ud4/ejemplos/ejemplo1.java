package ud4.ejemplos;

import java.util.Scanner;

public class ejemplo1 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		double notas [] = new double [4]; 
		int suma = 0;
		
		for (int i = 0; i < notas.length; i++) {
			
			System.out.println("Introduzca una nota");
			notas [i] = leer.nextDouble();
			suma += notas [i];
			
		}
		
		System.out.println("La media de las notas es: " + suma / notas.length);
		
		leer.close();

	}

}
