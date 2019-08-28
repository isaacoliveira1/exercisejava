package Pacotes;

public class CaixaAct {

	public static void main(String[] args) {

		Caixa q = new Caixa();
		Caixa q1 = new Caixa();
		Caixa q2 = new Caixa();
		
		q.tm = 2;
		q.qt = 5000;
		q.qa = 3200;
		
		q1.tm = 3;
		q1.qt = 7000;
		q1.qa = 5000;
		
		q2.tm = 4;
		q2.qt = 10000;
		q2.qa = 10000;
		
		q.Tamanho();
		q.QuantidadeTo();
		q.QuantidadeArm();
		System.out.println();

		q1.Tamanho();
		q1.QuantidadeTo();
		q1.QuantidadeArm();
		System.out.println();

		q2.Tamanho();
		q2.QuantidadeTo();
		q2.QuantidadeArm();
		
		
	}

}
