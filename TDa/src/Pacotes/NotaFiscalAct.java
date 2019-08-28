package Pacotes;

public class NotaFiscalAct {

	public static void main(String[] args) {

		NotaFiscal nt = new NotaFiscal();
		NotaFiscal nt1 = new NotaFiscal();
		NotaFiscal nt2 = new NotaFiscal();
		
		nt.c = 102;
		nt.d = "24/08/2017";
		nt.v = 231.98;
		nt.p = "Escova de Cabelo";
		nt.n = "Claudineia Evandres";
		
		nt1.c = 293;
		nt1.d = "21/02/2016";
		nt1.v = 999.98;
		nt1.p = "Celular";
		nt1.n = "Aristoldo Clovis";
		
		nt2.c = 983;
		nt2.d = "31/01/2019";
		nt2.v = 3399.98;
		nt2.p = "Geladeira";
		nt2.n = "Dylan Bethoven";
		
		nt.Requerente();
		nt.codigo();
		nt.data();
		nt.valor();
		nt.produto();
		System.out.println();
		nt1.Requerente();
		
		nt1.codigo();
		nt1.data();
		nt1.valor();
		nt1.produto();
		
		System.out.println();

		nt2.Requerente();
		nt2.codigo();
		nt2.data();
		nt2.valor();
		nt2.produto();
		
		
	}

}
