package videojuego;

public class Guerrero extends Personaje {

	private double fuerza;
	
	public void atacar() {
		System.out.println("AU AU AU!");
		arma.usar();
	}

	public double getFuerza() {
		return fuerza;
	}

	public void setFuerza(double fuerza) {
		this.fuerza = fuerza;
	}
	
}
