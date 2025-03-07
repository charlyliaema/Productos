package com.mx.Productos.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Productos.Dao.MetodosDao;
import com.mx.Productos.Dominio.Productos;

@Service //indica que esta clase representa la logica de una aplicacion
public class Implementacion implements Metodos{
	
	// inyeccion de dependencias
	/*
	 * @Autowired 
	MetodosDao dao; es crear una unica instancia con el ambito simgleton y se comparte en toda la
	aplicacion de  esa manera ya no estamos inicializando objeto
	 * */
	@Autowired 
	MetodosDao dao;
	
	@Override
	public void guardar(Productos producto) {
		dao.save(producto);
		System.out.println("Se guardo el producto");
		
	}

	@Override
	public void editar(Productos producto) {
		dao.save(producto);
		System.out.println("Se actualizo el producto");
		
	}

	@Override
	public void eliminar(Productos producto) {
		dao.delete(producto);
		System.out.println("Se elimino el producto");
		
	}

	@Override
	public Productos buscar(Productos producto) {
		
		return dao.findById(producto.getId()).orElse (null);//orElse en caso que no encuentre el producto que me retorne vacio
	}

	@Override
	public List<Productos> listar() {
		
		return (List<Productos>) dao.findAll();
	}
	
	

}
