package Reto_Viernes;

public class Curso {
	
	//atributos
	private String nombre;
	private String numero;
	
	
	//constructor
	public Curso(String nombre, String numero) {
		this.nombre = nombre;
		this.numero = numero;
	}
	
	
	//getter and setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	
}