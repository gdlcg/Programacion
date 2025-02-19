package ZZPOO_CASA;

public class POO {

	public static void main(String[] args) {
		
		//vamos a crear un alumno       //el primer nombre Alumno es de como se llama la clase, y el segundo nombre Alumno, es del constructor
		
		Alumno alu1 = new Alumno();        // alu1 y alu2 son objetos
		
		Alumno alu2 = new Alumno(5, "Gonzalo", "De La Carrera");
		
		
		System.out.println("La id del alumno 2 es: " + alu2.getId());      //para mostrar siempre  .get
		
		
	// o por ejemplo int 
		//id = alu2.getId();
		//System.out.println("La id del alumno 2 es: " + id);
		
		
		System.out.println("El nombre es: " + alu2.getNombre());
		System.out.println("El apellido es: " + alu2.getApellido());
		
		
 //como alu1 tiene un constructor vacio, meto manualmente los valores de los atributos con el .set	
		alu1.setId(8);
		alu1.setNombre("Elena");
		alu1.setApellido("Garcia");
		
		System.out.println("- - - - - -");
		
		System.out.println("La id del alumno 1 es: " + alu1.getId());
		System.out.println("El nombre es: " + alu1.getNombre());
		System.out.println("El apellido es: " + alu1.getApellido());
		
		
		System.out.println("- - - - - -");
		
		alu2.setId(35);    // para modificar el id del alumno 2, antes era 5 y ahora es 35
		
		System.out.println("La id del alumno 2 es: " + alu2.getId());
		System.out.println("El nombre es: " + alu2.getNombre());
		System.out.println("El apellido es: " + alu2.getApellido());
		
	}

}
