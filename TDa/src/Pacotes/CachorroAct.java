package Pacotes;

public class CachorroAct {

	public static void main(String[] args) {

		Cachorro c = new Cachorro();
		Cachorro c1 = new Cachorro();
		Cachorro c2 = new Cachorro();
		
		
		c.n = "Rex";
		c.c = "Senta";
		c.r = "Pitbull";
		c.co = "Preto";
		
		c1.n = "Dotus";
		c1.c = "Late";
		c1.r = "Poodle";
		c1.co = "Branco";
		
		c2.n = "Dory";
		c2.c = "Da pata";
		c2.r = "Vira Lata";
		c2.co = "Marron Listrado Acizentado";
		
		c.nome();
		c.comando();
		c.raça();
		c.cor();
		System.out.println();
		c1.nome();
		c1.comando();
		c1.raça();
		c1.cor();
		System.out.println();
		c2.nome();
		c2.comando();
		c2.raça();
		c2.cor();
		
	}

}
