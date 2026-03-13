package ud4.ejercicios;

import java.util.Scanner;

public class IV_Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int array1[] = new int[10];
		int array2[] = new int[10],cont = 0;
		
		for (int i = 0; i < array1.length; i++) {
			
			array1[i] = leer.nextInt();
			
		}
		
		for (int i = 0; i < array2.length; i++) {
			
			array2[i] = array1[9-i];
			
		}
		
		for (int i = 0; i < array1.length; i++) {
			
			if (array1[i] == array2[i]) {
				
				cont += 1;
				
			}
			
		}
		
		if (cont == 10) {
			
			System.out.println("Es capicúa");
			
		} else {
			
			System.out.println("No es capicúa");
			
		}
		
		leer.close();
	}

}
