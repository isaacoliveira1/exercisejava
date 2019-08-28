package Pacotes;

public class ParaquedasAct {
	public static void main(String[] args) {
		Paraquedas p = new Paraquedas();
		Paraquedas p1 = new Paraquedas();
		Paraquedas p2 = new Paraquedas();
		
		p.c = "Vermelho";
		p.q = 2;
		p.d = "Trajes de Segurança";
		
		p1.c = "Verde Listrado";
		p1.q = 1;
		p1.d = "Nenhum";
		
		p2.c = "Preto";
		p2.q= 3;
		p2.d = "Trajes de Segurança, Acessórios de Segurança";
		
		p.cor();
		p.qtdpessoas();
		p.dps();
		System.out.println();
		
		p1.cor();
		p1.qtdpessoas();
		p1.dps();
		
		System.out.println();
		
		p2.cor();
		p2.qtdpessoas();
		p2.dps();
		
	}
	
}
