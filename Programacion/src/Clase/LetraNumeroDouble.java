package Clase;

public class LetraNumeroDouble {

	public static void main(String[] args) {
		
		double num;
		String numeroString = "3.14";
		double numeroDouble = Double.parseDouble(numeroString); //para pasar de letra (que es String) a una variable double (que es de numero)
		System.out.println(numeroDouble);
		
		num = numeroDouble+9;
		
		System.out.println("El numero " + num);
		
	}

}