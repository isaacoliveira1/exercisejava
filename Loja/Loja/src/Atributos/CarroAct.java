package Atributos;

public class CarroAct {
	public static void main (String[] args) {
		Carro c = new Carro("EFG-9834", "Honda", "Civic", "Preto", "Gasolina");
			Carro c1 = new Carro ();
				c1.setplaca("AHR-8734");
				c1.setmarca("Volkswagem");
				c1.setmodelo("Gol");
				c1.setcor("Vermelho");
				c1.setcombustivel("Flex");
				
				Carro c2 = new Carro ();
				c2.setplaca("TRJ-7843");
				c2.setmarca("Chevrolet");
				c2.setmodelo("Cruze");
				c2.setcor("Prata");
				c2.setcombustivel("Gasolina");
				
				System.out.println("Placa: " + c.getplaca());
				System.out.println("Marca: " + c.getmarca());
				System.out.println("Modelo: " + c.getmodelo());
				System.out.println("Cor: " + c.getcor());
				System.out.println("Combustivel: " + c.getcombustivel());
				System.out.println();

				System.out.println("Placa: " + c1.getplaca());
				System.out.println("Marca: " + c1.getmarca());
				System.out.println("Modelo: " + c1.getmodelo());
				System.out.println("Cor: " + c1.getcor());
				System.out.println("Combustivel: " + c1.getcombustivel());
				
				System.out.println();
				System.out.println("Placa: " + c2.getplaca());
				System.out.println("Marca: " + c2.getmarca());
				System.out.println("Modelo: " + c2.getmodelo());
				System.out.println("Cor: " + c2.getcor());
				System.out.println("Combustivel: " + c2.getcombustivel());
		
		
		
	}
}
