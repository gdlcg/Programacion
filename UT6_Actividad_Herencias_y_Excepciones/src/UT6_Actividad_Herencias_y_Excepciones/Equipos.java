package UT6_Actividad_Herencias_y_Excepciones;

import java.util.ArrayList;

public class Equipos {
    
    private String nombre;
    private ArrayList<Participante> jugadores;
    private int puntos;

    public Equipos(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Participante> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Participante> jugadores) {
        this.jugadores = jugadores;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void añadirJugador(Participante jugador) {
        jugadores.add(jugador);
    }

    public void eliminarJugador(Participante jugador) throws JugadorNoEncontradoException {
        boolean encontrado = false;
        for (Participante p : jugadores) {
            if (p.getNombre().equals(jugador.getNombre()) && p.getApellido().equals(jugador.getApellido())) {
                jugadores.remove(p);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            throw new JugadorNoEncontradoException("Jugador no encontrado: " + jugador.getNombre() + " " + jugador.getApellido());
        }
    }

    public String toString() {
        StringBuilder infoEquipo = new StringBuilder();
        infoEquipo.append("Equipo: ").append(nombre).append("\nPuntos: ").append(puntos).append("\nJugadores:\n");

        for (Participante jugador : jugadores) {
            infoEquipo.append(jugador.toString()).append("\n");
        }

        return infoEquipo.toString();
    }
}