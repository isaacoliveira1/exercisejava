package Pacotes;

public class FacaAc {

	
	public static void main(String[] args) {
		
		Faca f = new Faca();
		Faca f1 = new Faca();
		Faca f2 = new Faca();
		
		
		f.n = "Buck 119 Special";
		f1.n = "Gerber LMF II Infantry Knife";
		f2.n = "Cold Steel GI Tanto 80PGTK";
		f.m = "Adaga";
		f1.m = "Bainha";
		f2.m = "Bainha";
		f.mt = "Lâmina";
		f1.mt = "Lâmina inoxidável";
		f2.mt = "Aço AUS-8";
		
		f.nome();
		f.modelo();
		f.material();
		System.out.println();

		f1.nome();
		f1.modelo();
		f1.material();
		System.out.println();

		f2.nome();
		f2.modelo();
		f2.material();
		
	}
}
