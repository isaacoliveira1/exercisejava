package Atributos;

public class RemedioAct {
	public static void main(String[] args) {
		Remedio r = new Remedio("Omeprazol", "Gen�rico", 2, 8);
		Remedio r1 = new Remedio();
		Remedio r2 = new Remedio();
		
		r1.setnome("Ibuprofeno");
		r1.settipo("Simples");
		r1.setdose(4);
		r1.setperiodicidade(12);
		r2.setnome("Dipirona");
		r2.settipo("Alop�tico");
		r2.setdose(8);
		r2.setperiodicidade(4);
		
		System.out.println("Nome do Rem�dio: "+ r.getnome());
		System.out.println("Tipo de Rem�dio: " + r.gettipo());
		System.out.println("Dose: " + r.getdose());
		System.out.println("Periodicidade: " + r.getperiodicidade());
		System.out.println();
		System.out.println("Nome do Rem�dio: "+ r1.getnome());
		System.out.println("Tipo de Rem�dio: " + r1.gettipo());
		System.out.println("Dose: " + r1.getdose());
		System.out.println("Periodicidade: " + r1.getperiodicidade());
		System.out.println();
		System.out.println("Nome do Rem�dio: "+ r2.getnome());
		System.out.println("Tipo de Rem�dio: " + r2.gettipo());
		System.out.println("Dose: " + r2.getdose());
		System.out.println("Periodicidade: " + r2.getperiodicidade());
	}
}
