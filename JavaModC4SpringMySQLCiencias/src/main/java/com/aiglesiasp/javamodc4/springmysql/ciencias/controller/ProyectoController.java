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

import com.aiglesiasp.javamodc4.springmysql.ciencias.dto.Proyecto;
import com.aiglesiasp.javamodc4.springmysql.ciencias.service.ProyectoServiceImpl;

/**
 * @author aitor
 *
 */
@RestController
@RequestMapping("/api")
public class ProyectoController {

	@Autowired
	ProyectoServiceImpl proyectoServiceImpl;

	@GetMapping("/proyectos")
	public List<Proyecto> listarProyecto() {
		return proyectoServiceImpl.listarProyecto();
	}

	@PostMapping("/proyectos")
	public Proyecto guardarProyecto(@RequestBody Proyecto proyecto) {
		return proyectoServiceImpl.guardarProyecto(proyecto);
	}

	@GetMapping("/proyectos/{id}")
	public Proyecto proveedorById(@PathVariable(name = "id") int id) {
		Proyecto proveedor = new Proyecto();
		proveedor = proyectoServiceImpl.proveedorById(id);
		return proveedor;
	}

	@PutMapping("/proyectos/{id}")
	public Proyecto actualizarProyecto(@PathVariable(name = "id") int id, @RequestBody Proyecto proyecto) {

		Proyecto proyecto_seleccionado = new Proyecto();
		Proyecto proyecto_actualizado = new Proyecto();
		proyecto_seleccionado = proyectoServiceImpl.proveedorById(id);

		proyecto_seleccionado.setNombre(proyecto.getNombre());
		proyecto_seleccionado.setId(id);
		proyecto_seleccionado.setHoras(proyecto.getHoras());
		proyecto_seleccionado.setAsignado(proyecto.getAsignado());

		proyecto_actualizado = proyectoServiceImpl.actualizarProyecto(proyecto_seleccionado);
		return proyecto_actualizado;
	}

	@DeleteMapping("/proyectos/{id}")
	public void eliminarProyecto(@PathVariable(name = "id") int id) {
		proyectoServiceImpl.eliminarProyecto(id);
	}

}
