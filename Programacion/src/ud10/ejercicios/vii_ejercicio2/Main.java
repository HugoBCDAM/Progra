package ud10.ejercicios.vii_ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<String, Producto> productos = new HashMap<>();
		
		productos.put("Laptop", new Producto("Laptop", 1200.50, 10));
		productos.put("Mouse", new Producto("Mouse", 25.99, 50));
        productos.put("Teclado", new Producto("Teclado", 45.75, 30));
        productos.put("Monitor", new Producto("Monitor", 300.00, 20));
        productos.put("Auriculares", new Producto("Auriculares", 80.20, 15));
        
        double sumaPrecios = 0;
        int sumaCantidad = 0;
        
        for (Map.Entry<String, Producto> productos2 : productos.entrySet()) {
        	sumaPrecios += productos2.getValue().getPrecio();
        	sumaCantidad += productos2.getValue().getStock();
        }
        
        System.out.println("Precio medio: " + sumaPrecios / productos.size());
        System.out.println("Cantidad media: " + sumaCantidad / productos.size());
        
	}

}
