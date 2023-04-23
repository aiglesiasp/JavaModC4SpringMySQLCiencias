/**
 * 
 */
package com.aiglesiasp.javamodc4.springmysql.ciencias.service;

import java.util.List;

import com.aiglesiasp.javamodc4.springmysql.ciencias.dto.Asignado;

/**
 * @author aitor
 *
 */
public interface IAsignadoService {
	// Metodos del CRUD
	public List<Asignado> listarAsignado();

	public Asignado guardarAsignado(Asignado asignado);

	public Asignado asignadoById(int id);

	public Asignado actualizarAsignado(Asignado asignado);

	public void eliminarAsignado(int id);

}
