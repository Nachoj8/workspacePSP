package entidades;

public class PlacaBase {

	private String marca;
	private double precio;
	private String modelo;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return "PlacaBase [marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + "]";
	}
	
	
}
