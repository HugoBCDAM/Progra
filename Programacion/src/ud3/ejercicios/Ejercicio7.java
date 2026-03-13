package ud3.ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("--- MENÚ PRINCIPAL ---");
		System.out.println("1. Iniciar Sesión");
		System.out.println("2. Registrarse");
		System.out.println("3. Recuperar contraseña");
		System.out.println("4. Salir");
		
		int opcion;
		System.out.println("Introduzca una opción");
		opcion = leer.nextInt();

		switch (opcion) {
			case 1:
				System.out.println("Has elegido Iniciar sesión");
				break;
			case 2:
				System.out.println("Has elegido Registrarse");
				break;
			case 3:
				System.out.println("Has elegido Recuperar contraseña");
				break;
			case 4:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción no válida");
		}
		
		leer.close();
	}

}
