package UT6_Actividad_Herencias_y_Excepciones;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class EventoDeportivo {
	
	protected String nombre;
	protected LocalDate fecha;
	protected String lugar;
	protected ArrayList<Participante> participantes;
	
	
	public EventoDeportivo(String nombre, LocalDate fecha, String lugar) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.lugar = lugar;
		this.participantes = new ArrayList<>();
	}


	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public String getLugar() {
		return lugar;
	}
	
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	public ArrayList<Participante> getParticipante() {
		return participantes;
	}
	
	public void setParticipante(ArrayList<Participante> participantes) {
		this.participantes = participantes;
	}
	
	
	public void inscribirParticipante(Participante participante) {
		this.participantes.add(participante);
	}
	
	
	abstract Participante obtenerGanador();
	
}