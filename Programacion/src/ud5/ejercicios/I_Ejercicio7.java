package ud5.ejercicios;

import java.util.Scanner;

public class I_Ejercicio7 {
	
	public static double precioIVA (double precio) {
		
		double precioConIVA = precio * 1.21;
		return precioConIVA;
		
	}
	
	public static double IVA_aumentado (double precio) {
		
		double IVAaumentado = precio * 0.21;
		return IVAaumentado;
		
	}
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		double precio;
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Introduzca el precio");
			precio = leer.nextDouble();
			
			System.out.println("El precio con IVA es de: " + precioIVA(precio));
			System.out.println();
			
			System.out.println("El IVA aumentado es de: " + IVA_aumentado(precio));
			System.out.println();
			
		}
		
		leer.close();
		
	}
}
