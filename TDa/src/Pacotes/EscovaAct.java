package Pacotes;

public class EscovaAct {

	public static void main(String[] args) {

		Escova esc = new Escova();
		Escova esc1 = new Escova();
		Escova esc2 = new Escova();
		
		esc.pc = 129.90;
		esc.cor = "Vermelho";
		esc.tm = 60;
		esc.fn = "Rotativa";
		
		esc1.pc = 9.99;
		esc1.cor = "Verde";
		esc1.tm = 10;
		esc1.fn = "Escovar os dentes";
		
		esc2.pc = 32.99;
		esc2.cor = "Preto";
		esc2.tm = 12;
		esc2.fn = "Escovar o cabelo";
		
		
		esc.pre�o();
		esc.cor();
		esc.tamanho();
		esc.fun��o();
		System.out.println();

		esc1.pre�o();
		esc1.cor();
		esc1.tamanho();
		esc1.fun��o();
		System.out.println();

		esc2.pre�o();
		esc2.cor();
		esc2.tamanho();
		esc2.fun��o();
		
	}

}
