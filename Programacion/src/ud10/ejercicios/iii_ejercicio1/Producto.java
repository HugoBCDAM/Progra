package ud10.ejercicios.iii_ejercicio1;

public class Producto {
	
	private int cod, stock;
	private String nombre, tipo;
	private double precio;
	
	public Producto (int codigo, String nombre, String tipo, int stock, double precio) {
		this.cod = codigo;
		this.nombre = nombre;
		this.tipo = tipo;
		this.stock = stock;
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Producto [cod=" + cod + ", stock=" + stock + ", nombre=" + nombre + ", tipo=" + tipo + ", precio="
				+ precio + "]";
	}

	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
