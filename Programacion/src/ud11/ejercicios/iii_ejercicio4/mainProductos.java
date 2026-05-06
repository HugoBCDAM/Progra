package ud11.ejercicios.iii_ejercicio4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class mainProductos {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		File f = new File("productos.csv");
		List<Producto> productos = new ArrayList<>();
		
		if (f.exists()) {
			try (BufferedReader bf = new BufferedReader(new FileReader(f))) {
				String linea;
				String[] producto;
				
				linea = bf.readLine();
				while ((linea = bf.readLine()) != null) {
					producto = linea.split(";");
					Producto p = new Producto(producto[0], Double.parseDouble(producto[1]), Integer.parseInt(producto[2]));
					productos.add(p);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		int opcion, stock;
		String nombre;
		Double precio;
		try (PrintWriter pw = new PrintWriter(new FileWriter(f))) {
            pw.println("Nombre;Precio;Stock");
            for (Producto p : productos) {
                pw.println(p.getNombre() + ";" + p.getPrecio() + ";" + p.getStock());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		do {
			System.out.println("1. Crear producto\n2. Listar productos\n3. Modificar precio o stock de un producto\n4. Eliminar un producto\n5. Salir");
			opcion = leer.nextInt();
			leer.nextLine();
			
			switch(opcion) {
			case 1:
				System.out.println("Introduce el nombre del producto");
				nombre = leer.nextLine();
				System.out.println("Introduce el precio del producto");
				precio = leer.nextDouble();
				System.out.println("Introduce el stock del producto");
				stock = leer.nextInt();
					
				productos.add(new Producto(nombre, precio, stock));
					
				try (PrintWriter pw = new PrintWriter(new FileWriter(f))) {
					pw.println("Nombre;Precio;Stock");
                    for (Producto p : productos) {
                        pw.println(p.getNombre() + ";" + p.getPrecio() + ";" + p.getStock());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
				break;
			case 2:
				System.out.println("Lista de productos:");
				try (BufferedReader br = new BufferedReader(new FileReader(f))) {
					int linea;
					while ((linea = br.read()) != -1) {
						char caracter = (char) linea;
						if (caracter == ';') {
							System.out.print("\t");
						} else {
							System.out.print(caracter);
						}
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				String modificar;
				
				System.out.println("¿Que quieres modificar, el stock o el precio?");
				modificar = leer.nextLine();
				
				if (modificar.equalsIgnoreCase("stock")) {
					String nombreProducto;
					int stockNuevo;
					
					System.out.println("De cual producto quieres cambiar el stock, dime el nombre");
					nombreProducto = leer.nextLine();
					System.out.println("¿Cuanto stock tendrá?");
					stockNuevo = leer.nextInt();
					
					for (Producto p : productos) {
						if (p.getNombre().equalsIgnoreCase(nombreProducto)) {
							p.setStock(stockNuevo);
						}
					}
				} else if (modificar.equalsIgnoreCase("precio")) {
					String nombreProducto;
					double precioNuevo;
					
					System.out.println("De cual producto quieres cambiar el stock, dime el nombre");
					nombreProducto = leer.nextLine();
					System.out.println("¿Cuanto valdrá?");
					precioNuevo = leer.nextDouble();
					
					for (Producto p : productos) {
						if (p.getNombre().equalsIgnoreCase(nombreProducto)) {
							p.setPrecio(precioNuevo);
						}
					}
				}
				
				try (PrintWriter pw = new PrintWriter(new FileWriter(f))) {
					pw.println("Nombre;Precio;Stock");
					
					for (Producto p : productos) {
						pw.println(p.getNombre() + ";" + p.getPrecio() + ";" + p.getStock());
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				String nombreProducto;
				
				System.out.println("Dime que producto quieres eliminar, dime el nombre");
				nombreProducto = leer.nextLine();
				
				Iterator<Producto> it = productos.iterator();
				while (it.hasNext()) {
					if (it.next().getNombre().equalsIgnoreCase(nombreProducto)) {
						it.remove();
					}
				}
				
				try (PrintWriter pw = new PrintWriter(new FileWriter(f))) {
					pw.println("Nombre;Precio;Stock");
					
					for (Producto p : productos) {
						pw.println(p.getNombre() + ";" + p.getPrecio() + ";" + p.getStock());
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			}
		} while (opcion != 5);
		
		leer.close();
	}

}
