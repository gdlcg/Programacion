package ZZPOO_CASA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Carroceria {
	
	private String color;
	private String condicion;
	
	public Carroceria(String color, String condicion) {
		this.color = color;
		this.condicion = condicion;
	}
	
	

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getCondicion() {
		return condicion;
	}
	
	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}
	
	public void mostrarColor() {
		System.out.println("Este es color: " + color);
	}
	
}


class Motor {
	
	private String numeroBastidor;

	public Motor(String numeroBastidor) {
		this.numeroBastidor = numeroBastidor;
	}
	
	
	
	public String getNumeroBastidor() {
		return numeroBastidor;
	}
	
	public void setNumeroBastidor(String numeroBastidor) {
		this.numeroBastidor = numeroBastidor;
	}
	
}


class Ruedas {
	
	private float tamaño;
	private String condicionR;
	
	public Ruedas(float tamaño, String condicionR) {
		this.tamaño = tamaño;
		this.condicionR = condicionR;
	}
	
	
	
	public float getTamaño() {
		return tamaño;
	}
	
	public void setTamaño(float tamaño) {
		this.tamaño = tamaño;
	}
	
	public String getCondicionR() {
		return condicionR;
	}
	
	public void setCondicionR(String condicionR) {
		this.condicionR = condicionR;
	}
	
}


abstract class Coche {
	
	protected String marca;
	protected int numero;
	protected float precioCoste;
	protected float precioVenta;
	protected Carroceria carroceria;
	protected Motor motor;
	protected Ruedas ruedas;
	
	
	
	public Coche(String marca, int numero, float precioCoste, float precioVenta, Carroceria carroceria, Motor motor, Ruedas ruedas) {
		this.marca = marca;
		this.numero = numero;
		this.precioCoste = precioCoste;
		this.precioVenta = precioVenta;
		this.carroceria = carroceria;
		this.motor = motor;
		this.ruedas = ruedas;
	}



	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public float getPrecioCoste() {
		return precioCoste;
	}
	
	public void setPrecioCoste(float precioCoste) {
		this.precioCoste = precioCoste;
	}
	
	public float getPrecioVenta() {
		return precioVenta;
	}
	
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	
	abstract float beneficio();
	abstract void mostrar();
	abstract void mostrarTotal();
	
}

class Estandar extends Coche {
	
	//private List <Coche> coche = new ArrayList <>();
	private int puertas;
	

	public Estandar(String marca, int numero, float precioCoste, float precioVenta, int puertas, Carroceria carroceria, Motor motor, Ruedas ruedas) {
		super(marca, numero, precioCoste, precioVenta, carroceria, motor, ruedas);
		this.puertas = puertas;
	}
	
	
	
	public float beneficio() {
		return (precioVenta - precioCoste);
	}
	
	public void mostrar() {
		System.out.println("Se ha añadido coche estandar " + marca + " con numero " + numero);
	}
	
	public void mostrarTotal() {
		System.out.println("Marca: " + marca);
		System.out.println("Numero: " + numero);
		System.out.println("Precio de coste: " + precioCoste);
		System.out.println("Precio de venta: " + precioVenta);
		System.out.println("Puertas: " + puertas);
		System.out.println("Color: " + carroceria.getColor());
		System.out.println("Condicion: " + carroceria.getCondicion());
		System.out.println("Numero de Bastidor: " + motor.getNumeroBastidor());
		System.out.println("Tamaño de la rueda: " + ruedas.getTamaño());
		System.out.println("Condicion de las ruedas: " + ruedas.getCondicionR());
		System.out.println();
		//super.getColor();
		//super.mostrarColor();
	}
	
}

class Deportivo extends Coche {
	
	//private List <Coche> coche = new ArrayList <>();
	
	public Deportivo(String marca, int numero, float precioCoste, float precioVenta, Carroceria carroceria, Motor motor, Ruedas ruedas) {
		super(marca, numero, precioCoste, precioVenta, carroceria, motor, ruedas);
	}
	
	public float beneficio() {
		return (precioVenta - precioCoste);
	}
	
	public void mostrar() {
		System.out.println("Se ha añadido coche estandar " + marca + " con numero " + numero);
	}
	
	public void mostrarTotal() {
		System.out.println("Marca: " + marca);
		System.out.println("Numero: " + numero);
		System.out.println("Precio de coste: " + precioCoste);
		System.out.println("Precio de venta: " + precioVenta);
		System.out.println("Color: " + carroceria.getColor());
		System.out.println("Condicion: " + carroceria.getCondicion());
		System.out.println("Numero de Bastidor: " + motor.getNumeroBastidor());
		System.out.println("Tamaño de la rueda: " + ruedas.getTamaño());
		System.out.println("Condicion de las ruedas: " + ruedas.getCondicionR());
		System.out.println();
	}
	
	
}

