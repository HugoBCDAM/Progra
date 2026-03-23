package ud9.ejercicios.iii_ejercicio1;

public class GestionDispositivos {

	public static void main(String[] args) {
		
		Dispositivo s1 = new Smartphone("intel", "estados unidos", "s1", "1.0.0", 9.99, 50);
		Dispositivo s2 = new Smartphone("asus", "españa", "s2", "1.0.1", 5.99, 45);
		Dispositivo l1 = new Laptop("asus", "españa", "l1", "1.0.0", 5.99, 16);
		Dispositivo l2 = new Laptop("intel", "estados unidos", "l2", "1.0.1", 4.99, 32);
		
		Dispositivo[] dispositivos = {s1, s2, l1, l2};
		
		Fabricante.mostrarNumFabricantes();
		
		for (int i = 0; i < dispositivos.length; i++) {
			if (dispositivos[i] instanceof Smartphone) {
				System.out.println(((Smartphone)dispositivos[i]).toString());
			} else if (dispositivos[i] instanceof Laptop) {
				System.out.println(((Laptop)dispositivos[i]).toString());
			}
		}
		
		s1.actualizarFirmware("1.0.1");
		s2.actualizarFirmware("1.0.1");
		l1.actualizarFirmware("1.0.1");
		l2.actualizarFirmware("1.0.1");
		
		
		for (int i = 0; i < dispositivos.length; i++) {
			try {
				if (dispositivos[i] instanceof Smartphone) {
					((Smartphone)dispositivos[i]).activarWallet();
				} else if (dispositivos[i] instanceof Laptop) {
					((Laptop)dispositivos[i]).activarWallet();
				}
			} catch (WalletException e) {
				System.out.println("No se ha podido activar Wallet porque no se cumplen los requisitos necesarios");
			}
		}
	}

}
