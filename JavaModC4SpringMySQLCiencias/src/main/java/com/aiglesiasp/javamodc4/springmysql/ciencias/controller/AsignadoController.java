/**
 * 
 */
package com.aiglesiasp.javamodc4.springmysql.ciencias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiglesiasp.javamodc4.springmysql.ciencias.dto.Asignado;
import com.aiglesiasp.javamodc4.springmysql.ciencias.service.AsignadoServiceImpl;

/**
 * @author aitor
 *
 */
@RestController
@RequestMapping("/api")
public class AsignadoController {

	@Autowired
	AsignadoServiceImpl asignadoServiceImpl;;

	@GetMapping("/asignados")
	public List<Asignado> listarAsignado() {
		return asignadoServiceImpl.listarAsignado();
	}

	@PostMapping("/asignados")
	public Asignado guardarAsignado(@RequestBody Asignado asignado) {
		return asignadoServiceImpl.guardarAsignado(asignado);
	}

	@GetMapping("/asignados/{id}")
	public Asignado asignadoById(@PathVariable(name = "id") int id) {
		Asignado asignado = new Asignado();
		asignado = asignadoServiceImpl.asignadoById(id);
		return asignado;
	}

	@PutMapping("/asignados/{id}")
	public Asignado actualizarAsignado(@PathVariable(name = "id") int id, @RequestBody Asignado asignado) {

		Asignado asignado_seleccionado = new Asignado();
		Asignado asignado_actualizado = new Asignado();
		asignado_seleccionado = asignadoServiceImpl.asignadoById(id);
		asignado_seleccionado.setId(id);
		asignado_seleccionado.setCientifico(asignado.getCientifico());
		asignado_seleccionado.setProyecto(asignado.getProyecto());

		asignado_actualizado = asignadoServiceImpl.actualizarAsignado(asignado_seleccionado);
		return asignado_actualizado;
	}

	@DeleteMapping("/asignados/{id}")
	public void eliminarAsignado(@PathVariable(name = "id") int id) {
		asignadoServiceImpl.eliminarAsignado(id);
	}

}
