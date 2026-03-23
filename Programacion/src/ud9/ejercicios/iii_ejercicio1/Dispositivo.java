package ud9.ejercicios.iii_ejercicio1;

public abstract class Dispositivo {
	
	private String nombre, version;
	private double precio;
	private Fabricante fabricante;
	
	public Dispositivo(String nombreFabricante, String pais, String nombre, String version, double precio) {
		this.fabricante = new Fabricante(nombreFabricante, pais);
		this.nombre = nombre;
		this.version = version;
		this.precio = precio;
	}
	
	public abstract void activarWallet() throws WalletException;
	
	public void actualizarFirmware(String version) {
		if (version == null) {
			System.out.println("La nueva versión no puede ser nula");
		} else if (versionMayor(version)) {
			System.out.println("Versión actualizada");
			this.setVersion(version);
		} else {
			System.out.println("Versión no actualizada");
		}
	}
	
	private boolean versionMayor(String version) {
		String[] nueva = version.split("\\.");
		String[] actual = this.version.split("\\.");
		int length = Math.min(nueva.length, actual.length);
		
		for (int i = 0; i < length; i++) {
			int numNueva = Integer.parseInt(nueva[i]);
			int numActual = Integer.parseInt(actual[i]);
			
			if (numNueva > numActual) {
				return true;
			} else if (numNueva < numActual) {
				return false;
			}
		}
		
		return nueva.length > actual.length;
	}
	
	
	@Override
	public String toString() {
		return "Dispositivo [nombre=" + nombre + ", version=" + version + ", precio=" + precio + ", fabricante="
				+ fabricante + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
}
