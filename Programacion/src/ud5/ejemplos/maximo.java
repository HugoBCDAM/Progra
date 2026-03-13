package ud5.ejemplos;

import java.util.Scanner;

public class maximo {
	
	public static int mayor (int a, int b, int c) {
		
		int max = 0;
		if (a > b && a > c) {
			
			max = a;
			
		} else if (b > a && b > c) {
			
			max = b;
			
		} else if (c > a && c > b) {
			
			max = c;
			
		}
		
		return max;
		
	}
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int uno, dos, tres, resul = 0;
		System.out.println("Introduzca numeros y le dire el maximo");
		uno = leer.nextInt();
		dos = leer.nextInt();
		tres = leer.nextInt();
		
		resul = mayor(uno, dos, tres);		
		System.out.println(resul);
		
		leer.close();
		
	}
	
	
}
