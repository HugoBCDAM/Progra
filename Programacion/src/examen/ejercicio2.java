package examen;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		int ejercicio[] = new int[5];
		double agua[] = new double[5];
		double suenio[] = new double[5];
		
		// Se rellena cada vector
		for (int i = 0; i < ejercicio.length; i++) {

			ejercicio[i] = (int) (Math.random() * (180 + 1));
			agua[i] = Math.random() * (5 + 1);
			suenio[i] = Math.random() * (24 + 1);

		}

		// Se pasa por pantalla los valores de cada vector
		System.out.println("Los datos de cada día de ejercicio son: ");

		for (int i = 0; i < ejercicio.length; i++) {

			System.out.println(ejercicio[i]);

		}

		System.out.println();
		System.out.println("Los datos de cada día de agua son: ");

		for (int i = 0; i < ejercicio.length; i++) {

			System.out.println(agua[i]);

		}

		System.out.println();
		System.out.println("Los datos de cada día de sueño son: ");

		for (int i = 0; i < ejercicio.length; i++) {

			System.out.println(suenio[i]);

		}

		// Se realiza un bucle para buscar el día en el que hizo menos ejercicio.
		double menorEjercicio = ejercicio[0];
		int diaMenor = 0;

		for (int i = 1; i < ejercicio.length; i++) {

			if (ejercicio[i] < menorEjercicio) {

				menorEjercicio = ejercicio[i];
				diaMenor = i;

			}

		}

		System.out.println();
		System.out.println("*** HÁBITOS SALUDABLES ***");

		// Muestra por pantalla el día que hizo menos ejercicio
		if (diaMenor == 0) {

			System.out.println("El día que ha realizado menos ejercicio es el lunes.");

		} else if (diaMenor == 1) {

			System.out.println("El día que ha realizado menos ejercicio es el martes.");

		} else if (diaMenor == 2) {

			System.out.println("El día que ha realizado menos ejercicio es el miércoles.");

		} else if (diaMenor == 3) {

			System.out.println("El día que ha realizado menos ejercicio es el jueves.");

		} else if (diaMenor == 4) {

			System.out.println("El día que ha realizado menos ejercicio es el viernes.");

		}

		// Se realiza un bucle para hacer el promedio del agua bebida y luego lo muestra
		// por pantalla.
		double promedioAgua = 0;

		for (int i = 0; i < agua.length; i++) {

			promedioAgua += agua[i];

		}

		System.out.println("El promedio de agua bebida es de " + (promedioAgua / agua.length) + " litros.");

		// Se realiza un bucle para saber cuantos días ha tenido buen descanso y luego
		// lo muestra por pantalla.
		int dias = 0;

		for (int i = 0; i < suenio.length; i++) {

			if (suenio[i] >= 6) {

				dias++;

			}

		}

		System.out.println(dias + " días ha dormido al menos 6 horas.");

		// Se realiza un bucle para saber cuantos días han sido saludables y luego lo
		// muestra por pantalla.
		int diasSaludables = 0;

		for (int i = 0; i < suenio.length; i++) {

			if (ejercicio[i] >= 20 && agua[i] >= 1.5 && suenio[i] >= 7) {

				diasSaludables++;

			}

		}

		System.out.println("De los 5 días, " + diasSaludables + " han sido saludables.");
		System.out.println();

		double datosDias[][] = new double[3][5];

		for (int i = 0; i < 1; i++) {

			for (int x = 0; x < datosDias[i].length; x++) {

				datosDias[i][x] = ejercicio[x];

			}

		}

		for (int i = 1; i < 2; i++) {

			for (int x = 0; x < datosDias[i].length; x++) {

				datosDias[i][x] = agua[x];

			}

		}

		for (int i = 2; i < 3; i++) {

			for (int x = 0; x < datosDias[i].length; x++) {

				datosDias[i][x] = suenio[x];

			}

		}

		System.out.println("Al meter todo en una matriz se quedaría así:");
		for (int i = 0; i < datosDias.length; i++) {

			for (int x = 0; x < datosDias[i].length; x++) {

				System.out.print(datosDias[i][x] + "\t");

			}

			System.out.println();

		}

		int fila, desp;
		System.out.println();
		System.out.println("Introduzca el hábito a modificar (0 = Ejercicio, 1 = Agua, 2 = Sueño)");
		fila = leer.nextInt();

		System.out.println("Introduzca la dirección de desplazamiento (1 = Izquierda, 2 = Derecha)");
		desp = leer.nextInt();

		System.out.println();
		System.out.println("Antes:");
		for (int i = 0; i < datosDias[0].length; i++) {

			System.out.print(datosDias[fila][i] + " ");

		}

		if (desp == 2) {

			double columna = datosDias[fila][4];

			for (int i = (datosDias[0].length - 1); i > 0; i--) {

				datosDias[fila][i] = datosDias[fila][i - 1];

			}

			datosDias[fila][0] = columna;

			System.out.println();
			System.out.println("Después (desplazamiento a la derecha):");
			for (int i = 0; i < datosDias[0].length; i++) {

				System.out.print(datosDias[fila][i] + " ");

			}

		}

		if (desp == 1) {

			double columna = datosDias[fila][0];

			for (int i = 0; i < (datosDias[0].length - 1); i++) {

				datosDias[fila][i] = datosDias[fila][i + 1];

			}

			datosDias[fila][4] = columna;

			System.out.println();
			System.out.println("Después (desplazamiento a la izquierda):");
			for (int i = 0; i < datosDias[0].length; i++) {

				System.out.print(datosDias[fila][i] + " ");

			}

		}

		leer.close();

	}

}
