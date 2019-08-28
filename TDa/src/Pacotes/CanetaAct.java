package Pacotes;

public class CanetaAct {

	public static void main(String[] args) {
		
		Caneta ct = new Caneta();
		Caneta ct1 = new Caneta();
		Caneta ct2 = new Caneta();
		
		ct.t = 30;
		ct.c = "Azul";
		ct.p = 1.99;
		ct.f = "Escrever";
		
		ct1.t = 25;
		ct1.c = "Vermelha";
		ct1.p = 5.99;
		ct1.f = "Pintar";
		
		ct2.t = 45;
		ct2.c ="Preto";
		ct2.p = 2.99;
		ct2.f = "Rabiscar";
		
		ct.tinta();
		ct.cor();
		ct.preço();
		ct.funçao();
		System.out.println();

		ct1.tinta();
		ct1.cor();
		ct1.preço();
		ct1.funçao();
		
		System.out.println();

		ct2.tinta();
		ct2.cor();
		ct2.preço();
		ct2.funçao();
	}

}
