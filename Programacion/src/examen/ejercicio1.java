package examen;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);

		// Se crea la variable para seleccionar una opción del menú
		int selec;

		// Se crean las variables necesarias para la opción 1.
		int valores, cantValores = 0, multiplo3o5 = 0, menores7 = 0;

		// Se crean las variables necesarias para la opción 2.
		char caracter;

		// Se crean las variables necesarias para la opción 3.
		final int CONST = 5;
		int valor, intentos = 0;
		boolean acertado = false;

		do {

			// Se crea el menú con las distintas opciones a poder realizar.
			System.out.println("--- MENÚ ---");
			System.out.println("1. Análisis numérico");
			System.out.println("2. Vocal o dígito");
			System.out.println("3. Código secreto");
			System.out.println("4. Salir");

			selec = leer.nextInt();

			switch (selec) {

			// Si el usuario pulsa 1, el usuario tendrá que pasar valores por teclado hasta
			// recibir un 0, el cual no se tendrá en cuenta y una vez finalizada,
			// mostrará la cantidad de valores recibidos y el número de valores que son
			// múltiplos de 3 o de 5 y menores que 7
			case 1:

				System.out.println("Introduzca valores");
				do {

					valores = leer.nextInt();
					cantValores++;

					if (valores % 3 == 0 || valores % 5 == 0 && valores != 0) {

						multiplo3o5++;

					}

					if (valores < 7 && valores != 0) {

						menores7++;

					}

				} while (valores != 0);

				System.out.println("La cantidad de valores recibidos es: " + (cantValores - 1));
				System.out.println("La cantidad de valores que son múltiplos de 3 o de 5 son: " + (multiplo3o5 - 1));
				System.out.println("La cantidad de valores que son menores que 7 son: " + menores7);
				System.out.println();
				break;

			// Si el usuario pulsa 2, pasará un carácter por teclado y después el programa
			// mostrará si el carácter es una vocal o un dígito númerico.
			case 2:

				System.out.println("Introduzca un carácter");
				caracter = leer.next().charAt(0);

				if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'
						|| caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O'
						|| caracter == 'U') {

					System.out.println("El carácter introducido es una vocal");
					System.out.println();

				} else {

					System.out.println("El carácter introducido es un dígito numérico");
					System.out.println();

				}

				break;

			// Si el usuario pulsa 3, el usuario deberá adivinar el valor de una constante y
			// tendrá 5 intentos, en el caso en que acierte mostrara "ACIERTO" y si no lo
			// acierta pasadas las 5 oportunidades mostrará "FALLO"
			case 3:

				System.out.println("Adivina el número de la constante");

				do {

					valor = leer.nextInt();
					intentos++;

					if (valor == CONST) {

						System.out.println("ACIERTO");
						System.out.println();
						
						acertado = true;
						
					}

				} while (intentos < 5 || acertado != true);

				if (intentos >= 5 && acertado == false) {

					System.out.println("FALLO");
					System.out.println();

				}
				
				break;

			}

		} while (selec != 4);
		
		System.out.println("Programa terminado");
		leer.close();

	}

}
