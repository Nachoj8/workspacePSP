package entidades;

public class TarjetaGrafica {

	private String marca;
	private String modelo;
	private double potenciaCalculo;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPotenciaCalculo() {
		return potenciaCalculo;
	}
	public void setPotenciaCalculo(double potenciaCalculo) {
		this.potenciaCalculo = potenciaCalculo;
	}
	
	@Override
	public String toString() {
		return "TarjetaGrafica [marca=" + marca + ", modelo=" + modelo + ", potenciaCalculo=" + potenciaCalculo + "]";
	}
	
	
}
