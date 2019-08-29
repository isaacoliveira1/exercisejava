package Atributos;

public class AgendaAct {

	public static void main(String[] args) {
		Agenda a = new Agenda("Finalizar Software", "23/08/2016", "13:00" , "Thiago Henrique" );
		Agenda a1 = new Agenda();
		Agenda a2 = new Agenda();
		a1.settarefa("Limpar a Casa");
		a1.setdata("09/08/2017");
		a1.sethora("18:00");
		a1.setrespo("Julio Costa");
		a2.settarefa("Realziar Reunião");
		a2.setdata("23/09/2018");
		a2.sethora("09:00");
		a2.setrespo("Carlos Eduardo");
		
		System.out.println("Tarefa: " + a.gettarefa());
		System.out.println("Data: " + a.getdata());
		System.out.println("Hora: " + a.gethora());
		System.out.println("Responsavel: " + a.getrespo());
		System.out.println();

		System.out.println("Tarefa: " + a1.gettarefa());
		System.out.println("Data: " + a1.getdata());
		System.out.println("Hora: " + a1.gethora());
		System.out.println("Responsavel: " + a1.getrespo());
		System.out.println();

		System.out.println("Tarefa: " + a2.gettarefa());
		System.out.println("Data: " + a2.getdata());
		System.out.println("Hora: " + a2.gethora());
		System.out.println("Responsavel: " + a2.getrespo());
		
		
		
	}

}
