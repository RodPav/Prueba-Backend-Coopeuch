
package com.apiux.coopeuch.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * @author Rodrigo Pavez
 *
 */

@Entity
public class Tarea implements java.io.Serializable {
	
    private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_tarea")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 2)
	private String descripcion;
	
	@NotNull(message = "Campo obligatorio")
	private Date fechaCreacion;
	
	@NotNull(message = "Campo obligatorio")
	private boolean vigente;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public boolean isVigente() {
		return vigente;
	}
	public void setVigente(boolean vigente) {
		this.vigente = vigente;
	}

	
	
	

}
