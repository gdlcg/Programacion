package Repaso;

public class Repaso007 {

	public static void main(String[] args) {
		
		
		
		int contador = 0;
		
		while (contador<10) {
			int aleatorio = (int)(Math.random()*4)+1;
			System.out.println(aleatorio);
			
			contador++;
		}
		
		
	}

}
// si se pone *4 saca aleatorioamente numeros entre [0, 4)   o  lo que es lo mismo [0, 3]
// si pnermos (*4)+1 saca aleatoriamente numero entre (0, 4] o lo que es lo mismo [1, 4]