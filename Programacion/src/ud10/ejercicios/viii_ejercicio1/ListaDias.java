package ud10.ejercicios.viii_ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListaDias {

	public static void main(String[] args) {
		
		List<String> listDias = new ArrayList<>();
		List<String> listDias2 = new ArrayList<>();
		
		listDias.add("Lunes");
		listDias.add("Martes");
		listDias.add("Miércoles");
		listDias.add("Jueves");
		listDias.add("Viernes");
		listDias.add("Sábado");
		listDias.add("Domingo");
		
		System.out.println("Lista de días inicial: " + listDias);
		
		listDias.add(4, "Juernes");
		
		listDias2.addAll(listDias);
		
		listDias.addAll(listDias2);
		
		System.out.println("Posición 3: " + listDias.get(3) + "\nPosición 4: " + listDias.get(4));
		
		System.out.println("Primer elemento: " + listDias.get(0) + "\nÚltimo elemento: " + listDias.get(listDias.size() - 1));
		
		Iterator<String> it = listDias.iterator();
		
		while (it.hasNext()) {
			if (it.next().equalsIgnoreCase("Juernes")) {
				it.remove();
			}
		}
		
		System.out.print("Lista eliminando \"Juernes\": [ ");
		
		Iterator<String> it2 = listDias.iterator();
		
		while (it2.hasNext()) {
			System.out.print(it2.next() + " ");
		}
		
		System.out.print("]");
		
		boolean existeLunes = false;
		
		if (listDias.contains("Lunes") || listDias.contains("lunes")) {
			existeLunes = true;
		}
		
		System.out.println("\n¿Existe lunes?: " + existeLunes);
		
		Collections.sort(listDias);
		
		System.out.println("Lista ordenada: " + listDias);
		
		listDias.clear();
		System.out.println("Lista eliminada: " + listDias);
		
	}

}
