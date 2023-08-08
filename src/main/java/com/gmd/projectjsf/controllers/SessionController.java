/**
 * 
 */
package com.gmd.projectjsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.gmd.projectjsf.dto.UsuarioDTO;

/**
 * @author Juan Eduardo
 * Clase que se encarga de mantener información del usuario que ingresa al aplicativo
 */

@ManagedBean
@SessionScoped
public class SessionController {

	private UsuarioDTO usuarioDTO;
	
	@PostConstruct
	public void init() {
		System.out.println("Cargando informacion del usuario en las Session");
	}

	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
}
