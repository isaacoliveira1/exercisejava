package Atributos;

public class ProdutoAct {

	public static void main(String[] args) {
		Produto p = new Produto();
		p.setcod(331);
		p.setdesc("Perfume");
		p.setest(130);
		p.setpreco(59.99);
		Produto p1 = new Produto();
		p1.setcod(233);
		p1.setdesc("Mouse Pad");
		p1.setest(103);
		p1.setpreco(19.99);
		System.out.println("Código: "+ p.getcodigo());
		System.out.println("Descrição: "+ p.getdesc());
		System.out.println("Estoque: "+ p.getest());
		System.out.println("Preço: $"+ p1.getpreco()+ " Reais");
		System.out.println();
		System.out.println("Código: "+ p1.getcodigo());
		System.out.println("Descrição: "+ p1.getdesc());
		System.out.println("Estoque: "+ p1.getest());
		System.out.println("Preço: $"+ p1.getpreco()+ " Dólares");
		System.out.println();
		Produto p2 = new Produto(309, "Carro", 10, 59800);
		System.out.println("Código: "+ p2.getcodigo());
		System.out.println("Descrição: "+ p2.getdesc());
		System.out.println("Estoque: "+ p2.getest());
		System.out.println("Preço: $"+ p2.getpreco() + " Reais");
	}

}
