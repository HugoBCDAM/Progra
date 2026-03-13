package ud6_7.ejercicios.i_ejercicio2;

import java.util.Scanner;

public class MainPersona {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		Persona p1 = new Persona("123456A", "Hugo", "Busto Caixal", 19);
		Persona p2 = new Persona();
		
		p2.setDni("98765B");
		
		System.out.println("El dni de Persona 2 es " + p2.getDni());
		System.out.println("El nombre de Persona 2 es " + p2.getNombre());
		
		System.out.println("PERSONA 1:");
		p1.imprime();
		
		boolean edad = p1.esMayorEdad();
		boolean jubilado = p1.esJubilado();
		
		System.out.println(edad);
		System.out.println(jubilado);
		
		leer.close();

	}

}
