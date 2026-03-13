package ud5.ejercicios;

import java.util.Scanner;

public class II_Ejercicio2 {

	public static int sumaArray(int array[]) {

		int suma = 0;

		for (int i = 0; i < array.length; i++) {
			
			suma += array[i];
			
		}

		return suma;

	}

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		int numeros[] = new int[5];
		System.out.println("Introduzca números");

		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = leer.nextInt();

		}
		
		System.out.println("La suma de todos los números es: " + sumaArray(numeros));

		leer.close();
		
	}
}
