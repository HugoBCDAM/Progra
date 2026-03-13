package ud4.ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int n;
		System.out.println("Cuantas personas son");
		n = leer.nextInt();
		
		double alturas[] = new double[n];
		int contMax  = 0, contMin = 0;
		
		System.out.println("Introduzca las alturas correspondientes a cada persona");
		alturas[0] = leer.nextDouble();
		
		double media = alturas[0];
		
		double max = alturas[0], min = alturas[0];
		
		for (int i = 1; i < alturas.length; i++) {
			
			alturas[i] = leer.nextDouble();
			
			media += alturas[i];
			
			if (alturas[i] > max) {
				
				max = alturas[i];
				
			} else if (alturas[i] < min) {
				
				min = alturas[i];
				
			}
			
		}
		
		media /= n;
		for (int i = 0; i < alturas.length; i++) {
			
			if (alturas[i] > media) {
				
				contMax += 1;
				
			} else if (alturas[i] < media) {
				
				contMin += 1;
				
			}
			
		}
		
		System.out.println("La altura media es " + media + ", la altura máxima es " + max + " y la altura mínima es " + min);
		System.out.println("Hay " + contMax + " personas que miden por encima de la media y " + contMin + " por debajo");
		
		leer.close();
	}

}
