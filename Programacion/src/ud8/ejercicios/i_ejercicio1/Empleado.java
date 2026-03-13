package ud8.ejercicios.i_ejercicio1;

public class Empleado extends Persona {

	private int numEmpleado;
	private String departamento, puesto;

	/* Constructores */

	public Empleado() {}
	
	public Empleado(String nombre, String genero, int edad, int numEmpleado, String departamento, String puesto) {
		
		super(nombre, genero, edad);
		this.numEmpleado = numEmpleado;
		this.departamento = departamento;
		this.puesto = puesto;
		
	}
	
	/* Getters y Setters */

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

}
