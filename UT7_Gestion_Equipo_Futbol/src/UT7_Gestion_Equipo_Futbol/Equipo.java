package UT7_Gestion_Equipo_Futbol;

import java.util.ArrayList;
import java.util.Collections;

public class Equipo {
    private String nombre;
    private ArrayList<Futbolista> futbolistas;
    private final int maxPorteros = 2;
    private final int maxDefensas = 5;
    private final int maxCentrocampistas = 5;
    private final int maxDelanteros = 4;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.futbolistas = new ArrayList<>();
    }

    public void agregarFutbolista(Futbolista futbolista) throws RegistroFutbolistaException {
        int contador = 0;
        
        for (Futbolista f : futbolistas) {
            if (f.getPosicion() == futbolista.getPosicion()) {
                contador++;
            }
        }
        
        if ((futbolista.getPosicion() == Posicion.Portero && contador >= maxPorteros) ||
            (futbolista.getPosicion() == Posicion.Defensa && contador >= maxDefensas) ||
            (futbolista.getPosicion() == Posicion.Centrocampista && contador >= maxCentrocampistas) ||
            (futbolista.getPosicion() == Posicion.Delantero && contador >= maxDelanteros)) {
            throw new RegistroFutbolistaException("No se pueden agregar más " + futbolista.getPosicion().toString().toLowerCase() + "s.");
        }
        
        
        futbolistas.add(futbolista);
    }
    
    public void listarFormacionDelEquipo() {
        Collections.sort(futbolistas);
        for (Futbolista f : futbolistas) {
            System.out.println(f);
        }
    }
}