/**
 * 
 */
package com.aiglesiasp.javamodc4.springmysql.ciencias.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author aitor
 *
 */
@Entity
@Table(name = "asignado")
public class Asignado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "cientifico")
	private Cientifico cientifico;

	@ManyToOne
	@JoinColumn(name = "proyecto")
	private Proyecto proyecto;

	// CONTRUCTORES
	public Asignado() {

	}

	public Asignado(Cientifico cientifico, Proyecto proyecto) {
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cientifico getCientifico() {
		return cientifico;
	}

	public void setCientifico(Cientifico cientifico) {
		this.cientifico = cientifico;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	@Override
	public String toString() {
		return "Asignado [id=" + id + ", cientifico=" + cientifico + ", proyecto=" + proyecto + "]";
	}

}
