package Pacotes;

public class SapatoAct {

	public static void main(String[] args) {
		
		Sapato spt = new Sapato();
		Sapato spt1 = new Sapato();
		Sapato spt2 = new Sapato();
		
		spt.modelo = "Nike";
		spt.pc = 59.9;
		spt.tm = 39;
		spt.cor = "Preto";
		spt.cda = "Laranja e Verde";
		
		
		spt1.modelo = "AllStar";
		spt1.pc = 99.90;
		spt1.tm = 42;
		spt1.cor = "Vermelho";
		spt1.cda = "Branco";
		
		
		spt2.modelo = "Rider";
		spt2.pc = 49.90;
		spt2.tm = 43;
		spt2.cor = "Azul Marinho";
		spt2.cda = "Preto";
				
		spt.modelo();
		spt.preço();
		spt.tamanho();
		spt.cor();
		spt.cadarço();
		System.out.println();
		spt1.modelo();
		spt1.preço();
		spt1.tamanho();
		spt1.cor();
		spt1.cadarço();
		System.out.println();
		spt2.modelo();
		spt2.preço();
		spt2.tamanho();
		spt2.cor();
		spt2.cadarço();
		
		
	}
	
}
