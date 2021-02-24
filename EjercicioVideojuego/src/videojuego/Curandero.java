package videojuego;

public class Curandero extends Personaje {

	private double sabiduria;
	
	public void atacar() {
		System.out.println("NARNIA!");
		arma.usar();
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public double getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(double sabiduria) {
		this.sabiduria = sabiduria;
	}
	
}
