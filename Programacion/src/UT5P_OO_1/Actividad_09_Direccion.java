package UT5P_OO_1;

public class Actividad_09_Direccion {

	public static void main(String[] args) {
		
		
		Direccion dir1 = new Direccion ("San Sebastian", 9, "1ºA", "Sevilla");
		Direccion dir2 = new Direccion ("San Jose", 3, "3ºC", "Cordoba");
		Direccion dir3 = new Direccion ("Constitucion", 22, "2ºA", "Madrid");
		
		
		Empleado_Direccion ed1 = new Empleado_Direccion ("Gonzalo", 1500, dir1);
		Empleado_Direccion ed2 = new Empleado_Direccion ("Elena", 1214, dir2);
		Empleado_Direccion ed3 = new Empleado_Direccion ("Paula", 1622, dir3);
		
		
		ed1.mostrar(1);
		ed2.mostrar(2);
		ed3.mostrar(3);
		
	}

}
