package ud4.ejercicios;

import java.util.Scanner;

public class X_Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca los correos separados por coma (,)");
		String correos = leer.next();
		correos = correos.replaceAll(" ", " ");
		String correo[] = correos.trim().split(",");
		boolean arroba = false;
		
		System.out.println("Los correos válidos son:");
		for (int i = 0; i < correo.length; i++) {
			
			for (int x = 0; x < correo[i].length(); x++) {
				
				
				
				if (correo[i].charAt(x) == '@') {
					
					arroba = true;
					
				}
				
				if (arroba == true && correo[i].charAt(x) == '.') {
					
					System.out.println(correo[i]);
					arroba = false;
					
				}
				
			}
			
		}
		
		leer.close();
	}	
		
}
