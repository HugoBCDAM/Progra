package ud10.ejercicios.vi_ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<String, Integer> edades = new HashMap<>();
		String[] palabras = {"hola", "adios", "hola", "java", "java", "java"};
		Map<Integer, String> palabras2 = new HashMap<>();
		edades.put("Ana", 18);
		edades.put("Carlos", 20);
		edades.put("Juan", 16);
		
		System.out.println("Todos los valores:");
		for (Map.Entry<String, Integer> valores : edades.entrySet()) {
			System.out.println(valores.getKey() + ", " + valores.getValue());
			if (valores.getValue() > 18) {
				System.out.println(valores.getKey() + ", " + valores.getValue());;
			}
		}
		
		System.out.println("Total de palabras:");
		int total = 0;
		for (int i = 0; i < palabras.length; i++) {
			if (!palabras2.containsValue(palabras[i])) {
				palabras2.put(i, palabras[i]);
				total++;
			} 
		}
		
		System.out.println(total);
		
	}

}
