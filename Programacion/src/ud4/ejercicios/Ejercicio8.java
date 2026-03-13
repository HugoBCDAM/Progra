package ud4.ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);

		double num[] = new double [100], r;
		int contIgual = 0, contSuperior = 0, contMenor = 0;
		
		for (int i = 0; i < num.length; i++) {
			
			num[i] = Math.random();
			
		}
		
		System.out.println("Introduzca un número real entre 0 y 1");
		r = leer.nextDouble();
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i] == r) {
				
				contIgual += 1;
				
			} else if (num[i] > r) {
				
				contSuperior += 1;
				
			} else {
				
				contMenor += 1;
				
			}
		}
		
		System.out.println("Hubieron " + contMenor + " números menores al introducido, " + contIgual + " números iguales y " + contSuperior + " números superiores);");
		
		leer.close();
		
	}

}
