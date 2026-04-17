package ud10.ejercicios.iv_ejercicio1;

public class Vehiculo {
	String matricula, marca, modelo, anioFabricacion, estado;
	
	public Vehiculo (String matricula, String marca, String modelo, String anioFabricacion, String estado) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
		this.estado = estado;
	}
	
	
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", anioFabricacion="
				+ anioFabricacion + ", estado=" + estado + "]";
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(String anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
