package Pacotes;

public class TorcedorAct {

	public static void main(String[] args) {

		Torcedor tcd = new Torcedor();
		Torcedor tcd1 = new Torcedor();
		Torcedor tcd2 = new Torcedor();
		
		tcd.nome = "Clorisvado In�cio";
		tcd.idade = 39;
		tcd.gritar = "Vai tim�o , so um gol pra alegrar meu cora��o";
		tcd.comemorar = "Ole ole ole ola, o timao ja vai ganhar, GOOOL";
		tcd.criticar = "Olha esse jogador nao sabe bater uma bola";
		
		tcd1.nome = "Perrie Monez";
		tcd1.idade = 19;
		tcd1.gritar = "Regarde GOL, regarde GOL";
		tcd1.comemorar = "Meilleure �quipe GOOOOOOOOOL";
		tcd1.criticar = "Si c'�tait moi, le but aurait �t� marqu�";
		
		tcd2.nome = "Cleiton Souza";
		tcd2.idade= 23;
		tcd2.gritar = "VAAAI LOGO FAZ ESSE GOL";
		tcd2.comemorar = "ALA SABIA QUE IA FAZER GOL, ESSA JA TA NO PAPO";
		tcd2.criticar = "UUUUUH! , JUIZ LADR�O NEM FOI FALTA, ELE QUE SE JOGOU NO CH�O";
		

		tcd.info();
		tcd.gritar();
		tcd.comemorar();
		tcd.criticar();
		System.out.println();
		tcd1.info();
		tcd1.gritar();
		tcd1.comemorar();
		tcd1.criticar();
		System.out.println();
		tcd2.info();
		tcd2.gritar();
		tcd2.comemorar();
		tcd2.criticar();
	}

}
