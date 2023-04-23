/**
 * 
 */
package com.aiglesiasp.javamodc4.springmysql.ciencias.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiglesiasp.javamodc4.springmysql.ciencias.dao.IAsignadoDAO;
import com.aiglesiasp.javamodc4.springmysql.ciencias.dto.Asignado;

/**
 * @author aitor
 *
 */
@Service
public class AsignadoServiceImpl implements IAsignadoService {
	@Autowired
	IAsignadoDAO iAsignadoDAO;

	@Override
	public List<Asignado> listarAsignado() {
		return iAsignadoDAO.findAll();
	}

	@Override
	public Asignado guardarAsignado(Asignado asignado) {
		return iAsignadoDAO.save(asignado);
	}

	@Override
	public Asignado asignadoById(int id) {
		return iAsignadoDAO.findById(id).get();
	}

	@Override
	public Asignado actualizarAsignado(Asignado asignado) {
		return iAsignadoDAO.save(asignado);
	}

	@Override
	public void eliminarAsignado(int id) {
		iAsignadoDAO.deleteById(id);

	}

}
