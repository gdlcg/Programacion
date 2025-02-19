package UT6_Platadorma_Streaming;

public class Podcast implements Reproducible{
	
	public void reproducir() {
		System.out.println("Se esta reproduciendo un episodio del podcast");
	}
	
	public void pausar() {
		System.out.println("La reproduccion se ha pausado");
	}
	
	public TipoContenido obtenerTipoContenido() {
		return TipoContenido.Podcast;
	}
	
}