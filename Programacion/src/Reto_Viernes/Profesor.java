package Reto_Viernes;

import java.util.ArrayList;
import java.util.Scanner;

public class Profesor {
	
	Scanner leer = new Scanner (System.in);

	// atributos
	private String nombre;
	private ArrayList<Curso> listaCurso = new ArrayList<>();

	// constructor
	public Profesor(String nombre, ArrayList<Curso> listaCurso) {
		this.nombre = nombre;
		this.listaCurso = listaCurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Curso> getListaCurso() {
		return listaCurso;
	}

	public void setListaCurso(ArrayList<Curso> listaCurso) {
		this.listaCurso = listaCurso;
	}
	
	
	public void ponerCurso() {
		System.out.println("Nombre del curso");
		String curso;
		curso=leer.nextLine();
		System.out.println("Codigo del curso");
		String cod;
		cod=leer.nextLine();
		
		Curso c = new Curso(curso, cod);
		
		listaCurso.add(c);
	}
	
	
	public void listar() {
		if (listaCurso.size()==0) {
			System.out.println("No hay nada que mostrar");
		}else {
			for (Curso a : listaCurso) {
				System.out.println(a.getNombre());
			}
		}
	}
	
	
	public void eliminarCurso() {
		System.out.println("Cual es el nombre del curso");
		String nombre;
		nombre = leer.nextLine();
		
		for (Curso a : listaCurso) {
			if (nombre.equals(a.getNombre())) {
				listaCurso.remove(a);
				break;
			}
		}
	}
	
}