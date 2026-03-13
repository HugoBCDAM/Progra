package ud4.ejercicios;

import java.util.Scanner;

public class VIII_Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		String cad = " ";
		
		System.out.println("Introduzca una palabra");
		cad = leer.nextLine();
		
		cad = cad.replace('a', 'A');
		cad = cad.replace('e', 'E');
		cad = cad.replace('i', 'I');
		cad = cad.replace('o', 'O');
		cad = cad.replace('u', 'U');
		
		System.out.println(cad);
		
		leer.close();

	}

}
