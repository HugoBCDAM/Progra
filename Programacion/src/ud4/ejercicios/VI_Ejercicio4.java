package ud4.ejercicios;

import java.util.Scanner;

public class VI_Ejercicio4 {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		double notas[][] = new double[4][5], media = 0, minima, maxima, cont = 0;

		System.out.println("Introduzca las notas del Alumno 1");
		notas[0][0] = leer.nextDouble();

		maxima = notas[0][0];
		minima = maxima;

		for (int j = 1; j < 5; j++) {

			notas[0][j] = leer.nextDouble();
			cont++;

			if (notas[0][j] > maxima) {

				maxima = notas[0][j];

			} else if (notas[0][j] < minima) {

				minima = notas[0][j];

			}
			
			media += notas[0][j];

		}
		
		media /= 5;

		for (int i = 1; i < notas.length; i++) {
			
			for (int p = 0; p < 1; p++) {

				System.out.println("La nota máxima del Alumno " + (p + 1) + " es: " + maxima);
				System.out.println("La nota máxima del Alumno " + (p + 1) + " es: " + minima);
				System.out.println("La nota media del Alumno " + (p + 1) + " es: " + media);

			}
			
			media = 0;
			
			if (cont > 0) {

				System.out.println("Introduzca las notas del Alumno " + (i + 1));

			}

			for (int x = 0; x < notas[i].length; x++) {

				notas[i][x] = leer.nextDouble();

				if (notas[i][x] > maxima) {

					maxima = notas[i][x];

				} else if (notas[i][x] < minima) {

					minima = notas[i][x];

				}
				
				media += notas[i][x];

			}
			
			media /= 5;

			cont++;

		}
		
		leer.close();
	}

}
