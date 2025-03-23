package UT7_Gestion_Equipo_Futbol;

public class Main {
	
    public static void main(String[] args) {
    	
        try {
            Equipo equipo = new Equipo("FC Futboleros");

            Futbolista f1 = new Futbolista("Juan", 25, Posicion.Portero, 5, 2);
            Futbolista f2 = new Futbolista("Carlos", 28, Posicion.Defensa, 7, 3);
            Futbolista f3 = new Futbolista("Luis", 22, Posicion.Centrocampista, 3, 1);
            Futbolista f4 = new Futbolista("Pedro", 30, Posicion.Delantero, 10, 5);
            Futbolista f5 = new Futbolista("Roberto", 26, Posicion.Defensa, 6, 2);

            equipo.agregarFutbolista(f1);
            equipo.agregarFutbolista(f2);
            equipo.agregarFutbolista(f3);
            equipo.agregarFutbolista(f4);
            equipo.agregarFutbolista(f5);

            System.out.println("\nFormación del equipo:");
            equipo.listarFormacionDelEquipo();
            
            
            
            Futbolista f6 = new Futbolista("Mario", 27, Posicion.Portero, 4, 1);
            equipo.agregarFutbolista(f6);

            Futbolista f7 = new Futbolista("Antonio", 29, Posicion.Portero, 8, 4);
            equipo.agregarFutbolista(f7);

        } catch (RegistroFutbolistaException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}