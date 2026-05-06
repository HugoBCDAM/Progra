package ud11.ejercicios.iii_ejercicio5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Biblioteca {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		File f = new File("biblioteca.csv");
		Map<String, Libro> catalogo = new HashMap<>();
		
		if (f.exists()) {
			try (BufferedReader br = new BufferedReader(new FileReader(f))) {
				String linea;
				String[] palabras;
				
				linea = br.readLine();
				while ((linea = br.readLine()) != null) {
					palabras = linea.split(";");
					catalogo.put(palabras[0], new Libro(palabras[0], palabras[1], palabras[2], Integer.parseInt(palabras[3])));
				}
				
				System.out.println("Catálogo completo de libros:\n ");
				try (BufferedReader br2 = new BufferedReader(new FileReader(f))) {
				    int valor;
				    while ((valor = br2.read()) != -1) {
				        char caracter = (char) valor;
				        if (caracter == ';') {
				            System.out.print("\t");
				        } else {
				            System.out.print(caracter);
				        }
				    }
				}
				System.out.println();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		String isbn, titulo, autor;
		int opcion, ejemplares;
		do {
			System.out.println("1. Añadir libro\n2. Buscar libro\n3. Actualizar número de ejemplares\n4. Eliminar libro\n5. Salir");
			opcion = leer.nextInt();
			
			switch (opcion) {
			case 1:
				leer.nextLine();
				System.out.println("Indica el isbn");
				isbn = leer.nextLine();
				System.out.println("Indica el titulo");
				titulo = leer.nextLine();
				System.out.println("Indica el autor");
				autor = leer.nextLine();
				System.out.println("Indica el número de ejemplares");
				ejemplares = leer.nextInt();
				
				Libro l = new Libro(isbn, titulo, autor, ejemplares);
				catalogo.put(l.getIsbn(), l);
				
				break;
			case 2:
				leer.nextLine();
				System.out.println("Dime el isbn");
				isbn = leer.nextLine();
				System.out.println("Información del libro:");
				
				for (Map.Entry<String, Libro> entry : catalogo.entrySet()) {
					if (entry.getKey().equals(isbn)) {
						System.out.println(entry.getValue().toString() + "\n");
					}
				}
				break;
			case 3:
				leer.nextLine();
				System.out.println("Dime el isbn del libro del cual quieres actualizar sus ejemplares");
				isbn = leer.nextLine();
				System.out.println("Cuántos ejemplares tendrá");
				ejemplares = leer.nextInt();
				
				for (Map.Entry<String, Libro> entry : catalogo.entrySet()) {
					if (entry.getKey().equals(isbn)) {
						entry.getValue().setEjemplaresDispo(ejemplares);
					}
				}
				
				break;
			case 4:
				leer.nextLine();
				System.out.println("Dime el isbn del libro a eliminar");
				isbn = leer.nextLine();
				
				catalogo.remove(isbn);
				break;
			}
		} while(opcion != 5);
		
		try (PrintWriter pw = new PrintWriter(new FileWriter(f))) {
			pw.println("ISBN;TITULO;AUTOR;EJEMPLARES");
			for (Map.Entry<String, Libro> entry : catalogo.entrySet()) {
				pw.println(entry.getValue().getIsbn() + ";" + entry.getValue().getTitulo() + ";" + entry.getValue().getAutor() + ";" + entry.getValue().getEjemplaresDispo());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		leer.close();
	}

}
