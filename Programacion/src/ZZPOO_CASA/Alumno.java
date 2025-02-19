package ZZPOO_CASA;

public class Alumno {
	
	private int  id;             //atributo
	private String nombre;       //atributo
	private String apellido;     //atributo
	
	
	//metodos
	
	public void mostrarNombre() {
		
		System.out.println("Hola, soy un alumno y se decir mi nombre");
		
	}
	
	public void saberAprobado(double calificacion) {
		
		if (calificacion>=6) {
			System.out.println("Aprobe la materia");
		}else {
			System.out.println("Uyy no aprobé");
		}
	}

	
	//constructores permiten la creacion de objetos
	

	public Alumno() {           //constructor vacio
		super();
	}
	
	
	public Alumno(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	
	//get and set
	
		public int getId() {    //get: obtener los datos, mostrarlos por pantalla, hacer operaciones    ||   ver
			return id;
		}

		public void setId(int id) {   //set: establecer valores a cada uno de estos atributos           ||  modificar
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
	
	
}