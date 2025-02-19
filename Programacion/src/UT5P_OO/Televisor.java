package UT5P_OO;

public class Televisor {
	private int canal;
	private int volumen;
	private int color;
	public Televisor() {canal=1; volumen=5; color=7;}
	public Televisor (int valorCanal) {
		setCanal(valorCanal);
		volumen = 5;
		color=7;
	}
	
	
// - - - - - - - - C A N A L - - - - - - - -	
	
	
	public void subirCanal() {                                   //Subir Canal
		if (canal==10) {
			canal=0;
		} else {
			canal++;
		}
		System.out.println("Canal: " + canal);
	}
	public void bajarCanal() {                                  //Bajar Canal
		if (canal == 0) {
			canal = 10;
		}else {
			canal--;
		}
		System.out.println("Canal: " + canal);
	}
	public int getCanal() {return canal;}                      // Con el get, accdenemos directamente a un atributo privado,
                                                               //devuelve el valor actual del atributo, en este caso, canal
	public void setCanal (int valorCanal) {
		if (valorCanal >= 0 && valorCanal <= 10) {
			canal = valorCanal;
		}else {
			canal = 0;
		}
	}
	
	
// - - - - - - - - V O L U M E N - - - - - - - -
	
	
	public void subirVolumen() {                               //Subir Volumen 
		if (volumen < 15) {
			volumen++;
			System.out.println("Volumen: " + volumen);
		}
	}
	
	public void bajarVolumen() {                              //Bajar Volumen
		if (volumen > 0) {
			volumen--;
			System.out.println("Volumen: " + volumen);
		}
	}
	
	public int getVolumen() {return volumen;}                // Con el get, accdenemos directamente a un atributo privado,
                                                             //devuelve el valor actual del atributo, en este caso, volumen
	public void setVolumen(int valorVolumen) {
		if (valorVolumen >= 0 && valorVolumen <= 15) {
			volumen = valorVolumen;
			System.out.println("Volumen: " + volumen);
		}
	}
	
	
// - - - - - - - - C O L O R - - - - - - - -	
	
	
	public void subirColor() {                               //Subir Color
		if (color < 7) {
			color++;
			System.out.println("Color: " + color);
		}
	}
	public void bajarColor(){                               //Bajar Color
		if (color > 1) {
			color--;
			System.out.println("Color: " + color);
		}
	}
	public int getColor( ) {return color;}                 // Con el get, accdenemos directamente a un atributo privado,
	                                                       //devuelve el valor actual del atributo, en este caso, color
	public void setColor(int valorColor) {
		if (valorColor >= 1 && valorColor <= 7) {
			color = valorColor;
			System.out.println("Color intensidad: " + color);
		}
	}
}