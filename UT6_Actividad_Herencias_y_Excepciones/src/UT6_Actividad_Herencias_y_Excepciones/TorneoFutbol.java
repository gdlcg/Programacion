package UT6_Actividad_Herencias_y_Excepciones;

import java.time.LocalDate;
import java.util.ArrayList;

public class TorneoFutbol extends EventoDeportivo {
    
    private ArrayList<Equipos> equipos;

    public TorneoFutbol(String nombre, LocalDate fecha, String lugar, ArrayList<Equipos> equipos) {
        super(nombre, fecha, lugar);
        this.equipos = equipos;
    }

    public Participante obtenerGanador() {
        Equipos ganador = equipos.get(0);
        int mayorPuntos = ganador.getPuntos();
        
        for (Equipos equipo : equipos) {
            if (equipo.getPuntos() > mayorPuntos) {
                mayorPuntos = equipo.getPuntos();
                ganador = equipo;
            }
        }
        

        Participante ganadorJugador = ganador.getJugadores().get(0);
        
        return ganadorJugador;
    }
}