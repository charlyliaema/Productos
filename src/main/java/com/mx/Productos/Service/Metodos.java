package com.mx.Productos.Service;

import java.util.List;

import com.mx.Productos.Dominio.Productos;

public interface Metodos {
	
	public void guardar(Productos producto);
	public void editar(Productos producto);
	public void eliminar(Productos producto);
	
	public Productos buscar(Productos producto);
	public List<Productos> listar();
	

}
