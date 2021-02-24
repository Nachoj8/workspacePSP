package entidades;

public class DiscoDuro {

	private int capacidad;
	private String tipo;
	
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "DiscoDuro [capacidad=" + capacidad + ", tipo=" + tipo + "]";
	}
	
	
}
