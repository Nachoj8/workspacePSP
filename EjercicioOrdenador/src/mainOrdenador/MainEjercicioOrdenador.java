package mainOrdenador;

import entidades.DiscoDuro;
import entidades.Ordenador;
import entidades.PlacaBase;
import entidades.RAM;
import entidades.TarjetaGrafica;

public class MainEjercicioOrdenador {

	public static void main(String[] args) {
		
		RAM ramOrdenador = new RAM();
		ramOrdenador.setCapacidad(16);
		ramOrdenador.setMarca("MSI");
		ramOrdenador.setVelocidad(15.6);
		
		DiscoDuro discoOrdenador = new DiscoDuro();
		discoOrdenador.setCapacidad(1000);
		discoOrdenador.setTipo("SSD");
		
		PlacaBase placaOrdenador = new PlacaBase();
		placaOrdenador.setMarca("MSI");
		placaOrdenador.setModelo("15-35Z");
		placaOrdenador.setPrecio(100);
		
		TarjetaGrafica tarjetaOrdenador = new TarjetaGrafica();
		tarjetaOrdenador.setMarca("MSI");
		tarjetaOrdenador.setModelo("GTX 2080");
		tarjetaOrdenador.setPotenciaCalculo(15000);
		
		Ordenador ordenador = new Ordenador();
		ordenador.setDiscoDuro(discoOrdenador);
		ordenador.setPlacaBase(placaOrdenador);
		ordenador.setRam(ramOrdenador);
		ordenador.setTarjetaGrafica(tarjetaOrdenador);
		ordenador.setPrecio(1000);
		
		System.out.println(ordenador);
	}

}
