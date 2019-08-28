package Pacotes;

public class CarrinhoWebAct {

	public static void main(String[] args) {

		CarrinhoWeb c = new CarrinhoWeb();
		CarrinhoWeb c1 = new CarrinhoWeb();
		CarrinhoWeb c2 = new CarrinhoWeb();
		
		c.p = "Geladeira, Frigobar, Cama";
		c.rp = "Cama";
		c.vf = 54.45;
		c.fn = "Finalizando Compra";
		
		c1.p = "Celular,Notebook,Quadro";
		c1.rp = "Quadro";
		c1.vf = 29.98;
		c1.fn = "Compra cancelada!";
		
		c2.p = "Cadeira,Mesa,Aspirador de Pó";
		c2.rp = "Aspirador de Pó";
		c2.vf = 31.92;
		c2.fn = "Houve um problema na sua compra!";
		
		c.produtos();
		c.removerprodutos();
		c.frete();
		c.finalizarcompra();
		System.out.println();
		
		c1.produtos();
		c1.removerprodutos();
		c1.frete();
		c1.finalizarcompra();
		
		System.out.println();
		c2.produtos();
		c2.removerprodutos();
		c2.frete();
		c2.finalizarcompra();
		
		
		
		

	}

}
