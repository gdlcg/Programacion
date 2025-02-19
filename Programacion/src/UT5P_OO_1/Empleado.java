package UT5P_OO_1;

public class Empleado {
	
	private String nif;
	private float sueldoBase;
	private float pagoHoraExtra;
	private int horasExtras;
	private int irpf;
	private boolean casado;
	private int hijos;
	private int dni;
	
	
	public Empleado(String nif, float sueldoBase, float pagoHoraExtra, int horasExtras, int irpf, boolean casado, int hijos) {
		this.nif = nif;
		this.sueldoBase = sueldoBase;
		this.pagoHoraExtra = pagoHoraExtra;
		this.horasExtras = horasExtras;
		this.irpf = irpf;
		this.casado = casado;
		this.hijos = hijos;
	}


	public Empleado(String nif, float sueldoBase, float pagoHoraExtra, int horasExtras, int irpf, boolean casado, int hijos, int dni) {
		this.nif = nif;
		this.sueldoBase = sueldoBase;
		this.pagoHoraExtra = pagoHoraExtra;
		this.horasExtras = horasExtras;
		this.irpf = irpf;
		this.casado = casado;
		this.hijos = hijos;
		this.dni = dni;
	}


	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public float getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(float sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public float getPagoHoraExtra() {
		return pagoHoraExtra;
	}

	public void setPagoHoraExtra(float pagoHoraExtra) {
		this.pagoHoraExtra = pagoHoraExtra;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public float getIrpf() {
		return irpf;
	}

	public void setIrpf(int irpf) {
		this.irpf = irpf;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getHijos() {
		return hijos;
	}

	public void setHijos(int hijos) {
		this.hijos = hijos;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
	
	
	public float complemento() {
		
		float complemento;
		
		complemento = horasExtras * pagoHoraExtra;
		
		return complemento;
		
	}
	
	
	public float sueldoBruto() {
		
		return sueldoBase + complemento();
	}
	
	
	public float retenciones() {
		
		casado = true;
		
		int ajustado;
		float retencion;
		
		if(casado) {
			
			ajustado = irpf - 2 - (1 * hijos);
			
		}else {
			
			ajustado = irpf - (1*hijos);
			
		}
		
		retencion = sueldoBruto() * (ajustado/100);
		
		return retencion;
	}
	
	
	public void println() {
		
		System.out.println("NIF: " + nif);
		System.out.println("Pago por hora extra: " + pagoHoraExtra);
		System.out.println("Horas extras: " + horasExtras);
		System.out.println("IRPF: " + irpf);
		System.out.println("Estado civil: " + (casado ? "Casado" : "Soltero"));
		System.out.println("Numero de hijos: " + hijos);
	}
	
	
	public void printAll() {
		System.out.println("NIF: " + nif);
		System.out.println("Pago por hora extra: " + pagoHoraExtra);
		System.out.println("Horas extras: " + horasExtras);
		System.out.println("IRPF: " + irpf);
		System.out.println("Estado civil: " + (casado ? "Casado" : "Soltero"));
		System.out.println("Numero de hijos: " + hijos);
		System.out.println("Sueldo Base: " + sueldoBase);
		System.out.println("Complemento por horas extras: " + complemento());
		System.out.println("Sueldo bruto: " + sueldoBruto());
		System.out.println("Retencion de IRPF: " + retenciones());
	}
	
	
	
}