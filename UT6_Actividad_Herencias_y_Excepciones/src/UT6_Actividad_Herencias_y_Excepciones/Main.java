package UT6_Actividad_Herencias_y_Excepciones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Participante> participantes = new ArrayList<>();
        
        ArrayList<Equipos> equipos = new ArrayList<>();

        System.out.println("Crear participantes:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese los datos del Participante " + i + ":");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            System.out.print("Tiempo (para la carrera, en segundos): ");
            double tiempo = Double.parseDouble(scanner.nextLine());

            try {
                Participante participante = new Participante(nombre, apellido, edad, tiempo);
                participantes.add(participante);
                System.out.println("Participante creado con éxito!");
            } catch (ParticipanteNoValidoException e) {
                System.out.println("Error al crear el participante: " + e.getMessage());
            }
        }

        System.out.println("\nCrear evento de la carrera:");
        System.out.print("Nombre del evento: ");
        String nombreCarrera = scanner.nextLine();

        System.out.print("Fecha (año-mes-día): ");
        String fechaCarrera = scanner.nextLine();
        LocalDate fechaEventoCarrera = LocalDate.parse(fechaCarrera);

        System.out.print("Lugar de la carrera: ");
        String lugarCarrera = scanner.nextLine();

        Carrera carrera = new Carrera(nombreCarrera, fechaEventoCarrera, lugarCarrera, 42.195);
        
        for (Participante participante : participantes) {
            carrera.inscribirParticipante(participante);
        }

        System.out.println("\nEvento de la Carrera:");
        System.out.println("Nombre: " + carrera.getNombre());
        System.out.println("Fecha: " + carrera.getFecha());
        System.out.println("Lugar: " + carrera.getLugar());
        System.out.println("Participantes:");
        for (Participante participante : carrera.getParticipante()) {
            System.out.println(participante.toString());
        }

        Participante ganadorCarrera = carrera.obtenerGanador();
        System.out.println("\nGanador de la carrera: " + ganadorCarrera.toString());

        System.out.println("\nCrear evento de Torneo de Fútbol:");
        System.out.print("Nombre del torneo: ");
        String nombreTorneo = scanner.nextLine();

        System.out.print("Fecha (año-mes-día): ");
        String fechaTorneo = scanner.nextLine();
        LocalDate fechaEventoTorneo = LocalDate.parse(fechaTorneo);

        System.out.print("Lugar del torneo: ");
        String lugarTorneo = scanner.nextLine();

        Equipos equipo1 = new Equipos("Equipo A");
        Equipos equipo2 = new Equipos("Equipo B");
        
        equipo1.añadirJugador(participantes.get(0));
        equipo2.añadirJugador(participantes.get(1));

        ArrayList<Equipos> equiposTorneo = new ArrayList<>();
        equiposTorneo.add(equipo1);
        equiposTorneo.add(equipo2);

        TorneoFutbol torneoFutbol = new TorneoFutbol(nombreTorneo, fechaEventoTorneo, lugarTorneo, equiposTorneo);
        
        System.out.println("\nEvento del Torneo de Fútbol:");
        System.out.println("Nombre: " + torneoFutbol.getNombre());
        System.out.println("Fecha: " + torneoFutbol.getFecha());
        System.out.println("Lugar: " + torneoFutbol.getLugar());
        System.out.println("Equipos inscritos:");
        
        /*for (Equipos equipo : torneoFutbol.getEquipos()) {
            System.out.println(equipo.toString());
        }*/

        Participante ganadorFutbol = torneoFutbol.obtenerGanador();
        System.out.println("\nGanador del torneo de fútbol: " + ganadorFutbol.toString());

        try {
            equipo1.eliminarJugador(participantes.get(2));
        } catch (JugadorNoEncontradoException e) {
            System.out.println("\nError al eliminar jugador: " + e.getMessage());
        }

        scanner.close();
    }
}