package UT5P_OO_1;

public class DVDCine {
    
    // atributos    
    private String titulo;
    private String director;
    private String[] reparto;
    private String genero;
    private int duracion;
    private String resumen;
    
    
	// constructor
    public DVDCine(String titulo, String director, String[] reparto, String genero, int duracion, String resumen) {
        this.titulo = titulo;
        this.director = director;
        this.reparto = reparto;
        this.genero = genero;
        this.duracion = duracion;
        this.resumen = resumen;
    }
    
    

	// método    
    public String muestraDVDCine() {
        return titulo + "\n" + director + "\n" + String.join(", ", reparto) + "\n" + genero + "\n" + duracion;
    }
    
    public boolean esThriller() {
        return genero.equalsIgnoreCase("Thriller");
    }
    
    public boolean tieneResumen() {
        return resumen != null;
    }
    
    public String muestraDuracion() {
        return duracion + " min.";
    }
}
