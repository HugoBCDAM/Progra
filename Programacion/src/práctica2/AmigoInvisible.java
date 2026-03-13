package práctica2;

import java.util.Scanner;

public class AmigoInvisible {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		int cantPersonas;
		System.out.println("¿Cúantas personas participarán en el Amigo Invisible?");
		cantPersonas = leer.nextInt();

		String nombre;
		String nombres[] = new String[cantPersonas];

		String primeraLetra;
		String restoLetras;

		System.out.println("Introduzca los nombres");

		for (int i = 0; i < nombres.length; i++) {

			do {

				nombre = leer.next();

				if (nombre == " ") {

					System.out.println("Introduzca un nombre válido");

				}

			} while (nombre == " ");

			nombre.trim();
			primeraLetra = nombre.substring(0, 1).toUpperCase();
			restoLetras = nombre.substring(1);
			nombre = primeraLetra + restoLetras;

			nombres[i] = nombre;

		}

		String preferencias[][] = new String[cantPersonas][2];

		System.out.println("Introduzca las preferencias en cuanto al color de cada participante");

		for (int i = 0; i < preferencias.length; i++) {

			for (int x = 0; x < preferencias[i].length - 1; x++) {
				
				do {
					
					System.out.println("Introduzca un color entre rojo, verde, dorado o blanco");
					preferencias[i][x] = leer.next();
					preferencias[i][x].trim().toLowerCase();

				} while (!preferencias[i][x].equals("rojo") && !preferencias[i][x].equals("verde") && !preferencias[i][x].equals("dorado") && !preferencias[i][x].equals("blanco"));
				
			}

		}
		
		System.out.println("Introduzca las preferencias en cuanto al tipo de regalo preferido de cada participante");

		for (int i = 0; i < preferencias.length; i++) {

			for (int x = preferencias[i].length - 1; x < preferencias[i].length; x++) {

				do {
					
					System.out.println("Introduzca un regalo preferido entre dulces, manualidades, ropa o accesorios");
					preferencias[i][x] = leer.next();
					preferencias[i][x].trim().toLowerCase();

				} while (!preferencias[i][x].equals("dulces") && !preferencias[i][x].equals("manualidades") && !preferencias[i][x].equals("ropa") && !preferencias[i][x].equals("accesorios"));

			}

		}
		
		leer.close();
	}

}
