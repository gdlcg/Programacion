package UT6_Actividad_Herencias_y_Excepciones;

public class Participante {
    
    private String nombre;
    private String apellido;
    private int edad;
    private double tiempo;

    public Participante(String nombre, String apellido, int edad, double tiempo) throws ParticipanteNoValidoException {
    	
        if (nombre == null || apellido == null) {
            throw new ParticipanteNoValidoException("El nombre o apellido no puede ser nulo.");
        }
        
        if (edad < 14) {
            throw new ParticipanteNoValidoException("La edad del participante no puede ser menor a 14.");
        }
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public String toString() {
        return "Nombre: " + nombre + " " + apellido + "\nEdad: " + edad;
    }
}