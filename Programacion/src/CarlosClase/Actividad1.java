package CarlosClase;

public class Actividad1 {

	public static void main(String[] args) {
		
		int num;
		
		System.out.println("En este programa generaremos un numero aleatroio desde 1 hasta 100 [1, 100]");
		System.out.println("");
		
		num = (int) (Math.random()*100+1);  //math.random()*100 genera numeros [0, 100)   le sumamos +1 pa que genere desde [1, 100]
		
		System.out.println("Un numero aleatorio es " + num);
		
	}

}