package Atributos;

public class ComputadorAct {
	public static void main(String[] args) {
		Computador c = new Computador(2.83, 2, 8, 500, 17.5);
		Computador c1 = new Computador();
		Computador c2 = new Computador();
		
		c1.setpr(3.24);
		c1.setn(3);
		c1.setm(16);
		c1.seth(1000);
		c1.sett(15.6);
		c2.setpr(4.32);
		c2.setn(8);
		c2.setm(32);
		c2.seth(2000);
		c2.sett(13.5);
		
		System.out.println("Processador: " + c.getpr() + " GHz");
		System.out.println("N�cleos: " + c.getn());
		System.out.println("Mem�ria: " + c.getm());
		System.out.println("HD: "+ c.geth());
		System.out.println("Tela: " + c.gett());
		System.out.println();
		System.out.println("Processador: " + c1.getpr()+ " GHz");
		System.out.println("N�cleos: " + c1.getn());
		System.out.println("Mem�ria: " + c1.getm());
		System.out.println("HD: "+ c1.geth());
		System.out.println("Tela: " + c1.gett());
		System.out.println();
		System.out.println("Processador: " + c2.getpr()+ " GHz");
		System.out.println("N�cleos: " + c2.getn());
		System.out.println("Mem�ria: " + c2.getm());
		System.out.println("HD: "+ c2.geth());
		System.out.println("Tela: " + c2.gett());
		
		
	}
}
