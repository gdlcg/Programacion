package UT6_Platadorma_Streaming;

public class Serie implements Reproducible {
	
	public void reproducir() {
		System.out.println("Se esta reproduciendo un episodio de la serie");
	}
	
	public void pausar() {
		System.out.println("La reproduccion se ha pausado");
	}
	
	public TipoContenido obtenerTipoContenido() {
		
		return TipoContenido.Serie;
	}
	
}