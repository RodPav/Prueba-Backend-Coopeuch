package com.apiux.coopeuch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apiux.coopeuch.models.Tarea;

/**
 * @author Rodrigo Pavez
 *
 */

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Long> {

}
