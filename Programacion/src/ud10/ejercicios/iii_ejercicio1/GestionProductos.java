package ud10.ejercicios.iii_ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class GestionProductos {
	
	List<Producto> listaProductos = new ArrayList<>();
	
	public void agregar(Producto p) {
		listaProductos.add(p);
	}
	
	public void eliminar(Producto p) {
		listaProductos.remove(p);
	}
	
	public void obtener(int codigo) {
		for (Producto pr : listaProductos) {
			if (pr.getCod() == codigo) {
				pr.toString();
			}
		}
	}
	
	public List<Producto> buscar(String tipo) {
		List<Producto> productosTipo = new ArrayList<>();
		
		for (Producto pr : listaProductos) {
			if (pr.getTipo().equals(tipo)) {
				productosTipo.add(pr);
			}
		}
		
		return productosTipo;
		
	}
	
	public void tamanio() {
		System.out.println("El tamaño de la lista es: " + listaProductos.size());
	}
	
	public void agregarSinDuplicados(Producto p) throws DatosException {
		for (Producto pr : listaProductos) {
			if (pr.getCod() == p.getCod()) {
                if (!p.getNombre().equals(p.getNombre()) ||
                    !p.getTipo().equals(p.getTipo())) {
                    throw new DatosException("El código ya existe con diferentes datos.");
                }
                
                if (p.getPrecio() != p.getPrecio()) {
                    p.setPrecio(p.getPrecio());
                    p.setStock(p.getStock() + p.getStock());
                    return;
                }

                p.setStock(p.getStock() + p.getStock());
                return;
			}
			
		}
	}
}
