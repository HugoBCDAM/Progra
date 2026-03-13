package ud6_7.ejercicios.iii_ejercicio1;

public class Biblioteca {

	public static void main(String[] args) {
		
		// Crear algunos libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 5);
        Libro libro2 = new Libro("1984", "George Orwell", 3);
        
        // Mostrar los libros inicialmente
        System.out.println("Estado inicial de los libros:");
        System.out.println(libro1);
        System.out.println(libro2);
        
        // Realizar algunos préstamos directamente
        System.out.println("\nRealizando préstamos...");
        if (libro1.prestamo()) {
            System.out.println("Préstamo realizado con éxito para el libro: " + libro1.getTitulo());
        } else {
            System.out.println("No hay ejemplares disponibles para el libro: " + libro1.getTitulo());
        }

        if (libro1.prestamo()) {
            System.out.println("Préstamo realizado con éxito para el libro: " + libro1.getTitulo());
        } else {
            System.out.println("No hay ejemplares disponibles para el libro: " + libro1.getTitulo());
        }

        if (libro2.prestamo()) {
            System.out.println("Préstamo realizado con éxito para el libro: " + libro2.getTitulo());
        } else {
            System.out.println("No hay ejemplares disponibles para el libro: " + libro2.getTitulo());
        }
        
        // Mostrar el estado después de los préstamos
        System.out.println("\nEstado después de los préstamos:");
        System.out.println(libro1);
        System.out.println(libro2);
        
        // Realizar algunas devoluciones directamente
        System.out.println("\nRealizando devoluciones...");
        if (libro1.devolucion()) {
            System.out.println("Devolución realizada con éxito para el libro: " + libro1.getTitulo());
        } else {
            System.out.println("No hay ejemplares prestados para el libro: " + libro1.getTitulo());
        }

        if (libro2.devolucion()) {
            System.out.println("Devolución realizada con éxito para el libro: " + libro2.getTitulo());
        } else {
            System.out.println("No hay ejemplares prestados para el libro: " + libro2.getTitulo());
        }
        
        // Mostrar el estado después de las devoluciones
        System.out.println("\nEstado después de las devoluciones:");
        System.out.println(libro1);
        System.out.println(libro2);

	}

}

