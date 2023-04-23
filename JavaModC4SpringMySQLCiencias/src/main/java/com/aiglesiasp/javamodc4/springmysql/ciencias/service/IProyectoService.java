/**
 * 
 */
package com.aiglesiasp.javamodc4.springmysql.ciencias.service;

import java.util.List;

import com.aiglesiasp.javamodc4.springmysql.ciencias.dto.Proyecto;

/**
 * @author aitor
 *
 */
public interface IProyectoService {
	// Metodos del CRUD
	public List<Proyecto> listarProyecto();

	public Proyecto guardarProyecto(Proyecto proyecto);

	public Proyecto proveedorById(int id);

	public Proyecto actualizarProyecto(Proyecto proyecto);

	public void eliminarProyecto(int id);
}
