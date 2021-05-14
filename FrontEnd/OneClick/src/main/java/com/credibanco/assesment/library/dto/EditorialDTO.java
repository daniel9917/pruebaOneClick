package com.credibanco.assesment.library.dto;

import javax.validation.constraints.NotBlank;

public class EditorialDTO {
		
	
	@NotBlank(message = "Error: No puede haber una editorial sin nombre.")
	private String nombre;
	
	
	@NotBlank(message = "Error: No puede haber una editorial sin dirección.")
	private String direccion;
	
	
	@NotBlank(message = "Error: No puede haber una editorial sin teléfono.")
	private String telefono;
	
	
	private String correo;
	
	private int max_libros;
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public int getMax_libros() {
		return max_libros;
	}



	public void setMax_libros(int max_libros) {
		this.max_libros = max_libros;
	}



	public EditorialDTO() {
		
	}



	public EditorialDTO(@NotBlank(message = "Error: No puede haber una editorial sin nombre.") String nombre,
			@NotBlank(message = "Error: No puede haber una editorial sin dirección.") String direccion,
			@NotBlank(message = "Error: No puede haber una editorial sin teléfono.") String telefono, String correo,
			@NotBlank int max_libros) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.max_libros = max_libros;
	}
	
	

}
