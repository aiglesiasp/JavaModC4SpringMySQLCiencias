/**
 * 
 */
package com.aiglesiasp.javamodc4.springmysql.ciencias.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiglesiasp.javamodc4.springmysql.ciencias.dao.IProyectoDAO;
import com.aiglesiasp.javamodc4.springmysql.ciencias.dto.Proyecto;

/**
 * @author aitor
 *
 */
@Service
public class ProyectoServiceImpl implements IProyectoService {

	@Autowired
	IProyectoDAO iProyectoDAO;

	@Override
	public List<Proyecto> listarProyecto() {
		return iProyectoDAO.findAll();
	}

	@Override
	public Proyecto guardarProyecto(Proyecto proyecto) {
		return iProyectoDAO.save(proyecto);
	}

	@Override
	public Proyecto proveedorById(int id) {
		return iProyectoDAO.findById(id).get();
	}

	@Override
	public Proyecto actualizarProyecto(Proyecto proyecto) {
		return iProyectoDAO.save(proyecto);
	}

	@Override
	public void eliminarProyecto(int id) {
		iProyectoDAO.deleteById(id);

	}

}
