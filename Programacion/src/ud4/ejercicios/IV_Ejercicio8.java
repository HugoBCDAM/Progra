package ud4.ejercicios;

import java.util.Scanner;

public class IV_Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		String paises[] = new String[5];
		
		for (int i = 0; i < paises.length; i++) {
			
			paises[i] = leer.next();
			
		}
		
		for (int i = 0; i < paises.length; i++) {
			
			System.out.println(paises[i]);
			
		}
		
		leer.close();
	}

}
