package Pacotes;

public class GarfoAct {

	
	public static void main(String[] args) {
		Garfo g = new Garfo();
		Garfo g1 = new Garfo();
		Garfo g2 = new Garfo();
		
		g.m = "Fondue";
		g.c = "Prateado";
		g.mt = "Prata";
	
		
		g1.m = "Peixe";
		g1.c = "Dourado";
		g1.c = "Ouro";
		
		g2.m = "Sobremesa";
		g2.c = "Branco";
		g2.mt = "Plastico";
		
		g.modelo();
		g.material();
		g.Cor();
		System.out.println();

		g1.modelo();
		g1.material();
		g1.Cor();
		System.out.println();

		g2.modelo();
		g2.material();
		g2.Cor();
		
		
		
	}
}
