package ud6_7.ejercicios.ii_ejercicio1;

public class Cuenta {

	private String titular;
	private double cantidad;

	public Cuenta(String titular) {

		this.titular = titular;

	}

	public Cuenta(String titular, double cantidad) {

		this.titular = titular;
		this.cantidad = cantidad;

	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}

	public void ingresar(double cantidad) {

		if (cantidad > 0) {

			this.cantidad += cantidad;

		}

	}

	public void retirar(double cantidad) {

		if (this.cantidad - cantidad >= 0) {

			this.cantidad -= cantidad;

		} else if (this.cantidad - cantidad < 0) {

			this.cantidad = 0;

		}

	}

	public void transferencia(Cuenta destino, double cantidad) {

		if (this.cantidad > cantidad) {
			
			this.cantidad -= cantidad;
			destino.cantidad += cantidad;
			
		}

	}

}
