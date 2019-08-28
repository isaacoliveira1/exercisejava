package Pacotes;

public class JogadorAct {

	public static void main(String[] args) {
	
		
		
		Jogador jgd = new Jogador();
		Jogador jgd1 = new Jogador();
		Jogador jgd2 = new Jogador();
		
		
		jgd.nome = "Jorisvaldo da Cruz";
		jgd.idade = 40;
		jgd.qtdgl = 291;
		jgd.pos = "Atacante";
		
		
		jgd1.nome = "Pereira Costa";
		jgd1.idade = 21;
		jgd1.qtdgl = 39;
		jgd1.pos = "Zagueiro";
		
		jgd2.nome = "Antonio Lopes";
		jgd2.idade = 32;
		jgd2.qtdgl = 98;
		jgd2.pos = "Lateral";
		
		System.out.println("Jogador do Flamengo");
		jgd.info();
		System.out.println();
		System.out.println("Jogador do Vasco");
		jgd1.info();
		System.out.println();
		System.out.println("Jogador do Corinthias");
		jgd2.info();
		

				
	}

}
