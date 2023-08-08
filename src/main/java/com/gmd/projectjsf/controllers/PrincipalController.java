package com.gmd.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.gmd.projectjsf.entity.Empleado;
import com.gmd.projectjsf.services.EmpleadoService;

/*
 * Clase controller que se encarga de procesar la informacion para la pantalla principal.xhtml.
 */

@ManagedBean
@ViewScoped
public class PrincipalController {
	
	/*
	 * Lista de empleados para la tabla.
	 */
	private List<Empleado> empleados;
	
	private List<Empleado> empleadosFiltrados;
	
	public List<Empleado> getEmpleadosFiltrados() {
		return empleadosFiltrados;
	}

	public void setEmpleadosFiltrados(List<Empleado> empleadosFiltrados) {
		this.empleadosFiltrados = empleadosFiltrados;
	}

	/*
	 * Servicio con los metodos que realizan la logica de negocio de empleados.
	 */
	private EmpleadoService empleadoService = new EmpleadoService();
	
	/*
	 * Metodo que se encarga de inicializar la informacion de la pantalla principal
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	/*
	 * metodo que consulta la lista de empleados.
	 */
	public void consultarEmpleados() {
		this.empleados = this.empleadoService.consultarEmpleado();
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
}
