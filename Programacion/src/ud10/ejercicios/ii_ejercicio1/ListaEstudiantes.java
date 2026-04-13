package ud10.ejercicios.ii_ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEstudiantes {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		List<String> listaEstudiantes = new ArrayList<>();
		int selec = 0, posicion;
		String estudiante;
		
		do {
			System.out.println("1. Agregar estudiante\n2. Insertar estudiante en una posición\n3. Modificar el nombre de un estudiante"
					+ "\n4. Eliminar un estudiante\n5. Mostrar lista");
			System.out.println("\nSelecciona una opción del menú (1-4)");
			selec = leer.nextInt();
			leer.nextLine();
			switch (selec) {
			case 1: 
				System.out.println("\nDime el nombre del estudiante");
				estudiante = leer.nextLine();
				listaEstudiantes.add(estudiante);
				break;
			case 2: 
				System.out.println("\nDime el nombre del estudiante");
				estudiante = leer.nextLine();
				System.out.println("Dime la posición del estudiante");
				posicion = leer.nextInt();
				listaEstudiantes.add(posicion, estudiante);
				break;
			case 3: 
				System.out.println("\nDime el nombre nuevo del estudiante");
				estudiante = leer.nextLine();
				System.out.println("Dime la posición del estudiante");
				posicion = leer.nextInt();
				listaEstudiantes.set(posicion, estudiante);
				break;
			case 4: 
				System.out.println("\nDime el nombre del estudiante a eliminar");
				estudiante = leer.nextLine();
				
				for (int i = 0; i < listaEstudiantes.size(); i++ ) {
					if (listaEstudiantes.get(i).equals(estudiante)) {
						listaEstudiantes.remove(i);
						break;
					}
				}
				break;
			case 5:
				System.out.println("\nLista de estudiantes:");
				System.out.println(listaEstudiantes + "\n");
				break;
			default: break;
			}
		} while (selec > 0);
		
		leer.close();

	}

}
