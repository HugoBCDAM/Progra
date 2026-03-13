package ud8.ejercicios.x_ejercicio1;

public class Revista extends Publicacion {
	
	private int num;
	
	public Revista(String cod, int anio, int num) {
		super(cod, anio);
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "\nISBN: " + super.toString() + "\nNÚMERO DE REVISTA: " + this.getNum();
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
