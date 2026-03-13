package ud8.ejercicios.x_ejercicio1;

public class Libro extends Publicacion implements Prestable {
	
	private String autor, titulo;
	private boolean prestado;
	
	public Libro(String cod, int anio, String autor, String titulo){
		super(cod, anio);
		this.autor = autor;
		this.titulo = titulo;
		this.prestado = false;
	}
	
	@Override
	public String toString() {
		String estaPrestado = this.estaPrestado();
		
		return "\nISBN: " + super.toString() + "\nAUTOR: " + this.getAutor() + "\nTÍTULO: " + this.getTitulo() + "\nPRESTADO: " + estaPrestado;
	}
	
	@Override
	public void prestar() {
		this.prestado = true;
	}
	
	@Override
	public void devolver() {
		this.prestado = false;
	}
	
	@Override
	public String estaPrestado() {
		if (prestado) {
			return "Si";
		} else {
			return "No";
		}
	}
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
}
