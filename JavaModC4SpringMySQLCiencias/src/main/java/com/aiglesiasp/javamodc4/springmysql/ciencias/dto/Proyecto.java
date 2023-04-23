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
@Table(name = "proyecto")
public class Proyecto {
	// Atributos de entidad departamento
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "horas")
	private int horas;
	

	@OneToMany
	@JoinColumn(name = "asignado")
	private List<Asignado> asignado;

	// CONSTRUCTORES
	public Proyecto() {

	}

	public Proyecto(String nombre, int horas) {
		this.nombre = nombre;
		this.horas = horas;
	}

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



	public int getHoras() {
		return horas;
	}



	public void setHoras(int horas) {
		this.horas = horas;
	}



	public void setAsignado(List<Asignado> asignado) {
		this.asignado = asignado;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Asignado")
	public List<Asignado> getAsignado() {
		return asignado;
	}

	

}
