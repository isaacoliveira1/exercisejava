package Pacotes;

public class VendedorAct {

	public static void main(String[] args) {

		Vendedo v = new Vendedo();
		Vendedo v1 = new Vendedo();
		Vendedo v2 = new Vendedo();
		
		
		
		v.n = "Jorisvaldo";
		v.i = 39;
		v.c = "Vendedor Auxiliar";
		v.e = "jorisclei@americanas.com";
		
		v1.n = "Claudia";
		v1.i = 32;
		v1.c = "Gerente Auxiliar";
		v1.e = "claudia982@pontofrio.com";
				
		v2.n = "Jorisneia";
		v2.i = 21;
		v2.c = "Gerente";
		v2.e = "jorisgere@magazineluiza;com";
		
		v.nome();
		v.idade();
		v.cracha();
		v.email();
		System.out.println();
		

		v1.nome();
		v1.idade();
		v1.cracha();
		v1.email();
		System.out.println();
		

		v2.nome();
		v2.idade();
		v2.cracha();
		v2.email();
		
		
		
	}

}
