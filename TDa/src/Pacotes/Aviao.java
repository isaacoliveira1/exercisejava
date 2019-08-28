package Pacotes;

public class Aviao {
	String tr;
	int c;
	int b;
	String pn;
	
	
	
	public void tremdepouso() {
		System.out.println("Emergencia: " +tr + " o trem de pouso!");
	}

	public void cadeira() {
		System.out.println("Quantidade de Cadeiras: "+c);
	}
	
	public void banheiro() {
		System.out.println("Quantidade de Banheiros: " +b);
		
	}
	
	public void paineldecontrole() {
		System.out.println("Painel: " +pn);
	}
	
}
