package ZZPOO_CASA;

public class DVDCine {
    // Atributos
    private String titulo;
    private String tituloOriginal;
    private String director;
    private String[] reparto;
    private String genero;
    private int duracion; // Duración en minutos
    private String resumen;

    // Constructor
    public DVDCine(String titulo, String tituloOriginal, String director, String[] reparto, String genero, int duracion, String resumen) {
        this.titulo = titulo;
        this.tituloOriginal = tituloOriginal;
        this.director = director;
        this.reparto = reparto;
        this.genero = genero;
        this.duracion = duracion;
        this.resumen = resumen;
    }

    // Métodos
    public String muestraDVDCine() {
        StringBuilder ficha = new StringBuilder();
        ficha.append(titulo.toUpperCase());
        if (!tituloOriginal.isEmpty()) {
            ficha.append(" (" + tituloOriginal + ")");
        }
        ficha.append("\nDe: " + director);
        ficha.append("\nCon: " + String.join(", ", reparto));
        ficha.append("\n" + genero + " - " + duracion + " min.");
        if (!resumen.isEmpty()) {
            ficha.append("\nResumen: " + resumen);
        }
        return ficha.toString();
    }

    public boolean esThriller() {
        return genero.equalsIgnoreCase("Thriller");
    }

    public boolean tieneResumen() {
        return resumen != null && !resumen.isEmpty();
    }

    public String muestraDuracion() {
        return duracion + " min.";
    }
}