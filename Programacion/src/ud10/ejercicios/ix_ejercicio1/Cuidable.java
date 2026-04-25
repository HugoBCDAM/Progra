package ud10.ejercicios.ix_ejercicio1;

public interface Cuidable {
	
	public default String recomendarRiego(Planta p) {
		String mensaje = "";
		if (p.isNecesitaAgua()) {
			mensaje = "Recomiendo regar la planta";
		} else {
			mensaje = "No es necesario regar la planta";
		}
		
		return mensaje;
	}
	
	public boolean necesitaRiego();
	
	public void recibirLuz();
	
}
