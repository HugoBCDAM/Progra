package ud11.ejercicios.iii_ejercicio5;

public class Libro {
	private String isbn, titulo, autor;
	private int ejemplaresDispo;
	
	public Libro(String isbn, String titulo, String autor, int ejemplares) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplaresDispo = ejemplares;
	}
	
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", ejemplaresDispo="
				+ ejemplaresDispo + "]";
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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

	public int getEjemplaresDispo() {
		return ejemplaresDispo;
	}

	public void setEjemplaresDispo(int ejemplaresDispo) {
		this.ejemplaresDispo = ejemplaresDispo;
	}
	
}
