package com.ejerciciorest.modelo.entidad;


import org.springframework.stereotype.Component;

@Component

public class Videojuego {
	
	private int id;
	private String nombre;
	private String comp;
	private double precio;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public Videojuego() {
		id = 1;
		nombre = "God Of War";
		comp = "Sony";
		precio = 69.99;
	}
	
	

}
