package com.restvideojuego.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restvideojuego.modelo.entidad.Videojuego;
import com.restvideojuego.modelo.persistencia.DaoVideojuego;


@RestController
public class ControladorVideojuego {

	@Autowired
	private DaoVideojuego daoVideojuego;
	
	@GetMapping("videojuegos")
	public ResponseEntity<List<Videojuego>> listar(){
		List<Videojuego> lista = daoVideojuego.listado();
		
		//Con un objeto de tipo ResponseEntity podemos devolver datos
		//y ademas codigos de respuesta
		ResponseEntity<List<Videojuego>> re = 
				new ResponseEntity<List<Videojuego>>(lista, HttpStatus.OK);
		
		return re;
	}
	
	//Cuando tenemos un parametro variable debemos de poner el nombre
	//de la variable entre corchetes, y lo recogemos con la anotacion
	//@PathVariable dentro de los argumentos de entrada del metodo
	@GetMapping("videojuegos/{id}")
	public ResponseEntity<Videojuego> obtener(@PathVariable("id") int id_videojuego){
		System.out.println("El id a buscar es: " + id_videojuego);
		
		Videojuego v1 = daoVideojuego.buscar(id_videojuego);
		HttpStatus hs = null;
		if(v1 != null) {
			hs = HttpStatus.OK;
		}else {
			hs = HttpStatus.NOT_FOUND;
		}
		
		ResponseEntity<Videojuego> re = new ResponseEntity<Videojuego>(v1,hs);
		
		return re;
	}
	
	//Con la anotacion @RequestBodoy Spring va a intentar coger la informacion
	//que me ponga el cliente en el body del http y convertirlo a un objeto
	//de tipo personas
	@PostMapping("videojuegos")
	public ResponseEntity<Videojuego> alta(@RequestBody Videojuego v) {
		Videojuego pAlta = daoVideojuego.alta(v);
		
		ResponseEntity<Videojuego> re = 
				new ResponseEntity<Videojuego>(pAlta,HttpStatus.CREATED);
		return re;
	}
	
	//Para modificar usaremos el verbo PUT
	//recurso que vamos a mapear
	@PutMapping("videojuegos/{id}")
	public ResponseEntity<Videojuego> modificar(@RequestBody Videojuego v,
			@PathVariable("id") int id_videojuego){
		//Aqui me va venir el id por el parametro de URL y el resto
		//de la informacion a cambiar por el body
		//Asi pues le meto el id a la persona que me llega para juntarlos
		v.setId(id_videojuego);
		
		Videojuego vModificada = daoVideojuego.modificar(v);
		
		HttpStatus hs = null;
		if(vModificada != null) {
			hs = HttpStatus.OK;
		}else {
			hs = HttpStatus.NOT_FOUND;
		}
		
		ResponseEntity<Videojuego> re = 
				new ResponseEntity<Videojuego>(vModificada,hs);
		
		return re;
	}
	//Para borrar usaremos el metodoo DELETE
	@DeleteMapping("videojuegos/{id}")
	public ResponseEntity<Videojuego> borrar(@PathVariable("id") int id_videojuego){
		Videojuego v = daoVideojuego.borrar(id_videojuego);
		HttpStatus hs = null;
		if(v != null) {
			hs = HttpStatus.OK;
		}else {
			hs = HttpStatus.NOT_FOUND;
		}
		
		ResponseEntity<Videojuego> re = 
				new ResponseEntity<Videojuego>(v,hs);
		
		return re;
	}
	
}
