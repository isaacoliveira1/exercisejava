package Pacotes;

public class AviaoAct {

	public static void main(String[] args) {
		
		Aviao a = new Aviao();
		Aviao a1 = new Aviao();
		Aviao a2 = new Aviao();
		
		a.tr = "Interrompendo";
		a.c = 49;
		a.b = 1;
		a.pn = "Queimou";
		
		a1.tr = "Abrindo";
		a1.c = 32;
		a1.b = 3;
		a1.pn = "Em execução!";
		
		a2.tr = "Com falha";
		a2.c = 12;
		a2.b = 4;
		a2.pn = "Com falha";
		
		a.tremdepouso();
		a.cadeira();
		a.banheiro();
		a.paineldecontrole();
		System.out.println();

		a1.tremdepouso();
		a1.cadeira();
		a1.banheiro();
		a1.paineldecontrole();
		System.out.println();

		a2.tremdepouso();
		a2.cadeira();
		a2.banheiro();
		a2.paineldecontrole();
		
	}

}
