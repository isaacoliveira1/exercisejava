package Atributos;

public class MultaAct {

	public static void main(String[] args) {
			
			Multa m = new Multa("FGH-0938", "Gravissima", "23/07/2017", "05/09/2017");
			Multa m1 = new Multa();
			Multa m2 = new Multa();
			
			m1.setplaca("KJG-0393");
			m1.settipomulta("Leve");
			m1.setdata("31/03/2018");
			m1.setvencimento("31/05/2018");
			
			m2.setplaca("LJH-3321");
			m2.settipomulta("Média");
			m2.setdata("23/08/2016");
			m2.setvencimento("23/12/2016");
			
			System.out.println("Placa: " + m.getplaca());
			System.out.println("Tipo de Multa: " + m.gettipomulta());
			System.out.println("Data: " + m.getdata());
			System.out.println("Vencimento: "+ m.getvencimento());
			System.out.println();
			System.out.println("Placa: " + m1.getplaca());
			System.out.println("Tipo de Multa: " + m1.gettipomulta());
			System.out.println("Data: " + m1.getdata());
			System.out.println("Vencimento: "+ m1.getvencimento());
			System.out.println();
			System.out.println("Placa: " + m2.getplaca());
			System.out.println("Tipo de Multa: " + m2.gettipomulta());
			System.out.println("Data: " + m2.getdata());
			System.out.println("Vencimento: "+ m2.getvencimento());
		
		
			
			
	}

}
