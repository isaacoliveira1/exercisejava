package Atributos;

public class VendaAct {

	public static void main(String[] args) {
		Venda v = new Venda("Paulo Dias", "23/08/2018", "13:52", 980);
		Venda v1 = new Venda();
		Venda v2 = new Venda();
		
		v1.setcliente("Kaio Pyter");
		v1.setdata("09/01/2017");
		v1.sethora("21:52");
		v1.settotal(873);
		v2.setcliente("Luis Eduardo");
		v2.setdata("03/04/2016");
		v2.sethora("19:32");
		v2.settotal(35);
		System.out.println("Cliente: "+ v.getcliente());
		System.out.println("Data: "+ v.getdata());
		System.out.println("Hora: "+ v.gethora());
		System.out.println("Total da Venda: "+ v.gettotal());
		System.out.println();
		System.out.println("Cliente: "+ v1.getcliente());
		System.out.println("Data: "+ v1.getdata());
		System.out.println("Hora: "+ v1.gethora());
		System.out.println("Total da Venda: "+ v1.gettotal());
		System.out.println();
		System.out.println("Cliente: "+ v2.getcliente());
		System.out.println("Data: "+ v2.getdata());
		System.out.println("Hora: "+ v2.gethora());
		System.out.println("Total da Venda: "+ v2.gettotal());
		


	}

}
