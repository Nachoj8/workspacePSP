package videojuego;

public abstract class Arma {

	private String tipo;
	private int dañoMinimo;
	private int dañoMaximo;
	
	public abstract int usar();

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDañoMinimo() {
		return dañoMinimo;
	}

	public void setDañoMinimo(int dañoMinimo) {
		this.dañoMinimo = dañoMinimo;
	}

	public int getDañoMaximo() {
		return dañoMaximo;
	}

	public void setDañoMaximo(int dañoMaximo) {
		this.dañoMaximo = dañoMaximo;
	}

	
}
