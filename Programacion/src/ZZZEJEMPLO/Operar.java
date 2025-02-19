package ZZZEJEMPLO;

abstract class Operar {
	
	protected int a;
	protected int b;
	
	public Operar(int a, int b) {  //CONSTRUCTOR CLASE ABSTRACTA
		this.a = a;
		this.b = b;
	}
	
	abstract int operacion();
	
}

class Suma extends Operar {
	
	public Suma(int a, int b) {  //CONSTRUCTOR CLASE SUMA, (añadimos con el super las variables de la clase "padre" OPERAR)
		super(a, b);
	}

	int operacion() {
		return (a+b);
	}
}


class Resta extends Operar {
	
	public Resta(int a, int b) {  //CONSTRUCTOR CLASE RESTA, (añadimos con el super las variables de la clase "padre" OPERAR)
		super(a, b);
	}
	
	int operacion() {
		return (a-b);
	}
}
