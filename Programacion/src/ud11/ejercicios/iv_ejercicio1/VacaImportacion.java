package ud11.ejercicios.iv_ejercicio1;

public class VacaImportacion extends Vaca {

	private String paisProcedencia;
	
	public VacaImportacion(String nombre, String raza, double peso, char sexo, String fechaNacimiento, boolean lechera, String paisProcedencia) {
		super(nombre, raza, peso, sexo, fechaNacimiento, lechera);
		this.paisProcedencia = paisProcedencia;
	}

	public String getPaisProcedencia() {
		return paisProcedencia;
	}

	public void setPaisProcedencia(String paisProcedencia) {
		this.paisProcedencia = paisProcedencia;
	}

	@Override
	public String toString() {
		return super.toString() + "\nPaís de procedencia: " + this.paisProcedencia;
	}
	
}
