package com.mx.Productos.Dominio;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity //representa una entidad de la base da datos
@Table(name="PRODUCTOS_TRIGGER_2025")// nombre de la tabla
@NoArgsConstructor //constructor vacio
@AllArgsConstructor //constructor con parametros
@ToString  //metodoToString
@Getter    //ecapsulamiento
@Setter    //ecapsulamiento
@Data      // encapsula el metodo tostring y el encapsulamiento
public class Productos {
	/*
	 * CREATE TABLE PRODUCTOS_TRIGGER_2025(
  ID NUMBER PRIMARY KEY,
  NOMBRE NVARCHAR2(50),
  CANTIDAD NUMBER,
  PRECIO_UNITARIO NUMBER,
  FECHA_CADUCIDAD DATE,
  DESCRIPCION NVARCHAR2(100)
  );
  
  ORM --> object relational mapping mapeo de un objeto relacional desde una clase en java
  
  */
	@Id //con el @id se mapea toda la entidad(objeto)
	@Column(name="ID", columnDefinition = "NUMBER")
	int id;
	
	@Column(name="NOMBRE", columnDefinition = "NVARCHAR2(50)", length = 50)
	String nombre;
	
	@Column(name="CANTIDAD", columnDefinition = "NUMBER")
	int cantidad;
	
	@Column(name="PRECIO_UNITARIO", columnDefinition = "NUMBER")
	String precioUnitario;
	
	@Column(name="FECHA_CADUCIDAD", columnDefinition = "DATE")
	@JsonFormat(pattern = "dd/MM/yyyy", timezone = "America/Mexico_City")
	Date fechaCaducidad;
	
	@Column(name="DESCRIPCION", columnDefinition = "NVARCHAR2(100)",length = 100, nullable = false)
	String descripcion;

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

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(String precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public Date getFecha_caducidad() {
		return fechaCaducidad;
	}

	public void setFecha_caducidad(Date fecha_caducidad) {
		this.fechaCaducidad = fecha_caducidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
