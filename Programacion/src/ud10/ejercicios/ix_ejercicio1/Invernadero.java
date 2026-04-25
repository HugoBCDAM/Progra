package ud10.ejercicios.ix_ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Invernadero {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		List<Planta> plantas = new ArrayList<>();
		int opcion;
		Map<String, Planta> mapaPlantas = new HashMap<>();
		String id;
		
		do {
			System.out.println("\n1. Añadir plantas\n2. Recorrer lista y mostrar información\n"
					+ "3. Regar plantas\n4. Crecer plantas\n5. Calcular y mostrar altura media\n"
					+ "6. Eliminar plantas que no necesiten agua\n7. Buscar una planta\n"
					+ "8. Eliminar una planta\n9. Mostrar todas las plantas\n10. Salir\n");
			opcion = leer.nextInt();
			leer.nextLine();
			
			switch(opcion) {
			case 1: 
				Planta a1 = new Arbol("Roble", "A1", 5.3, 10, "Caduca");
				Planta a2 = new Arbol("Pino", "A2", 7.8, 15, "Perenne");
				
				plantas.add(a1);
				plantas.add(a2);
				mapaPlantas.put(a1.getId(), a1);
				mapaPlantas.put(a2.getId(), a2);
				
				Planta f1 = new Flor("Rosa", "F1", 0.5, "Rojo");
				Planta f2 = new Flor("Tulipán", "F2", 0.4, "Amarillo");
				
				plantas.add(f1);
				mapaPlantas.put(f1.getId(), f1);
				plantas.add(f2);
				mapaPlantas.put(f2.getId(), f2);
				break;
			case 2: 
				for (Planta p : plantas) {
					System.out.println(p.mostrarInformacion());
				}
				break;
			case 3: 
				for (Planta p : plantas) {
					if (p.isNecesitaAgua()) {
						try {
							p.regar();
						} catch (RiegoExcesivoException e) {
							System.out.println(e.getMessage());
						}
					}
				}
				break;
			case 4: 
				for (Planta p : plantas) {
					if (p instanceof Arbol) {
			            ((Arbol)p).crecer();
			        } else if (p instanceof Flor) {
			            ((Flor)p).crecer();
			        }
			    }
				break;
			case 5: 
				double sumAltura = 0;
				for (Planta p : plantas) {	
					sumAltura += p.getAltura();
				}
				
				System.out.println("La altura media de todas las plantas es " + sumAltura / plantas.size());
				break;
			case 6: 
				Iterator<Planta> it = plantas.iterator();
				while (it.hasNext()) {
				    Planta p = it.next();
				    if (!p.isNecesitaAgua()) {
				        it.remove();
				    }
				}
				
				for (Planta p : plantas) {
					System.out.println(p.mostrarInformacion());
				}
				break;
			case 7: 
				System.out.println("Introduzca el id de la planta");
				id = leer.nextLine();
				
				for (Map.Entry<String, Planta> m : mapaPlantas.entrySet()) {
					if (m.getKey().equals(id)) {
						System.out.println(m.getValue().mostrarInformacion());
					}
				}
				break;
			case 8:
				System.out.println("Introduzca el id de la planta");
				id = leer.nextLine();
				
				mapaPlantas.remove(id);
				break;
			case 9:
				for (Map.Entry<String, Planta> m : mapaPlantas.entrySet()) {
					System.out.println(m.getValue().mostrarInformacion());
				}
				break;
			case 10: 
				break;
			}
		} while (opcion != 10);
		
		leer.close();
	}

}
