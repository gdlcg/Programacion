package ZZZEJEMPLO;

public class main {

	public static void main(String[] args) {
		
		Operar suma = new Suma(10, 5);
		
		System.out.println("El resultado de la suma es: " + suma.operacion());
		
		Operar resta = new Resta(9, 6);
		
		System.out.println("El resultado de la resta es: " + resta.operacion());
		
	}

}




/*Hijo h = new Hijo();

h.mostrar();

Pitbull p = new Pitbull();

p.hacerRuido();*/


/*Padre p = new Padre("Manolo", 56);

System.out.println(p);*/