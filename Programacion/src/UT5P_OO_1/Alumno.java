package UT5P_OO_1;

import java.util.ArrayList;

public class Alumno {
	
	private String nombre;
	private int edad;
	private ArrayList<Asignatura>lista = new ArrayList<>();
	
	

	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public ArrayList<Asignatura> getLista() {
		return lista;
	}
	
	public void setLista(ArrayList<Asignatura> lista) {
		this.lista = lista;
	}
	
}