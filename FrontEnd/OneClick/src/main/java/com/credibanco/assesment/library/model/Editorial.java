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
public class Editorial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nombre", nullable = false)
	@NotBlank(message = "Error: No puede haber una editorial sin nombre.")
	private String nombre;
	
	@Column(name = "direccion", nullable = false)
	@NotBlank(message = "Error: No puede haber una editorial sin dirección.")
	private String direccion;
	
	@Column(name = "telefono", nullable = false)
	@NotBlank(message = "Error: No puede haber una editorial sin teléfono.")
	private String telefono;
	
	@Column(name = "correo", nullable = true)
	private String correo;
	
	@Column(name = "max_libros", nullable = false, columnDefinition = "integer default -1")
	private int max_libros;
	
	@OneToMany(cascade = CascadeType.ALL,
			   fetch = FetchType.LAZY,
			   mappedBy = "editorial"
			   )
	private List<Libro> libros;
	
	public Editorial() {
		
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

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Editorial [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", correo=" + correo + ", max_libros=" + max_libros + ", libros=" + libros + "]";
	}

	public Editorial(@NotBlank(message = "Error: No puede haber una editorial sin nombre.") String nombre,
			@NotBlank(message = "Error: No puede haber una editorial sin dirección.") String direccion,
			@NotBlank(message = "Error: No puede haber una editorial sin teléfono.") String telefono, String correo,
			int max_libros) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
		this.max_libros = max_libros;
	}
	
	
	

}
