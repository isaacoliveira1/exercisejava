package Pacotes;

public class HelicopteroAct {

	public static void main(String[] args) {

		Helicoptero h = new Helicoptero();
		Helicoptero h1 = new Helicoptero();
		Helicoptero h2 = new Helicoptero();
		
		h.n = "CH-47";
		h.h = 6;
		h.c = 16;
		
		h1.n = "Kamov Ka-26";
		h1.h = 3;
		h1.c = 4;
		
		
		h2.n = "RAH-66 Comanche";
		h2.h = 4;
		h2.c = 3;
		
		h.nome();
		h.Hélice();
		h.cadeiras();
		
		System.out.println();
		h1.nome();
		h1.Hélice();
		h1.cadeiras();
	
		System.out.println();
		h2.nome();
		h2.Hélice();
		h2.cadeiras();
		

	}

}
