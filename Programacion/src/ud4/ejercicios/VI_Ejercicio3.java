package ud4.ejercicios;

import java.util.Scanner;

public class VI_Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int n, m, mayor = 0, menor = 0, igual = 0;
		System.out.println("Introduzca la longitud de la matriz");
		n = leer.nextInt();
		
		System.out.println("Introduzca los valores totales dentro de cada celda");
		m = leer.nextInt();
		
		int array[][] = new int[n][m];
		
		System.out.println("Introduzca cada valor");
		
		for (int i = 0; i < array.length; i++ ) {
			
			for (int x = 0; x < array[i].length; x++) {
				
				array[i][x] = leer.nextInt();
				
				if (array[i][x] == 0) {
					
					igual++;
					
				} else if (array[i][x] > mayor) {
					
					mayor++;
					
				} else if (array[i][x] < menor){
					
					menor++;
					
				}
				
			}
			
		}
		
		System.out.println("Hubieron " + igual + " números iguales a 0");
		System.out.println("Hubieron " + mayor + " números mayores que 0");
		System.out.println("Hubieron " + menor + " números menores que 0");
		
		leer.close();
	}

}
