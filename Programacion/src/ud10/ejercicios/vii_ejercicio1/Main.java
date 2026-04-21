package ud10.ejercicios.vii_ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Carlos", 18);
		Persona p2 = new Persona("Ana", 25);
		Persona p3 = new Persona("Alberto", 30);
		Persona p4 = new Persona("Alba", 16);
		Persona p5 = new Persona("Rodrigo", 22);
		
		Map<String, Integer> personas = new HashMap<>();
		personas.put(p1.getNombre(), p1.getEdad());
		personas.put(p2.getNombre(), p2.getEdad());
		personas.put(p3.getNombre(), p3.getEdad());
		personas.put(p4.getNombre(), p4.getEdad());
		personas.put(p5.getNombre(), p5.getEdad());
		
		System.out.println("Personas:");
		for (Map.Entry<String, Integer> valores : personas.entrySet()) {
			System.out.println(valores.getKey() + ", " + valores.getValue());
		}
		
		p1.setEdad(p1.getEdad() + 2);
		personas.put(p1.getNombre(), p1.getEdad());
		
		personas.remove(p3.getNombre());
		
		System.out.println("\nPersonas después de modificaciones:");
		for (Map.Entry<String, Integer> valores2 : personas.entrySet()) {
			System.out.println(valores2.getKey() + ", " + valores2.getValue());
		}
		
		int sumaEdad = 0;
		
		for (Map.Entry<String, Integer> valores2 : personas.entrySet()) {
			sumaEdad += valores2.getValue();
		}
		
		System.out.println("\nMedia de edad:" + sumaEdad / personas.size());
		
	}

}
