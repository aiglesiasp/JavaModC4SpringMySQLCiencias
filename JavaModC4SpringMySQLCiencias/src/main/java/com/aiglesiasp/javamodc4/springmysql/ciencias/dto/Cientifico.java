/**
 * 
 */
package com.aiglesiasp.javamodc4.springmysql.ciencias.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author aitor
 *
 */
@Entity
@Table(name = "cientifico")
public class Cientifico {
	// Atributos de entidad departamento
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "dni")
	private String dni;
	@Column(name = "nomApels")
	private String nombreApels;

	@OneToMany
	@JoinColumn(name = "asignado")
	private List<Asignado> asignado;

	// CONSTRUCTORES
	public Cientifico() {

	}

	public Cientifico(String dni, String nombreApels) {
		this.dni = dni;
		this.nombreApels = nombreApels;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreApels() {
		return nombreApels;
	}

	public void setNombreApels(String nombreApels) {
		this.nombreApels = nombreApels;
	}

	public void setAsignado(List<Asignado> asignado) {
		this.asignado = asignado;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Asignado")
	public List<Asignado> getAsignado() {
		return asignado;
	}

	@Override
	public String toString() {
		return "Cientifico [dni=" + dni + ", nombreApels=" + nombreApels + ", asignado=" + asignado + "]";
	}

}
