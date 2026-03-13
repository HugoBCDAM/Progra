package ud6_7.ejercicios.v_ejercicio1;

public class Robot {

	private String modelo;
	private int bateria, id;
	private boolean modoSeguro;

	private static int contadorRobots = 0;
	private static final int BATERIAMAXIMA = 100;
	private static final int BATERIAESTANDAR = 50;
	private static final int BATERIACRITICA = 5;

	public Robot(String modelo, int bateria) {

		if (modelo != "") {

			this.modelo = modelo;

		}

		if (bateria < Robot.BATERIAMAXIMA) {

			this.bateria = bateria;
			if (this.bateria > Robot.BATERIACRITICA) {
				
				this.modoSeguro = false;
				
			} else {
				
				this.modoSeguro = true;
				
			}
			
		} else {

			this.bateria = Robot.BATERIAESTANDAR;
			this.modoSeguro = false;

		}

		Robot.contadorRobots++;

	}

	public Robot(String modelo) {

		if (modelo != "") {

			this.modelo = modelo;

		}
		
		this.bateria = Robot.BATERIAESTANDAR;
		this.modoSeguro = false;
		Robot.contadorRobots++;

	}

	public Robot() {

		Robot.contadorRobots++;
		this.modelo = "MR-" + Robot.contadorRobots;
		this.bateria = Robot.BATERIAESTANDAR;
		this.modoSeguro = false;

	}
	
	public void recargarEnergia(int bateria) {
		
		int bateriaAñadida = 0;
		
		if (bateria > 0 && bateria < 100) {
			
			if ((this.bateria += bateria) > Robot.BATERIAMAXIMA) {
				
				bateriaAñadida = this.bateria + bateria;
				bateriaAñadida -= Robot.BATERIAMAXIMA;
				this.bateria = Robot.BATERIAMAXIMA;
				
			} else {
				
				this.bateria += bateria;
				bateriaAñadida = bateria;
				
			}
			
			if (this.bateria > 5) {
				
				this.modoSeguro = false;
				
			}
			
		}
		
		System.out.println("Se añadió " + bateriaAñadida + " batería");
		
	}
	
	public void ejecutarMision() {
		
		if (this.bateria > 0 && this.modoSeguro == false) {
			
			this.bateria -= 10;
			
			System.out.println("La misión se realizó con éxito");
			
			if (this.bateria <= Robot.BATERIACRITICA) {
				
				this.modoSeguro = true;
				
			}
			
		} else {
			
			System.out.println("No se puede ejecutar una misión ya que no se dispone de batería suficiente");
			
		}
		
		if (this.modoSeguro == true) {
			
			System.out.println("No se puede ejecutar una misión ya que el robot se encuentra en este momento en modo seguro, no se podrá realizar "
								+ "ninguna actividad hasta que sea recargado");
			
		}
		
	}
	
	public void transferirEnergia(Robot robot) {
		
		
		
	}

}
