package Views;

import controllers.EmpleadoController;

public class EmpleadoView {

	public static void main(String[] args) {
		
		//Crear Empleado - C
		//String empleado = new EmpleadoController().createEmpleado("Palacios","Pedro",32,"Masculino","4250");
		
		//Leer Usuario - R
		//String empleado = new EmpleadoController().getEmpleado(6);
		
		//Actualizar Usuario - U
		//String empleado = new EmpleadoController().updateEmpleado(6, "Julio");
		
		//Eliminar Usuario - D
		String empleado = new EmpleadoController().deleteEmpleado(6);
		
		System.out.println(empleado);
		
	}

}
