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
			
			Empleado empleadoNetflix = new Empleado();
			Empleado empleadoAmazon = new Empleado();
			Empleado empleadoHP = new Empleado();
			
			Empleado empleadoOracle = new Empleado();
			Empleado empleadoDeloitte = new Empleado();
			Empleado empleadoDisney = new Empleado();
			
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
			
			empleadoNetflix.setNombre("Carlos");
			empleadoNetflix.setPrimerApellido("Lopez");
			empleadoNetflix.setSegundoApellido("Romero");
			empleadoNetflix.setPuesto("CEO");
			empleadoNetflix.setEstatus(true);
			
			empleadoAmazon.setNombre("Christian");
			empleadoAmazon.setPrimerApellido("López");
			empleadoAmazon.setSegundoApellido("Rodriguez");
			empleadoAmazon.setPuesto("Arquitect");
			empleadoAmazon.setEstatus(true);
			
			empleadoHP.setNombre("Lupita");
			empleadoHP.setPrimerApellido("López");
			empleadoHP.setSegundoApellido("Rodriguez");
			empleadoHP.setPuesto("Arquitect");
			empleadoHP.setEstatus(true);
			
			empleadoOracle.setNombre("Adrián");
			empleadoOracle.setPrimerApellido("López");
			empleadoOracle.setSegundoApellido("Rodriguez");
			empleadoOracle.setPuesto("Arquitect");
			empleadoOracle.setEstatus(true);
			
			empleadoDeloitte.setNombre("Luisa");
			empleadoDeloitte.setPrimerApellido("López");
			empleadoDeloitte.setSegundoApellido("Rodriguez");
			empleadoDeloitte.setPuesto("Arquitect");
			empleadoDeloitte.setEstatus(true);
			
			empleadoDisney.setNombre("Cesar");
			empleadoDisney.setPrimerApellido("López");
			empleadoDisney.setSegundoApellido("Rodriguez");
			empleadoDisney.setPuesto("Arquitect");
			empleadoDisney.setEstatus(true);
			
			empleados.add(empleadoIBM);
			empleados.add(empleadoMicrosoft);
			empleados.add(empleadoApple);
			
			empleados.add(empleadoNetflix);
			empleados.add(empleadoAmazon);
			empleados.add(empleadoHP);
			
			empleados.add(empleadoOracle);
			empleados.add(empleadoDeloitte);
			empleados.add(empleadoDisney);
			
			return empleados;
		}
}
