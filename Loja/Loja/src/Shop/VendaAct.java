package Shop;

public class VendaAct {

	public static void main(String[] args) {
		Venda v1 = new Venda(3, "19_08_2017", 987);
		System.out.println("C�digo: " + v1.getcodigo() + "\nData da Venda: " + v1.getdataVenda()+ "\nTotal da Venda: " + v1.gettotalVenda());
		System.out.println();
		Venda v2 = new Venda();
		v2.setcodigo(2);
		v2.setdataVenda("05_08_2018");
		v2.settotalVenda(560);
		v2.imprimir();
		
	}

}
