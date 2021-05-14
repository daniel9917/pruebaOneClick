package com.credibanco.assesment.library.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;



public class AutorDTO {
	
	@NotBlank(message = "No se puede tener un autor sin nombre")
	private String nombre;
		
	private String fecha_nacimiento;
	
	private String ciudad_procedencia;
	
	@Email(message = "Por favor ingrese un email válido")	
	private String correo;

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
	
	public AutorDTO() {
		
	}

	public AutorDTO(String nombre, String fecha_nacimiento,String ciudad_procedencia, String correo) {
		super();
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.ciudad_procedencia = ciudad_procedencia;
		this.correo = correo;
	}
	
	
	
	
	
	

}
