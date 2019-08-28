package Pacotes;

public class DoençaAct {

	public static void main(String[] args) {
		Doença g = new Doença();
		Doença g1 = new Doença();
		Doença g2 = new Doença();
		
		g.n = "Febre";
		g.s = "Tosse, Espirro, Nariz Entupido";
		g.d = "Garganta, Cabeça, Corpo";
		g1.n = "Ebola";
		g1.s = "Febre, Dor de Cabeça, Dor Muscular e Calafrios";
		g1.d = "Articulação, Abdômen, Musculos";
		g2.n = "Cirrose";
		g2.s = "Cansaço, Fraqueza, Perda de Peso";
		g2.d = "Abdômen, Sangramento, Fadiga, Confusão Mental";
		
		g.nome();
		g.sintomas();
		g.dores();
		System.out.println();

		g1.nome();
		g1.sintomas();
		g1.dores();
		System.out.println();

		g2.nome();
		g2.sintomas();
		g2.dores();
	}
	
}
