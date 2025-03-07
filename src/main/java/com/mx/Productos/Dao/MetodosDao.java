package com.mx.Productos.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.Productos.Dominio.Productos;

@Repository //indica que la interface tendra acceso a la base datos
public interface MetodosDao extends CrudRepository<Productos, Integer>{
	
	/*
	 * CrudRepository<Productos, Integer> es un repositorio de srping dara y contiene todos los metodos
	 * del CRUD para cualquier aplicacion
	 * 
	 * Metodo listar
	 * findAll()
	 * 
	 * Guardar
	 * Save (E)
	 * 
	 * Buscar
	 * findById
	 * 
	 * Update
	 * Save (E)
	 * 
	 * Eliminar
	 * Delete(E)
	 * 
	 * */

}
