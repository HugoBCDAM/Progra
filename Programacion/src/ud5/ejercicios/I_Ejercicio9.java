package ud5.ejercicios;

import java.util.Scanner;

public class I_Ejercicio9 {
	
	public static int sumatorio (int numero) {
		
		int suma = 0;
		for (int i = 1; i <= numero; i++) {
			
			suma += i;
			
		}
		
		return suma;
		
	}
	
	public static int productorio (int numero) {
		
		int producto = 0;
		if (numero != 0) {
			
			producto = 1;
			for (int i = 1; i <= numero; i++) {
			
				producto *= i;
			
			}
			
		}
		
		return producto;
		
	}
	
	public static double intermedio (int numero) {
		
		double suma = 0.0;
		
		for (int i = 1; i <= numero; i++) {
			
			suma++;
			
		}
		
		double intermedio = suma / 2;
		
		return intermedio;
		
	}
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		int numero = leer.nextInt();
		
		System.out.println("El sumatorio desde 1 hasta " + numero + " es: " + sumatorio(numero));
		System.out.println("El productorio desde 1 hasta " + numero + " es: " + productorio(numero));
		System.out.println("El intermedio desde 1 hasta " + numero + " es: " + intermedio(numero));
		
		leer.close();
		
	}
	
}
