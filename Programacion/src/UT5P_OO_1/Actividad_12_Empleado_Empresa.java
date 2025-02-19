package UT5P_OO_1;

public class Actividad_12_Empleado_Empresa {

	public static void main(String[] args) {
		
		Empleado_Empresa empleado1 = new Empleado_Empresa ("Gonzalo", 42, 20);
		Empleado_Empresa empleado2 = new Empleado_Empresa ("Elena", 35, 35);
		Empleado_Empresa empleado3 = new Empleado_Empresa ("Paula", 50, 18);
		
		
		empleado1.sueldo();
		empleado2.sueldo();
		empleado3.sueldo();
		
	}

}