package entidades;

public class RAM {

	private int capacidad;
	private String marca;
	private double velocidad;
	
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	@Override
	public String toString() {
		return "RAM [capacidad=" + capacidad + ", marca=" + marca + ", velocidad=" + velocidad + "]";
	}
	
}
