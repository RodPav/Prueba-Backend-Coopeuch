package com.apiux.coopeuch.services;

import java.util.List;

import com.apiux.coopeuch.models.Tarea;

/**
 * @author Rodrigo Pavez
 *
 */
public interface TareaService {
	
	Tarea agregarTarea(Tarea tarea);
	
	List<Tarea> listarTareas();
	
	void eliminarTarea(Long id);
	
	Tarea editarTarea(Tarea nuevaTarea, Long id);

	

}
