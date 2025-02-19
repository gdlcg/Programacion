package UT5P_OO_1;

public class Asignatura {
	
	private String nombre;
	private float nota;
	
	
	
	public Asignatura(String nombre, float nota) {
		this.nombre = nombre;
		this.nota = nota;
	}


	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public float getNota() {
		return nota;
	}
	
	public void setNota(float nota) {
		this.nota = nota;
	}
	
	
	
	public String calificacion() {
		
		return (nota<5 ? "Suspenso":"Aprobado");
	}
}