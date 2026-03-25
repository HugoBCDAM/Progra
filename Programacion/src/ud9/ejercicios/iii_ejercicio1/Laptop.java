package ud9.ejercicios.iii_ejercicio1;

import java.util.Scanner;

public class Laptop extends Dispositivo {
	
	private int memoriaRam; //Medida en GB
	
	public Laptop(Fabricante fabricante, String nombre, String version, double precio, int memoria) {
		super(fabricante, nombre, version, precio);
		this.memoriaRam = memoria;
	}
	
	@Override
	public void activarWallet() throws WalletException {
		Scanner leer = new Scanner(System.in);
		String pin;
		boolean cuatro = false;
		boolean caracter = false;
		
		System.out.println("Dime el pin");
		pin = leer.next();
		
		if (pin.trim().length() == 4) {
			cuatro = true;
		}
		
		for (int i = 0; i < pin.length(); i++) {
			if (pin.charAt(i) == '$') {
				caracter = true;
			}
		}
		
		if (cuatro && caracter) {
			System.out.println("Wallet activado");
		} else {
			throw new WalletException("No se ha podido activar Wallet porque no se cumplen los requisitos necesarios");
		}
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "Laptop [memoriaRam=" + memoriaRam + "]";
	}

	public int getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}
	
}
