package Mi_Espacio;

public class Persona {
	
	private String nombre;
	private int edad;
	private String dni;
	
	
	
	public Persona(String nombre, int edad, String dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}
	
	
	
	public void total () {
		System.out.println(nombre + "; " + edad + " años; " + dni);
	}
}