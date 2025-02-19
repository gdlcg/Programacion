package UT5P_OO_1;

public class Cuenta {
    
    // Atributos
    private long numeroCuenta=100001;
    private long dniCliente;
    private double saldoActual;
    private double interesAnual;
    
    // Constructor por defecto
    public Cuenta() {
    }
    
    // Constructor
    public Cuenta(long dniCliente, double saldoActual, double interesAnual) {
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interesAnual = interesAnual;
    }
    
    // Getters y Setters
    public long getDniCliente() {
        return dniCliente;
    }
    
    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }
    
    public double getSaldoActual() {
        return saldoActual;
    }
    
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public double getInteresAnual() {
        return interesAnual;
    }
    
    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }
    
    // Metodo
    
    public void actualizarSaldo() {
        double interesDiario = interesAnual / 365 / 100; // Convertir porcentaje a decimal
        saldoActual += saldoActual * interesDiario;
    }
    
    
    public void ingresar(double cantidad) {
    	if (cantidad > 0) {
    		saldoActual += cantidad;
    	}else {
    		System.out.println("La cantidad a ingresar debe ser positiva");
    	}
    }
    
    
    public void retirar (double sacar) {
    	if(sacar > 0) {
    		if (saldoActual >= sacar) {
    			saldoActual-= sacar;
    			System.out.println("Se ha retidado " + sacar + " €");
    		}else {
    			System.out.println("No se puede retirar " + sacar + " €");
    		}
    	}else {
    		System.out.println("La cantidad a retirar debe ser positiva");
    	}
    }
    
    
    public void mostrarCuenta() {
    	
    	numeroCuenta++;
    	
    	System.out.println("Numero de Cuenta: " + numeroCuenta);
    	System.out.println("DNI cliente: " + dniCliente);
    	System.out.println("Saldo Actual " + saldoActual + " €");
    	System.out.println("Interes anual: " + interesAnual + " %");
    }
    
}