class Monovolumen extends Coche {
	
	//private List <Coche> coche = new ArrayList <>();
	private int plazas;

	public Monovolumen(String marca, int numero, float precioCoste, float precioVenta, int plazas, Carroceria carroceria, Motor motor, Ruedas ruedas) {
		super(marca, numero, precioCoste, precioVenta, carroceria, motor, ruedas);
		this.plazas = plazas;
	}
	
	public float beneficio() {
		return (precioVenta - precioCoste);
	}
	
	public void mostrar() {
		System.out.println("Se ha añadido coche estandar " + marca + " con numero " + numero);
	}
	
	public void mostrarTotal() {
		System.out.println("Marca: " + marca);
		System.out.println("Numero: " + numero);
		System.out.println("Precio de coste: " + precioCoste);
		System.out.println("Precio de venta: " + precioVenta);
		System.out.println("Plazas: " + plazas);
		System.out.println("Color: " + carroceria.getColor());
		System.out.println("Condicion: " + carroceria.getCondicion());
		System.out.println("Numero de Bastidor: " + motor.getNumeroBastidor());
		System.out.println("Tamaño de la rueda: " + ruedas.getTamaño());
		System.out.println("Condicion de las ruedas: " + ruedas.getCondicionR());
		System.out.println();
	}
	
}



public class Super_Ejercicio {
	
	private static ArrayList <Coche> cocheE = new ArrayList<>();
	private static ArrayList <Coche> cocheD = new ArrayList<>();
	private static ArrayList <Coche> cocheM = new ArrayList<>();
	private static Scanner leer = new Scanner (System.in);
	
	public static void añadirCocheEstandar() {
		
		System.out.print("Marca: ");
		String marca = leer.next();
		System.out.print("Numero: ");
		int numero = leer.nextInt();
		System.out.print("Precio Coste: ");
		float precioCoste = leer.nextFloat();
		System.out.print("Precio Venta: ");
		float precioVenta = leer.nextFloat();
		System.out.print("Puertas: ");
		int puertas = leer.nextInt();
		
		System.out.println();
		
		System.out.print("Color: ");
		String color = leer.next();
		System.out.print("Condicion: ");
		String condicion = leer.next();
		
		System.out.println();
		
		System.out.print("Numero bastidor: ");
		String numeroBastidor = leer.next();
		
		System.out.println();
		
		System.out.print("Tamaño rueda: ");
		float tamaño = leer.nextFloat();
		System.out.print("Condicion rueda: ");
		String condicionR = leer.next();
		
		System.out.println();
		
		Carroceria c = new Carroceria(color, condicion);
		
		Motor m = new Motor(numeroBastidor);
		
		Ruedas r = new Ruedas(tamaño, condicionR);
		
		Coche cocheEstandar = new Estandar(marca, numero, precioCoste, precioVenta, puertas, c, m, r);
		
		cocheE.add(cocheEstandar);
		
		cocheEstandar.mostrar();
		System.out.println();
	}
	
	public static void añadirCocheDeportivo() {
		
		System.out.print("Marca: ");
		String marca = leer.next();
		System.out.print("Numero: ");
		int numero = leer.nextInt();
		System.out.print("Precio Coste: ");
		float precioCoste = leer.nextFloat();
		System.out.print("Precio Venta: ");
		float precioVenta = leer.nextFloat();
		
		System.out.println();
		
		System.out.print("Color: ");
		String color = leer.next();
		System.out.print("Condicion: ");
		String condicion = leer.next();
		
		System.out.println();
		
		System.out.print("Numero bastidor: ");
		String numeroBastidor = leer.next();
		
		System.out.println();
		
		System.out.print("Tamaño rueda: ");
		float tamaño = leer.nextFloat();
		System.out.print("Condicion rueda: ");
		String condicionR = leer.next();
		
		System.out.println();
		
		Carroceria c = new Carroceria(color, condicion);
		
		Motor m = new Motor(numeroBastidor);
		
		Ruedas r = new Ruedas(tamaño, condicionR);
		
		Coche cocheDeportivo = new Deportivo(marca, numero, precioCoste, precioVenta, c, m, r);
		
		cocheD.add(cocheDeportivo);
		
		cocheDeportivo.mostrar();
		System.out.println();
	}
	
