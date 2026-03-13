package ud8.ejercicios.x_ejercicio1;

public class Publicacion {
	
	private String cod;
	private int anio;
	private static int publicaciones = 0;
	
	public Publicacion(String cod, int anio) {
		this.cod = cod;
		this.anio = anio;
		Publicacion.publicaciones++;
	}
	
	@Override
	public String toString() {
		return this.getCod() + "\nAÑO DE PUBLICACIÓN: " + this.getAnio();
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public static int getPublicaciones() {
		return publicaciones;
	}

	public static void setPublicaciones(int publicaciones) {
		Publicacion.publicaciones = publicaciones;
	}
	
}
