package Shop;

public class ClienteAct {

	public static void main(String[] args) {
		Cliente cli = new Cliente ("Evandro", "evandrin@gmail.com", 1, 99898435);
		System.out.println("Nome:" + cli.getnome()+ 
				"\nEmail: " + cli.getemail()+ 
				"\nCódigo: "+ cli.getcodigo()+ 
				"\nTelefone: " + cli.getfone());
		System.out.println();
		Cliente cli1 = new Cliente();
		cli1.nome1 = "Carlos";
		cli1.email1 = "carlos1268@gmail.com";
		cli1.codigo1 = 3;
		cli1.fone1 = 98340987;
		cli1.imprimir();
			
		Cliente cli2 = new Cliente ();
			cli2.setnome("Anderson");
			cli2.setemail("andersonobras@gmail.com");
			cli2.setcodigo(3);
			cli2.setfone(984532689);
			System.out.println();
			System.out.println("Nome:" + cli2.getnome()+ 
					"\nEmail: " + cli2.getemail()+ 
					"\nCódigo: "+ cli2.getcodigo()+ 
					"\nTelefone: " + cli2.getfone());
			
	}

}
