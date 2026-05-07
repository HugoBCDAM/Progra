package ud11.ejercicios.iv_ejercicio1;

public class Cerdo extends Animal {
	
	private TipoJamon tipoJamon;
	
	public Cerdo (String nombre, String raza, double peso, char sexo, String fechaNacimiento, TipoJamon tipoJamon) {
		super(nombre, raza, peso, sexo, fechaNacimiento);
		this.tipoJamon = tipoJamon;
	}

	public TipoJamon getTipoJamon() {
		return tipoJamon;
	}

	public void setTipoJamon(TipoJamon tipoJamon) {
		this.tipoJamon = tipoJamon;
	}

	@Override
	public String toString() {
		return "Cerdo [tipoJamon=" + tipoJamon + "]";
	}
	
}
