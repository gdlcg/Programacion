package UT5P_OO_1;

public class Casa_Conde {
	
	private int kg_patatas;
	private int kg_chocos;
	
	
	public Casa_Conde(int kg_patatas, int kg_chocos) {
		this.kg_patatas = kg_patatas;
		this.kg_chocos = kg_chocos;
	}
	
	
	public int getKg_patatas() {
		return kg_patatas;
	}
	
	public void setKg_patatas(int kg_patatas) {
		this.kg_patatas = kg_patatas;
	}
	
	public int getKg_chocos() {
		return kg_chocos;
	}
	
	public void setKg_chocos(int kg_chocos) {
		this.kg_chocos = kg_chocos;
	}
	
	
	
	public void addChocos(int x) {
		kg_chocos += x;
	}
	
	
	public void addPatatas(int x) {
		kg_patatas += x;
	}
	
	
	public int getComensales() {
		
		int clientesPorPapas = (kg_patatas * 3) / 1;   //1kg de patatas es aproximado para 3 personas
		int clientesPorChocos = (int) ((kg_chocos * 3) / 0.5);  //0.5kg de chocos es aproximado para 3 personas
		
		return Math.min(clientesPorPapas, clientesPorChocos);  //compara entre los dos, y devuelve el valor mas pequeño
		
	}
	
	
	public void showChocos() {
		System.out.println(kg_chocos + "kg de chocos en el almacen");
	}
	
	public void showPatatas() {
		System.out.println(kg_patatas + "kg de patatas en el almacen");
	}
	
	
}