package com.credibanco.assesment.library.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.validation.constraints.NotBlank;

@Entity
public class Autor {		
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nombre", nullable = false)	
	@NotBlank
	private String nombre;
	
	@Column(name = "fecha_nacimiento", nullable = true)
	private String fecha_nacimiento;
	
	@Column(name = "ciudad_procedencia", nullable = true)
	private String ciudad_procedencia;
	
	@Column(name = "correo", nullable = true)	
	private String correo;
	
	@OneToMany(cascade = CascadeType.ALL,
			   fetch = FetchType.LAZY,
			   mappedBy = "autor")
	private List<Libro> libros;
		
	public Autor() {
		
	}
	
	

	public Autor(String nombre, String fecha_nacimiento, String ciudad_procedencia, String correo) {
		
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.ciudad_procedencia = ciudad_procedencia;
		this.correo = correo;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getCiudad_procedencia() {
		return ciudad_procedencia;
	}

	public void setCiudad_procedencia(String ciudad_procedencia) {
		this.ciudad_procedencia = ciudad_procedencia;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento
				+ ", ciudad_procedencia=" + ciudad_procedencia + ", correo=" + correo + ", libros=" + libros + "]";
	}
	
	

}
