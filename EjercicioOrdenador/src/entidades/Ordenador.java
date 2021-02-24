package entidades;

public class Ordenador {

	private double precio;
	private RAM ram;
	private DiscoDuro discoDuro;
	private PlacaBase placaBase;
	private TarjetaGrafica tarjetaGrafica;
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public RAM getRam() {
		return ram;
	}
	public void setRam(RAM ram) {
		this.ram = ram;
	}
	public DiscoDuro getDiscoDuro() {
		return discoDuro;
	}
	public void setDiscoDuro(DiscoDuro discoDuro) {
		this.discoDuro = discoDuro;
	}
	public PlacaBase getPlacaBase() {
		return placaBase;
	}
	public void setPlacaBase(PlacaBase placaBase) {
		this.placaBase = placaBase;
	}
	public TarjetaGrafica getTarjetaGrafica() {
		return tarjetaGrafica;
	}
	public void setTarjetaGrafica(TarjetaGrafica tarjetaGrafica) {
		this.tarjetaGrafica = tarjetaGrafica;
	}
	
	@Override
	public String toString() {
		return "Ordenador [precio=" + precio + ", ram=" + ram + ", discoDuro=" + discoDuro + ", placaBase=" + placaBase
				+ ", tarjetaGrafica=" + tarjetaGrafica + "]";
	}
	
	
}
