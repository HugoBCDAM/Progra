package ud6_7.ejercicios.iii_ejercicio1;

public class Libro {
	
	private String titulo, autor;
	private int numEjemplares, numEjemplaresPrestados;
	
	public Libro() {}
	
	public Libro(String titulo, String autor, int numEjemplares) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public int getNumEjemplaresPrestados() {
		return numEjemplaresPrestados;
	}

	public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}
	
	public boolean prestamo() {
		
		boolean prestado = false;
		
		if (this.numEjemplares > 0) {
			
			this.numEjemplares--;
			this.numEjemplaresPrestados++;
			
			prestado = true;
			
		}
		
		return prestado;
		
	}
	
	public boolean devolucion() {
		
		boolean devuelto = false;
		
		if (this.numEjemplaresPrestados > 0) {
			
			this.numEjemplaresPrestados--;
			this.numEjemplares++;
			
			devuelto = true;
			
		}
		
		return devuelto;
		
	}

	@Override
	public String toString() {
		
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numEjemplares=" + numEjemplares + ", numEjemplaresPrestados=" + numEjemplaresPrestados + "]";
		
	}
	
}
