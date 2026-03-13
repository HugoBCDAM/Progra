package ud6_7.ejercicios.i_ejercicio16y17;

public class CuentaCorriente {

	String dni;
	String nombreTitular;
	double saldo;
	
	public CuentaCorriente () {}
	
	public CuentaCorriente (String dni, String nombreTitular) {
		
		this.dni = dni;
		this.nombreTitular = nombreTitular;
		this.saldo = 0.0;
		
	}
	
	public CuentaCorriente (String dni, double saldo) {
		
		this.dni = dni;
		this.saldo = saldo;
		
	}
	
	public CuentaCorriente (String dni, double saldo, String nombreTitular) {
		
		this.dni = dni;
		this.saldo = saldo;
		this.nombreTitular = nombreTitular;
		
	}
	
	public void sacarDinero(double dinero) {
		
		if (this.saldo > dinero) {
			
			System.out.println("Ha sido posible llevar a cabo la operación");
			this.saldo -= dinero;
			System.out.println("Saldo restante: " + this.saldo);
			System.out.println();
			
		} else if (this.saldo < dinero) {
		
			System.out.println("No hay dinero suficiente en su cuenta bancaria");
			System.out.println();
			
		}
		
	}
	
	public void ingresarDinero(double dinero) {
		
		this.saldo += dinero;
		System.out.println("Se ha ingresado correctamente su dinero");
		System.out.println("Saldo actual: " + this.saldo);
		System.out.println();
		
	}
	
	public void mostrarInformacion() {
		
		System.out.println("------ CUENTA CORRIENTE ------");
		System.out.println("Titular: " + nombreTitular);
		System.out.println("DNI: " + dni);
		System.out.println("Saldo: " + saldo);
		System.out.println();
		
	}
	
}
