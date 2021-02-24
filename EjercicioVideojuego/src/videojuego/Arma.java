package videojuego;

public abstract class Arma {

	private String tipo;
	private int da�oMinimo;
	private int da�oMaximo;
	
	public abstract int usar();

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDa�oMinimo() {
		return da�oMinimo;
	}

	public void setDa�oMinimo(int da�oMinimo) {
		this.da�oMinimo = da�oMinimo;
	}

	public int getDa�oMaximo() {
		return da�oMaximo;
	}

	public void setDa�oMaximo(int da�oMaximo) {
		this.da�oMaximo = da�oMaximo;
	}

	
}
