package ud8.ejercicios.x_ejercicio1;

import java.util.Scanner;

public class Biblioteca {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		int opcion, numPublicaciones, anioPublicacion, numRevista;
		String tipo, isbn, autor, titulo, issn, codBuscar;
		
		Publicacion[] publicaciones = new Publicacion[100];
		
		do {
			System.out.println("Selecciona la operación que quieres realizar (entre 1 y 6):\n"
					+ "1 --> Añadir publicación\n2 --> Buscar publicación\n3 --> Prestar libro\n"
					+ "4 --> Devolver libro\n5 --> Eliminar publicación\n6 --> Salir");
			opcion = leer.nextInt();
			
			switch(opcion) {
				case 1:
					System.out.println("\n¿Cuántas publicaciones desea añadir?");
					numPublicaciones = leer.nextInt();
					for (int i = 0; i < numPublicaciones; i++) {
						if (Publicacion.getPublicaciones() < publicaciones.length) {
							System.out.println("\n¿De qué tipo (libro/revista) es la publicación que desea añadir?");
							tipo = leer.next();
							
							if (tipo.equalsIgnoreCase("libro")) {
								System.out.println("\n¿Cuál es ISBN del libro?");
								isbn = leer.next();
								
								System.out.println("\n¿En qué año lo estás publicando?");
								anioPublicacion = leer.nextInt();
								
								leer.nextLine();
								
								System.out.println("\n¿Cuál es el autor del libro?");
								autor = leer.nextLine();
								
								System.out.println("\n¿Cuál es el título?");
								titulo = leer.nextLine();
								
								publicaciones[Publicacion.getPublicaciones()] = new Libro(isbn, anioPublicacion, autor, titulo);
								
							} else if (tipo.equalsIgnoreCase("revista")) {
								System.out.println("\n¿Cuál es el ISSN de la revista?");
								issn = leer.next();
								
								System.out.println("\n¿En qué año lo estás publicando?");
								anioPublicacion = leer.nextInt();
								
								System.out.println("\n¿Cuál es el número de la revista?");
								numRevista = leer.nextInt();
								
								leer.nextLine();
								
								publicaciones[Publicacion.getPublicaciones()] = new Revista(issn, anioPublicacion, numRevista);
							}
						} else {
							System.out.println("\nSe ha alcanzado el máximo de publicaciones, por favor elimine una para añadir más");
							break;
						}
					}
					break;
				case 2:
					System.out.println("\nDime el ISBN/ISSN de la publicación que deseas buscar:");
					codBuscar = leer.next();
					
					for (int i = 0; i < publicaciones.length; i++) {
						if (publicaciones[i].getCod() == codBuscar) {
							if (publicaciones[i] instanceof Libro) {
								((Libro) publicaciones[i]).toString();
							} else if (publicaciones[i] instanceof Revista) {
								((Revista) publicaciones[i]).toString();
							}
						}
					}
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("ERROR: No elegiste una opción del menú");
					break;
			}
			
		} while (opcion != 6);
		
		leer.close();
		
	}
	
}
