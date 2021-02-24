package entidades;

import java.util.ArrayList;

public class Casa {
	private Persona propietario;
	private double precio;
	private Direccion direccion;
	private ArrayList<Habitacion> listaHabitaciones;
	private ArrayList<Persona> listaInquilinos;
	
	public Casa(Persona propietario, double precio, Direccion direccion, ArrayList<Habitacion> listaHabitaciones,
			ArrayList<Persona> listaInquilinos) {
		super();
		this.propietario = propietario;
		this.precio = precio;
		this.direccion = direccion;
		this.listaHabitaciones = listaHabitaciones;
		this.listaInquilinos = listaInquilinos;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Habitacion> getListaHabitaciones() {
		return listaHabitaciones;
	}

	public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}

	public ArrayList<Persona> getListaInquilinos() {
		return listaInquilinos;
	}

	public void setListaInquilinos(ArrayList<Persona> listaInquilinos) {
		this.listaInquilinos = listaInquilinos;
	}

	@Override
	public String toString() {
		return "Casa \n- Propietario: " + propietario + "- Precio: " + precio + ", " + direccion
				+ "- Habitaciones: \n" + listaHabitaciones + "- Inquilinos: \n" + listaInquilinos;
	}

	public double calcularM2() {
		double suma = 0;
		for (Habitacion h : listaHabitaciones) {
			suma += h.getM2();
		}
		return suma;
	}
	
	

}
