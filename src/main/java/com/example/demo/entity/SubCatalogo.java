package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "sub_catalogos")
public class SubCatalogo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="id_catalogo")
	private Long id_catalogo;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="codigo")
	private Long codigo;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId_catalogo() {
		return id_catalogo;
	}

	public void setId_catalogo(Long id_catalogo) {
		this.id_catalogo = id_catalogo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	
	
	private static final long serialVersionUID = 1L; 


}
