package videojuego;

public class Mago {

	private Arma arma;
	private double inteligencia;
	
	public void atacar() {
		System.out.println("ESPELIERMUS!");
		arma.usar();
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public double getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(double inteligencia) {
		this.inteligencia = inteligencia;
	}
	
	
}
