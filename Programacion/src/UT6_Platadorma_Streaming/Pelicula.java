package UT6_Platadorma_Streaming;

public class Pelicula implements Reproducible {
	
	public void reproducir() {
		System.out.println("Se esta reproduciendo");
	}
	
	public void pausar() {
		System.out.println("La reproduccion se ha pausado");
	}
	
	public TipoContenido obtenerTipoContenido() {
		return TipoContenido.Pelicula;
	}
	
	
	
}