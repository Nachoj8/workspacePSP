package mainEjercicio;

import java.util.ArrayList;

import entidades.Casa;
import entidades.Direccion;
import entidades.Habitacion;
import entidades.Persona;

public class MainEjercicioCasa {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Paco", 30, "12345678D");
		Persona p2 = new Persona("Inquilino 1", 50, "78945612F");
		Persona p3 = new Persona("Inquilino 2", 55, "52365489X");
		
		Direccion direccion = new Direccion("Gran Via", "Calle", "28003");
		
		Habitacion h1 = new Habitacion(20, "Salón");
		Habitacion h2 = new Habitacion(10, "Baño");
		Habitacion h3 = new Habitacion(20, "Cocina");
		
		ArrayList<Habitacion> listaHabitaciones = new ArrayList<Habitacion>();
		listaHabitaciones.add(h1);
		listaHabitaciones.add(h2);
		listaHabitaciones.add(h3);
		
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		listaPersonas.add(p2);
		listaPersonas.add(p3);
		
		Casa casa = new Casa(p1, 900, direccion, listaHabitaciones, listaPersonas);
		
		System.out.println(casa);

		System.out.println("Metros cuadrados: " + casa.calcularM2());
	}

}
