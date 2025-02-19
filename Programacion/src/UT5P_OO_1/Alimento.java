package UT5P_OO_1;

public class Alimento {
	
	private String nombre;
	private double contenido_lipido;
	private double contenido_HC;
	private double contenido_proteinas;
	private boolean origen_animal;
	private String contenido_vitaminas;
	private String contenido_minerales;
	
	
	public Alimento(String nombre) {
		this.nombre = nombre;
	}
	
	
	public Alimento(String nombre, double contenido_lipido, double contenido_HC, double contenido_proteinas, boolean origen_animal,
			String contenido_vitaminas, String contenido_minerales) {
		this.nombre = nombre;
		this.contenido_lipido = contenido_lipido;
		this.contenido_HC = contenido_HC;
		this.contenido_proteinas = contenido_proteinas;
		this.origen_animal = origen_animal;
		this.contenido_vitaminas = contenido_vitaminas;
		this.contenido_minerales = contenido_minerales;
	}
	
	
	
	public boolean esDietetico() {
		
		return contenido_lipido < 20 && (contenido_vitaminas == null || !contenido_vitaminas.equalsIgnoreCase("B"));  //si ambas condiciones se cumplen es true y si una de las dos no se cumple, es false
	}
	
	public void muestraAlimento() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Porcentaje de lipidos: " + contenido_lipido + "%");
		System.out.println("Porcentaje de hidratos de carbono: " + contenido_HC + "%");
		System.out.println("Porcentaje de proteinas: " + contenido_proteinas + "%");
		System.out.println(origen_animal ? "Es de origen animal" : "No es de origen animal");
		
		
		
		/*switch (contenido_vitaminas) {
		case "A":
			System.out.println("El contenido de vitaminas es " + contenido_vitaminas + " A");
			break;
		case "B":
			System.out.println("El contenido de vitaminas es " + contenido_vitaminas + " B");
			break;
		case "C":
			System.out.println("El contenido de vitaminas es " + contenido_vitaminas + " C");
			break;
			default:
				System.out.println("No existe ese codigo");
				break;
		}
		
		
		
		switch (contenido_minerales) {
		case "A":
			System.out.println("El contenido de minerales es " + contenido_minerales + " A");
			break;
		case "B":
			System.out.println("El contenido de minerales es " + contenido_minerales + " B");
			break;
		case "C":
			System.out.println("El contenido de minerales es " + contenido_minerales + " C");
			break;
			default:
				System.out.println("No existe ese codigo");
				break;
		}*/
		
	}
	
}