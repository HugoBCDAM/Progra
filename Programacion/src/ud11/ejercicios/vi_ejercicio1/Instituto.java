package ud11.ejercicios.vi_ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Instituto {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		int opcion, edad;
		String nombre;
		double nota, notaMedia = 0;
		List<Estudiante> estudiantes = new ArrayList<>();
		File f;
		do {
			System.out.println("*** MENÚ ***\n1. Añadir estudiante. Lo añadirá a la lista\n2. Nota media. Calculará la nota media de todos los estudiantes almacenados\n3. Ordenar por nombre. Mostrará la lista ordenada "
					+ "alfabéticamente por nombre.\n4. Ordenar por nota. Mostrará la lista ordenada alfabéticamente por nota media\n5. Almacenar en fichero. Almacenará todos los estudiantes de la lista en un fichero "
					+ "llamado estudiantes.txt\n6. Leer de fichero. Leyendo del fichero estudiantes.txt, mostrará aquellos que tengan como nota media, al menos, un 5\n0. Salir");
			opcion = leer.nextInt();
			
			switch (opcion) {
			case 1:
				leer.nextLine();
				System.out.println("Dime el nombre del estudiante");
				nombre = leer.nextLine();
				System.out.println("Dime la edad del estudiante");
				edad = leer.nextInt();
				System.out.println("Dime la nota del estudiante");
				nota = leer.nextDouble();
				
				estudiantes.add(new Estudiante(nombre, edad, nota));
				break;
			case 2:
				for (Estudiante e : estudiantes) {
					notaMedia += e.getNotaMedia();
				}
				
				System.out.println("Nota media de los estudiantes: " + notaMedia / estudiantes.size());
				break;
			case 3:
				Collections.sort(estudiantes);
				System.out.println("Lista ordenada por nombre: ");
				for (Estudiante e : estudiantes) {
					System.out.println(e);
				}
				break;
			case 4:
				Collections.sort(estudiantes, new EstudiantePorNota());
				System.out.println("Lista ordenada por nota: ");
				for (Estudiante e : estudiantes) {
					System.out.println(e);
				}
				break;
			case 5:
				f = new File("estudiantes.txt");
				
				try (PrintWriter pw = new PrintWriter(new FileWriter(f))){
					pw.println("NOMBRE-EDAD-NOTA");
					for (Estudiante e : estudiantes) {
						pw.println(e.getNombre() + "-" + e.getEdad() + "-" + e.getNotaMedia());
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				break;
			case 6:
				f = new File("estudiantes.txt");
				
				try (BufferedReader br = new BufferedReader(new FileReader(f))){
					String linea;
					String[] separacion;
					
					br.readLine();
					System.out.println("NOMBRE\tEDAD\tNOTA");
					while ((linea = br.readLine()) != null) {
						separacion = linea.split("-");
						if (Integer.parseInt(separacion[1]) >= 5) {
							System.out.println(separacion[0] + "\t" + separacion[1] + "\t" + separacion[2]);
						}
					}
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				break;
			}
		} while (opcion != 0);
		
		leer.close();
	}
}
