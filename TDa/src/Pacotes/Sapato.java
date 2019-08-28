package Pacotes;

public class Sapato {
	String modelo;
	double pc;
	int tm;
	String cor;
	String cda;
	
	
	public void modelo(){
		System.out.println("Modelo: " +modelo);
	}
	
	public void preço() {
		System.out.println("Preço: " +pc);
	}
	
	public void tamanho() {
		System.out.println("Tamanho: " +tm);
	}
	
	public void cor() {
		System.out.println("Cor: " +cor);
	}
	
	public void cadarço() {
		System.out.println("Cor do cadarço: " +cda);
	}
	
}
