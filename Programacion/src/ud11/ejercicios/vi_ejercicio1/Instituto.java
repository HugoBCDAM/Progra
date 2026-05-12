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
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Instituto {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int opcion, edad;
		List<Estudiante> estudiantes = new ArrayList<>();
		String nombre;
		double nota;
		File f;
		do {
			System.out.println("1. Añadir estudiante.\n2. Nota media de los estudiantes.\n3. Ordenar por nombre.\n4. Ordenar por nota"
					+ "\n5. Almacenar en fichero.\n6. Leer de fichero (nota media, al menos, un 5\n0. Salir");
			opcion = leer.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Dime el nombre del estudiante");
				nombre = leer.nextLine();
				System.out.println("Dime la edad del estudiante");
				edad = leer.nextInt();
				System.out.println("Dime la nota del estudiante");
				nota = leer.nextDouble();
				
				estudiantes.add(new Estudiante(nombre, edad, nota));
				break;
			case 2:
				int sumaNotas = 0;
				for (Estudiante e : estudiantes) {
					sumaNotas += e.getNota();
				}
				System.out.println("Nota media de los estudiantes: " + sumaNotas / estudiantes.size());
				break;
			case 3:
				Collections.sort(estudiantes);
				break;
			case 4:
				Collections.sort(estudiantes, new Comparator<Estudiante>() {
					@Override
					public int compare(Estudiante o1, Estudiante o2) {
						if (o1.getNota() > o2.getNota()) {
							return 1;
						} else if (o1.getNota() < o2.getNota()) {
							return -1;
						} else {
							return 0;
						}
					}
				});
				break;
			case 5:
				System.out.println("Dime el fichero que quieres utilizar");
				f = new File(leer.nextLine());
				
				try (PrintWriter pw = new PrintWriter(new FileWriter(f))){
					pw.println("NOMBRE;EDAD;NOTA");
					for (Estudiante e : estudiantes) {
						pw.println(e.getNombre() + ";" + e.getEdad() + ";" + e.getNota());
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				break;
			case 6:
				System.out.println("Dime el fichero de cual leer");
				f = new File(leer.nextLine());
				
				try (BufferedReader br = new BufferedReader(new FileReader(f))) {
					String linea;
					while ((linea = br.readLine()) != null) {
						String[] lineaSeparada = linea.split(";");
						System.out.println(lineaSeparada[0] + "\t" + lineaSeparada[1] + "\t" + lineaSeparada[2]);
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
