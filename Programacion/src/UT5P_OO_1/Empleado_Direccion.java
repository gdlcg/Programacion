package UT5P_OO_1;

public class Empleado_Direccion {
	
	private String nombre;
	private int salario;
	private Direccion direccion;
	
	
	
	public Empleado_Direccion(String nombre, int salario, Direccion direccion) {
		this.nombre = nombre;
		this.salario = salario;
		this.direccion = direccion;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getSalario() {
		return salario;
	}
	
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public Direccion getDireccion() {
		return direccion;
	}
	
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	
	
	public void mostrar(int numeroEmpleado) {
		
		System.out.println("EMPLEADO " + numeroEmpleado);
		System.out.println("Nombre: " + nombre);
		System.out.println("Salario: " + salario);
		System.out.println("Direccion: ");
		System.out.println("  Calle: " + direccion.getCalle());
		System.out.println("  Numero: " + direccion.getNumero());
		System.out.println("  Puerta: " + direccion.getPiso());
		System.out.println("  Ciudad: " + direccion.getCiudad());
		System.out.println();
		System.out.println();
	}
	
}