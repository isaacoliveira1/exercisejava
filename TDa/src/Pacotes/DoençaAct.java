package Pacotes;

public class Doen�aAct {

	public static void main(String[] args) {
		Doen�a g = new Doen�a();
		Doen�a g1 = new Doen�a();
		Doen�a g2 = new Doen�a();
		
		g.n = "Febre";
		g.s = "Tosse, Espirro, Nariz Entupido";
		g.d = "Garganta, Cabe�a, Corpo";
		g1.n = "Ebola";
		g1.s = "Febre, Dor de Cabe�a, Dor Muscular e Calafrios";
		g1.d = "Articula��o, Abd�men, Musculos";
		g2.n = "Cirrose";
		g2.s = "Cansa�o, Fraqueza, Perda de Peso";
		g2.d = "Abd�men, Sangramento, Fadiga, Confus�o Mental";
		
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
