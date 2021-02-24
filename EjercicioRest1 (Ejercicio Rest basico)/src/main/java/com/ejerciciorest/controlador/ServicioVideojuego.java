package com.ejerciciorest.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejerciciorest.modelo.entidad.Videojuego;

@RestController
public class ServicioVideojuego {
	
	@Autowired
	private Videojuego v1;
	
	@GetMapping("videojuego")
	public Videojuego obtenerVideojuego() {
		
		return v1;

	}
	
	@PutMapping("videojuego")
	public String modificar() {
		v1.setPrecio(79.99);
		return "Precio Modificado";
	}


}
