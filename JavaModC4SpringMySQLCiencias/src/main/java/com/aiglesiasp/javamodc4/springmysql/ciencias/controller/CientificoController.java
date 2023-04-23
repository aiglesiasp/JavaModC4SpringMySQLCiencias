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

import com.aiglesiasp.javamodc4.springmysql.ciencias.dto.Cientifico;
import com.aiglesiasp.javamodc4.springmysql.ciencias.service.CientificoServiceImpl;

/**
 * @author aitor
 *
 */
@RestController
@RequestMapping("/api")
public class CientificoController {

	@Autowired
	CientificoServiceImpl cientificoServiceImpl;

	@GetMapping("/cientificos")
	public List<Cientifico> listarCientifico() {
		return cientificoServiceImpl.listarCientifico();
	}

	@PostMapping("/cientificos")
	public Cientifico guardarCientifico(@RequestBody Cientifico cientifico) {
		return cientificoServiceImpl.guardarCientifico(cientifico);
	}

	@GetMapping("/cientificos/{id}")
	public Cientifico cientificoById(@PathVariable(name = "id") int id) {
		Cientifico pieza = new Cientifico();
		pieza = cientificoServiceImpl.cientificoById(id);
		return pieza;
	}

	@PutMapping("/cientificos/{id}")
	public Cientifico actualizarCientifico(@PathVariable(name = "id") int id, @RequestBody Cientifico cientifico) {

		Cientifico cientifico_seleccionado = new Cientifico();
		Cientifico cientifico_actualizado = new Cientifico();
		cientifico_seleccionado = cientificoServiceImpl.cientificoById(id);
		cientifico_seleccionado.setId(id);
		cientifico_seleccionado.setDni(cientifico.getDni());
		cientifico_seleccionado.setNombreApels(cientifico.getNombreApels());
		cientifico_seleccionado.setAsignado(cientifico.getAsignado());
		


		cientifico_actualizado = cientificoServiceImpl.actualizarCientifico(cientifico_seleccionado);

		return cientifico_actualizado;
	}

	@DeleteMapping("/cientificos/{id}")
	public void eliminarCientifico(@PathVariable(name = "id") int id) {
		cientificoServiceImpl.eliminarCientifico(id);
	}

}
