package Pacotes;

public class OnibusAct {

	public static void main(String[] args) {
		Onibus o = new Onibus();
		Onibus o1 = new Onibus();
		Onibus o2 = new Onibus();
		o.n = "Air Lines";
		o.p = 4.25;
		o.pe = 16;
		o.t = 13;
		
		o1.n = "Bus Time";
		o1.p = 5.75;
		o1.pe = 18;
		o1.t = 15;
		
		o2.n = "Bus Line";
		o2.p = 16.90;
		o2.pe = 14;
		o2.t = 11;
		
		o.nome();
		o.preço();
		o.peso();
		o.tamanho();
		System.out.println();
		o1.nome();
		o1.preço();
		o1.peso();
		o1.tamanho();
		System.out.println();
		o2.nome();
		o2.preço();
		o2.peso();
		o2.tamanho();
		
	}
}
