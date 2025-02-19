package ZZZEJEMPLO;

public class Padre {
	
	private String nombre;
	private int edad;
	
	
	
	public Padre(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	public String toString() {
		return "Persona { nombre: " + nombre + ", edad: " + edad + " }";
	}
	
	
	
	
}


/*public void mostrar() {
System.out.println("Soy el Padre");
}*/