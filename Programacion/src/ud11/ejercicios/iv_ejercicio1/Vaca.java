package ud11.ejercicios.iv_ejercicio1;

public class Vaca extends Animal {
	
	private boolean lechera;
	
	public Vaca(String nombre, String raza, double peso, char sexo, String fechaNacimiento, boolean lechera) {
		super(nombre, raza, peso, sexo, fechaNacimiento);
		this.lechera = lechera;
	}

	public boolean isLechera() {
		return lechera;
	}

	public void setLechera(boolean lechera) {
		this.lechera = lechera;
	}

	@Override
	public String toString() {
		return "Vaca [lechera=" + lechera + "]";
	}
	
}
