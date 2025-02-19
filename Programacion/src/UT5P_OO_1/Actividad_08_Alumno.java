package UT5P_OO_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Actividad_08_Alumno {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		ArrayList<Asignatura>lista = new ArrayList<>();
		
		Alumno alu1 = new Alumno ("Gonzalo", 18);
		Alumno alu2 = new Alumno ("Elena", 19);
		Alumno alu3 = new Alumno ("Paula", 20);
		
		Asignatura asg1 = new Asignatura ("Matematicas", 8);
		Asignatura asg2 = new Asignatura ("Biologia", 10);
		Asignatura asg3 = new Asignatura ("Lengua", 7);
		
		lista.add(asg1);
		lista.add(asg2);
		lista.add(asg3);
		
		System.out.println("ALUMNO 1:");
		System.out.println(alu1.getNombre() + ", " + alu1.getEdad() + " años");
		System.out.println();
		
		System.out.println("Asignatura: " + lista.get(0).getNombre());
		System.out.println("Nota: " + lista.get(0).getNota());
		System.out.println("Calificacion: " + lista.get(0).calificacion());
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("ALUMNO 2:");
		System.out.println(alu2.getNombre() + ", " + alu2.getEdad() + " años");
		System.out.println();
		
		System.out.println("Asignatura: " + lista.get(1).getNombre());
		System.out.println("Nota: " + lista.get(1).getNota());
		System.out.println("Calificacion: " + lista.get(1).calificacion());
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("ALUMNO 3:");
		System.out.println(alu3.getNombre() + ", " + alu3.getEdad() + " años");
		System.out.println();
		
		System.out.println("Asignatura: " + lista.get(2).getNombre());
		System.out.println("Nota: " + lista.get(2).getNota());
		System.out.println("Calificacion: " + lista.get(2).calificacion());
		
		
		leer.close();
	}

}