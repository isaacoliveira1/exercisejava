package Pacotes;

public class ReciboAct {

	
	public static void main(String[] args) {
		Recibo r = new Recibo();
		Recibo r1 = new Recibo();
		Recibo r2 = new Recibo();
		
		r.c = 98023;
		r.d = "Consertar o motor";
		r.v = 3000;
		
		r1.c = 10982;
		r1.d = "Compra de Peças";
		r1.v = 259.95;
		
		r2.c = 901;
		r2.d = "Compra de Rémedios";
		r2.v = 59.96;
		
		
		r.codigo();
		r.valor();
		r.descrição();
		System.out.println();

		r1.codigo();
		r1.valor();
		r1.descrição();
		
		System.out.println();

		r2.codigo();
		r2.valor();
		r2.descrição();
		
	}
}
