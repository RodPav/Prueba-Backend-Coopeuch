package com.apiux.coopeuch.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiux.coopeuch.models.Tarea;
import com.apiux.coopeuch.services.TareaService;



/**
 * @author Rodrigo Pavez
 *
 */

/**
 * @author xenom
 *
 */
@RestController
@RequestMapping(TareaController.BASE_URL)
public class TareaController {

	public static final String BASE_URL = "api/coopeuch/tareas";

	@Autowired
	TareaService tareaService;

	@GetMapping
	public List<Tarea> obtenerTareas() {
		return tareaService.listarTareas();
	}

	@PostMapping
	public Tarea agregarTarea(@Valid @RequestBody Tarea tarea) {

		return tareaService.agregarTarea(tarea);
	}

	@PutMapping("/{id}")
	public Tarea editarTarea(@Valid @RequestBody Tarea nuevaTarea, @PathVariable Long id) {
		return tareaService.editarTarea(nuevaTarea, id);

	}

	@DeleteMapping("/{id}")
	public void eliminarTarea(@PathVariable Long id) {

		tareaService.eliminarTarea(id);

	}

}
