package Práctica1;

import java.util.Scanner;

public class Misión_Intergaláctica {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		
		// Se crea la variable para la selección del menú
		int selec;

		// Se crea una constante para almacenar el número correcto de la potencia,
		// en este caso se hace de forma aleatoria nada más ejecutar el código.
		// Y también se crean las variables necesarias para la selección 1.
		final int POTENCIA = (int) (Math.random() * (100 + 1)); 
		int valores, intentos = 0;
		boolean motorCalibrado = false;
		
		// Se crean las variables necesarias para la selección 2.
		char sector;
		int cuadrante, anio;
		boolean coordenadasValidas = false;
		
		// Se crea la variable para almacenar la energía y luego poder mostrarla en la selección 3.
		int energia = 0;
		
		//Se crean las variables necesarias para la selección 5.
		String tripulantes[] = new String[5];
		boolean completo = false;
		int antiguo = 0;
		
		// Se crean las variables necesarias para la selección 6.
		int temperaturas[][] = new int[3][3], media = 0, contSistema = 1;

		do {

			// Se hace el menú donde aparecerán las distintas opciones elegibles.
			System.out.println("--- CENTRO DE CONTROL ---");
			System.out.println();
			System.out.println("1. Calibar los motores de la nave");
			System.out.println("2. Introducir coordenadas de destino");
			System.out.println("3. Mostrar energía estelar acumulada");
			System.out.println("4. Iniciar el salto interestelar");
			System.out.println("5. Tripulación registrada");
			System.out.println("6. Diagnóstico del sistema");
			System.out.println("0. Salir");

			selec = leer.nextInt();
			
			switch (selec) {

			// Si el usuario pulsa 1, empezará un bucle el cual pedirá que introduzca
			// valores hasta que adivine el nivel correcto de potencia y suma 10 a la
			// energía estelar.
			case 1:

				do {

					System.out.println("Introduce el nivel de potencia:");
					valores = leer.nextInt();
					intentos++;

					if (valores < POTENCIA) {

						System.out.println("El valor introducido es bajo.");
						System.out.println();

					} else if (valores > POTENCIA) {

						System.out.println("El valor introducido es mayor.");
						System.out.println();

					} else {

						System.out.println("¡Correcto! Introdujiste el valor correcto de la potencia.");
						System.out.println("El número de intentos hasta acertar es de: " + intentos + ".");
						System.out.println();
						energia += 10;

						motorCalibrado = true;

					}

				} while (valores != POTENCIA);

				break;

			// Si el usuario pulsa 2, empezará un bucle el cual pedirá que introduzca
			// valores para el sector, el cuadrante y el año.
			// Si el sector no está entre la A y la Z en mayúsculas, es decir si estuvieran
			// en minúsculas, o el cuadrante no estuviera entre 1 y 10 o el año no fuese
			// mayor a 2200,
			// le mostrará un mensaje de que las coordenadas no están correctas y que lo
			// intente de nuevo.
			// En el caso en el que sea correcto le mostrará un mensaje que dice que las
			// coordenadas están cargadas con éxito y le suma 5 a la energía estelar.
			case 2:

				do {

					System.out.print("Introduce el sector (A-Z): ");
					sector = leer.next().charAt(0);

					System.out.print("Introduce el cuadrante (1-10): ");
					cuadrante = leer.nextInt();

					System.out.print("Introduce el año (+2200): ");
					anio = leer.nextInt();

					if (sector >= 'a' && sector <= 'z' || cuadrante < 1 || cuadrante > 10 || anio < 2200) {

						System.out.println("Coordenadas incorrectas. Reintenta la entrada.");

					}

					if (sector >= 'A' && sector <= 'Z' && cuadrante >= 1 && cuadrante <= 10 && anio >= 2200) {

						System.out.println("Coordenadas cargadas con éxito. Nave lista para el salto.");
						energia += 5;

						coordenadasValidas = true;

					}

					System.out.println();

				} while (sector >= 'a' && sector <= 'z' || cuadrante < 1 || cuadrante > 10 || anio < 2200);

				break;

			// Si el usuario pulsa 3, mostrará la cantidad de energía estelar acumulada.
			case 3:

				System.out.println("Tu energía estelar actual es de " + energia + " unidades.");
				System.out.println();

				break;

			// Si el usuario pulsa 4, mostrará un mensaje de despegue exitoso siempre y
			// cuando haya calibrado los motores, establecido las coordenadas
			// y teniendo 10 o más de energía.
			// Si alguna de estas condiciones no está completada, mostrará un mensaje de
			// error por condición incompleta.
			case 4:

				if (motorCalibrado == false) {

					System.out.println("Error: motores sin calibrar.");

				}

				if (coordenadasValidas == false) {

					System.out.println("Error: coordenadas no establecidas.");

				}

				if (energia < 10) {

					System.out.println("Error: energía insuficiente para el salto.");

				}

				if (motorCalibrado == true && coordenadasValidas == true && energia >= 10) {

					energia -= 10;

					System.out.println("¡Despegue exitoso! La nave Aurora IX ha iniciado su salto interestelar.");

				}

				System.out.println();

				break;

			// Si el usuario pulsa 5, se le pedirá que introduzca los nombres de los
			// tripulantes y en caso de que ya estén registrados, reemplazará al más
			// antíguo.
			case 5:

				if (completo == false) {

					System.out.println("No hay ningún tripulante registrado.");
					System.out.println("Introduzca los nombres de los tripulantes: ");

					for (int i = 0; i < tripulantes.length; i++) {

						tripulantes[i] = leer.next();

					}

					System.out.println("Tripulantes registrados.");
					System.out.println();
					System.out.println("Los tripulantes son:");
					System.out.println();
					
					for (int i = 0; i < tripulantes.length; i++) {
						
						System.out.print(tripulantes[i] + " ");
						
					}
					
					System.out.println();
					completo = true;

				} else if (completo == true) {

					System.out.println("Ya hay 5 tripulantes, si deseas añadir uno más, se reemplazará al más antiguo.");
					System.out.println("Introduzca el nombre del tripulante:");
					tripulantes[antiguo] = leer.next();
					
					System.out.println("Tripulante registrado.");
					System.out.println();
					System.out.println("Los tripulantes ahora son: ");
					System.out.println();
					
					if (antiguo < 5) {

						antiguo++;

					} else {

						antiguo = 0;

					}
					
					for (int i = 0; i < tripulantes.length; i++) {
						
						System.out.print(tripulantes[i] + " ");
						
					}
					
					System.out.println();

				}

				System.out.println();

				break;

			// Si el usuario pulsa 6, le pedirá que introduzca las temperatuas de los 3
			// sistemas y sus 3 sensores y los almacenará,
			// luego escribirá la temperatura promedio de cada sistema.
			case 6:

				System.out.println("Introduce las temperaturas de los 3 sistemas y sus 3 sensores:");
				System.out.println();

				for (int i = 0; i < temperaturas.length; i++) {

					for (int x = 0; x < temperaturas[i].length; x++) {

						System.out.print("Sistema " + contSistema + ", ");
						System.out.print("Sensor " + (x + 1) + ": ");
						temperaturas[i][x] = leer.nextInt();

					}

					contSistema++;

				}

				System.out.println();
				System.out.println("Temperaturas promedio por sistema:");
				System.out.println();

				for (int i = 0; i < temperaturas.length; i++) {

					media = 0;
					System.out.print("Sistema " + (i + 1) + ": ");

					for (int x = 0; x < temperaturas[i].length; x++) {

						media += temperaturas[i][x];

					}

					System.out.println(media / 3 + " °C");

				}

				System.out.println();

				break;
				
			default:
				
				// Si el usuario pulsa cualquier cosa que no sea lo que aparece en el menú, le
				// pedirá que introduzca una opción válida.
				if (selec < 0 || selec > 5) {
					
					System.out.println("¡ERROR! Introduzca una opción válida.");

				}
				
				System.out.println();
				
			}

		} while (selec != 0);
		
		System.out.println("Cerrando sistemas de navegación... ¡Hasta el próximo viaje, piloto!");

		leer.close();

	}

}
