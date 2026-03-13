package ud2.ejemplos;

import java.util.Scanner;

public class Ejemplo_1 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		String nombre = "";
		int edad;
		
		System.out.println("Dime tu nombre");
		nombre = leer.nextLine();
		System.out.println("Dime tu edad");
		edad = leer.nextInt();
		
		System.out.println("Hola " + nombre + " tienes " + edad + " años");
		
		leer.close();
	}
	
}
