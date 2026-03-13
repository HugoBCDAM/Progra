package ud3.ejercicios;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		
		Scanner leer = new Scanner(System.in);
		int nota, edad;
		char genero = ' ';
		nota = 0;
		edad= 0;
		
		System.out.println("Introduzca una nota");
		nota = leer.nextInt();
		System.out.println("Introduzca la edad");
		edad = leer.nextInt();
		leer.nextLine();
		System.out.println("Introduzca el género");
		genero = (char)System.in.read();
		if (nota >= 5 && edad >= 18) {
			if (genero == 'F' || genero == 'f') {
				System.out.println("ACEPTADA");
			} else if (genero == 'M' || genero == 'm') {
				System.out.println("ACEPTADO");
			}
		} else {
			System.out.println("NO ACEPTADO/A");
		}
		leer.close();
	}
}