	public static void añadirCocheMonovolumen() {
		
		System.out.print("Marca: ");
		String marca = leer.next();
		System.out.print("Numero: ");
		int numero = leer.nextInt();
		System.out.print("Precio Coste: ");
		float precioCoste = leer.nextFloat();
		System.out.print("Precio Venta: ");
		float precioVenta = leer.nextFloat();
		System.out.print("Plazas: ");
		int plazas = leer.nextInt();
		
		System.out.println();
		
		System.out.print("Color: ");
		String color = leer.next();
		System.out.print("Condicion: ");
		String condicion = leer.next();
		
		System.out.println();
		
		System.out.print("Numero bastidor: ");
		String numeroBastidor = leer.next();
		
		System.out.println();
		
		System.out.print("Tamaño rueda: ");
		float tamaño = leer.nextFloat();
		System.out.print("Condicion rueda: ");
		String condicionR = leer.next();
		
		System.out.println();
		
		Carroceria c = new Carroceria(color, condicion);
		
		Motor m = new Motor(numeroBastidor);
		
		Ruedas r = new Ruedas(tamaño, condicionR);
		
		Coche cocheMonovolumen = new Monovolumen(marca, numero, precioCoste, precioVenta, plazas, c, m, r);
		
		cocheM.add(cocheMonovolumen);
		
		cocheMonovolumen.mostrar();
		System.out.println();
	}
	
	public static void mostrarCocheEstandar() {
		
		System.out.println("Lista de coche estandar: ");
		
		for (Coche a : cocheE) {
			if (a instanceof Estandar) {
	            a.mostrarTotal();
	        }
		}
		System.out.println();
	}
	
	public static void mostrarCocheDeportivo() {
		
		System.out.println("Lita de coche deportivo: ");
		
		for (Coche b : cocheD) {
			if (b instanceof Deportivo) {
	            b.mostrarTotal();
	        }
		}
		System.out.println();
	}
	
	public static void mostrarCocheMonovolumen() {
		
		System.out.println("Lita de coche Monovolumen: ");
		
		for (Coche c : cocheM) {
			if (c instanceof Monovolumen) {
	            c.mostrarTotal();
	        }
		}
	}
	

	public static void main(String[] args) {
		
		int opcion;
		
		do {
			System.out.println("MENU");
			System.out.println("1. Añadir coche");
			System.out.println("2. Mostrar coche");
			System.out.println("3. Mostrar beneficio");
			System.out.println("4. Salir del programa");
			System.out.println();
			System.out.print("Indique la opcion: ");
			opcion = leer.nextInt();
			
			switch (opcion) {
			case 1:
				String tipo1;
				
				do {
					System.out.print("Que tipo de coche quieres añadir: Estandar, Deportivo o Monovolumen: ");
					tipo1 = leer.next();
					System.out.println();
					if(tipo1.equalsIgnoreCase("Estandar")) {
						añadirCocheEstandar();
					}else if (tipo1.equalsIgnoreCase("Deportivo")) {
						añadirCocheDeportivo();
					}else if (tipo1.equalsIgnoreCase("Monovolumen")) {
						añadirCocheMonovolumen();
					}else {
						System.out.println("Esta opcion no es valida, vuelva a indicar un tipo de coche");
						System.out.println();
					}break;
				}while (tipo1 != "Estandar" || tipo1 != "Deportivo" || tipo1 != "Monovolumen");
				break;
				
			case 2:
				String tipo2;
				
				do {
					System.out.print("Que tipo de coche quieres mostrar: Estandar, Deportivo o Monovolumen: ");
					tipo2 = leer.next();
					System.out.println();
					if(tipo2.equalsIgnoreCase("Estandar")) {
						mostrarCocheEstandar();
					}else if (tipo2.equalsIgnoreCase("Deportivo")) {
						mostrarCocheDeportivo();
					}else if (tipo2.equalsIgnoreCase("Monovolumen")) {
						mostrarCocheMonovolumen();
					}else {
						System.out.println("Esta opcion no es valida, vuelva a indicar un tipo de coche");
						System.out.println();
					}break;
				}while (tipo2 != "Estandar" || tipo2 != "Deportivo" || tipo2 != "Monovolumen");
				break;
				
			case 3:
				
				break;
				
			case 4:
				System.out.println("Saliendo del programa...");
				break;
				default:
					System.out.println("Opcion no valida, vuelva a ingresar una opcion del menu");
					System.out.println();
					break;
			}
			
		}while (opcion != 4);
		
	}

}