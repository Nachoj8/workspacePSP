package com.restvideojuego.modelo.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.restvideojuego.modelo.entidad.Videojuego;

@Component
public class DaoVideojuego {
	
		private List<Videojuego> listaVideojuegos;
		private int contador = 0;
		
		
		public DaoVideojuego() {
			Videojuego v1 = new Videojuego();
			v1.setId(contador++);
			v1.setNombre("Call of Duty");
			v1.setCompañia("Activision");
			v1.setPrecio(69.99);
			v1.setPuntuacion(8);
			
			Videojuego v2 = new Videojuego();
			v2.setId(contador++);
			v2.setNombre("Last of Us");
			v2.setCompañia("Nauty Dog");
			v2.setPrecio(79.99);
			v2.setPuntuacion(9);
			
			listaVideojuegos = new ArrayList<Videojuego>();
			listaVideojuegos.add(v1);
			listaVideojuegos.add(v2);
			
		}
		
		//Tendriamos que hacer los metodos de get, post, put, delete
		
		public List<Videojuego> listado() {
			return listaVideojuegos;
		}
		
		// Para documentar por javadoc, ponemos /** y pulsamos enter
		
		/**
		 * Metodo que busca una persona por un id
		 * @param id representa el id a buscar
		 * @return la Persona con el id a buscar o null en caso de que la persona
		 * no exista
		 */
		public Videojuego buscar(int id) {
			Videojuego videojuego = null;
			for(Videojuego v : listaVideojuegos) {
				if(v.getId() == id) {
					videojuego = v;
					break;
				}
			}
			
			return videojuego;
		}
		
		public Videojuego alta(Videojuego v) {
			v.setId(contador++);
			listaVideojuegos.add(v);
			return v;
		}
		
		/**
		 * Metodo que modifica una persona a partir de un ID
		 * @param pModificar la persona que queremos modificar, dentro del atributo
		 * id contendra el id que queremos modificar
		 * @return Persona modificada o null en caso de que no encontremos el id
		 * de la persona
		 */
		public Videojuego modificar(Videojuego vModificar) {
			Videojuego v = buscar(vModificar.getId());
			if(v != null) {
				v.setNombre(vModificar.getNombre());
				v.setCompañia(vModificar.getCompañia());
				v.setPrecio(vModificar.getPrecio());
				v.setPuntuacion(vModificar.getPuntuacion());
			}		
			return v;
		}
		
		public Videojuego borrar(int id) {
			Videojuego v = buscar(id);
			if(v != null) {
				listaVideojuegos.remove(id);
			}
			return v;
		}

	
}
