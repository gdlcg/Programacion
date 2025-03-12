package UT6_Actividad_Herencias_y_Excepciones;

import java.time.LocalDate;

public class Carrera extends EventoDeportivo{
	
	private double distancia;

	public Carrera(String nombre, LocalDate fecha, String lugar, double distancia) {
		super(nombre, fecha, lugar);
		this.distancia = distancia;
	}
	
	public Participante obtenerGanador() {
		
		Participante ganador = participantes.get(0);
		
		for (Participante p : participantes) {
			if(p.getTiempo() < ganador.getTiempo()) {
				ganador = p;
			}
		}
		
		return ganador;
	}
	
}