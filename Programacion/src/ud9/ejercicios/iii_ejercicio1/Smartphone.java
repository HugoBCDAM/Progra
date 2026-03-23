package ud9.ejercicios.iii_ejercicio1;

import java.util.Scanner;

public class Smartphone extends Dispositivo {
	
	private int capacidadBateria; //Capacidad bateria medida en mAh
	
	public Smartphone(String nombreFabricante, String pais, String nombre, String version, double precio, int capacidad) {
		super(nombreFabricante, pais, nombre, version, precio);
		this.capacidadBateria = capacidad;
	}
	
	@Override
	public void activarWallet() throws WalletException {
		Scanner leer = new Scanner(System.in);
		String respuesta;
		
		System.out.println("¿Está activada la biometría facial y/o dactilar?");
		respuesta = leer.next();
		
		if (respuesta.equalsIgnoreCase("si")) {
			System.out.println("Wallet activado");
		} else {
			throw new WalletException("No se ha podido activar Wallet porque no se cumplen los requisitos necesarios");
		}
	}	
	
	@Override
	public String toString() {
		return super.toString() + "Smartphone [capacidadBateria=" + capacidadBateria + "]";
	}

	public int getCapacidadBateria() {
		return capacidadBateria;
	}

	public void setCapacidadBateria(int capacidadBateria) {
		this.capacidadBateria = capacidadBateria;
	}
	
}
