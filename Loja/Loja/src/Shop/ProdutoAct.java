package Shop;

public class ProdutoAct extends Produto {

	public static void main(String[] args) {
	Produto p = new Produto(1, "Fones de Ouvido", 500, 10.99);
	System.out.println("Código: "+p.getcodigo()+"\nDescrição: "+ p.getdesc()+"\nEstoque: "+p.getest()+"\nPreço: "+ p.getpreco());
	System.out.println();
	Produto p1 = new Produto();
	p1.setcod(3);
	p1.setdesc("Produtos Ivone");
	p1.setest(1000);
	p1.setpreco(39.99);
	p1.imprimir();
	}

}
