/**
 * 
 */
package com.gmd.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.gmd.projectjsf.entity.Empleado;

/**
 * @author Juan Eduardo
 * Clase que permite realizar la logica de negocio para empleados.
 */
public class EmpleadoService {

	/**
	 * Metodo que permite consultar la lista de empleados de empresas TI. 
	 */
		public List<Empleado> consultarEmpleado() {
			List<Empleado> empleados = new ArrayList<Empleado>();
			
			Empleado empleadoIBM = new Empleado();
			Empleado empleadoMicrosoft = new Empleado();
			Empleado empleadoApple = new Empleado();
			
			empleadoIBM.setNombre("Jose");
			empleadoIBM.setPrimerApellido("Alberto");
			empleadoIBM.setSegundoApellido("Rodriguez");
			empleadoIBM.setPuesto("Senior Developer Java");
			empleadoIBM.setEstatus(true);
			
			empleadoMicrosoft.setNombre("Luis Jesus");
			empleadoMicrosoft.setPrimerApellido("Lopez");
			empleadoMicrosoft.setSegundoApellido("Romero");
			empleadoMicrosoft.setPuesto("CEO");
			empleadoMicrosoft.setEstatus(true);
			
			empleadoApple.setNombre("Daniel");
			empleadoApple.setPrimerApellido("López");
			empleadoApple.setSegundoApellido("Rodriguez");
			empleadoApple.setPuesto("Arquitect");
			empleadoApple.setEstatus(true);
			
			empleados.add(empleadoIBM);
			empleados.add(empleadoMicrosoft);
			empleados.add(empleadoApple);
			
			return empleados;
		}
}
