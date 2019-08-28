package Pacotes;

public class CarrinhoWeb {
	double vf;
	String p;
	String rp;
	String fn;
	
	
	public  void produtos() {
		System.out.println("Produtos: " +p);
	}
	
	public void removerprodutos() {
		System.out.println("Retirando o Produto da Lista: " +rp);
	}
	
	public void finalizarcompra() {
		System.out.println("" +fn);
	}
	public void frete() {
		System.out.println("Valor do Frete: " +vf);
	}
}
