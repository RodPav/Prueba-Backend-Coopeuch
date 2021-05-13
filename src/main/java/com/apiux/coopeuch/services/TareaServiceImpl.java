/**
 * 
 */
package com.apiux.coopeuch.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiux.coopeuch.models.Tarea;
import com.apiux.coopeuch.repositories.TareaRepository;

/**
 * @author Rodrigo Pavez
 *
 */

@Service
public class TareaServiceImpl implements TareaService {

	@Autowired
	TareaRepository tareaRepo;

	@Override
	public Tarea agregarTarea(Tarea tarea) {

		return tareaRepo.save(tarea);
	}

	@Override
	public List<Tarea> listarTareas() {

		return (List<Tarea>) tareaRepo.findAll();
	}

	@Override
	public void eliminarTarea(Long id) {

		tareaRepo.deleteById(id);
	}

	@Override
	public Tarea editarTarea(Tarea nuevaTarea, Long id) {

		return tareaRepo.findById(id).map(tarea -> {
			tarea.setDescripcion(nuevaTarea.getDescripcion());
			tarea.setFechaCreacion(nuevaTarea.getFechaCreacion());
			tarea.setVigente(nuevaTarea.isVigente());
			return tareaRepo.save(tarea);
		}).orElseGet(() -> {
			nuevaTarea.setId(id);
			return tareaRepo.save(nuevaTarea);
		});
	}

}
