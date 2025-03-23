package UT7_Gestion_Equipo_Futbol;

import java.util.ArrayList;

public class Futbolista implements Deportista, Comparable<Futbolista> {
    private String nombre;
    private int edad;
    private Posicion posicion;
    private int anyosProfesional;
    private ArrayList<String> equipos;
    private int totalTrofeos;

    public Futbolista(String nombre, int edad, Posicion posicion, int anyosProfesional, int totalTrofeos) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.anyosProfesional = anyosProfesional;
        this.totalTrofeos = totalTrofeos;
        this.equipos = new ArrayList<>();
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

    public Posicion getPosicion() {
    	return posicion;
    }
    public void setPosicion(Posicion posicion) {
    	this.posicion = posicion;
    }

    public void addEquipo(String equipo) {
    	equipos.add(equipo);
    }
    
    
    @Override
    public int getAñosProfesional() {
    	return anyosProfesional;
    }
    
    @Override
    public ArrayList<String> getListadoEquipos() {
    	return equipos;
    }
    
    @Override
    public int getTotalTrofeos() {
    	return totalTrofeos;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nPosición: " + posicion;
    }
    
    @Override
    public int compareTo(Futbolista otro) {
        return this.posicion.ordinal() - otro.posicion.ordinal();
    }
}