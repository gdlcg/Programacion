package UT6_Actividad_Herencias_y_Excepciones;

public class ParticipanteNoValidoException extends Exception {

    public ParticipanteNoValidoException(String message) {
        super(message);
    }
}