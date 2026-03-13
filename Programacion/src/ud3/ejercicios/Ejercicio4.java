package ud3.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Introduzca el valor de la altura");
		a = leer.nextDouble();
		System.out.println("Introduzca el valor de un lado");
		b = leer.nextDouble();
		System.out.println("Introduzca el valor del otro lado");
		c = leer.nextDouble();
		
			if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
			
				System.out.println("Es un triángulo rectángulo");
			
			} else if (a == b && b == c) {
				
				System.out.println("Es un triángulo equilátero");
			
			} else if (a == c || a == b || b == c){
				
				System.out.println("Es un triángulo isósceles");
			
			} else {
			
				System.out.println("Es un triángulo escaleno");
			
			}
			
			leer.close();
			
		} 
		
	}

