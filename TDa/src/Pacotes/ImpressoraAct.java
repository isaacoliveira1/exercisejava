package Pacotes;

public class ImpressoraAct {

	public static void main(String[] args) {
		
		Impressora i = new Impressora();
		Impressora i1 = new Impressora();
		Impressora i2 = new Impressora();
		
		i.imp = "Bem-vindo a Impressora HP";
		i.x = "Documentos";
		i.c = "Cancelando";
		
		i1.imp = "Informações de Rede";
		i1.x = "Imagem";
		i1.c = "Problema ao cancelar";
		
		i2.imp ="Imagem";
		i2.x = "Trabalho de Português";
		i2.c = "Cancelar nao selecionado";
		
		i.imprimir();
		i.xerox();
		i.cancelar();
		System.out.println();
		

		i1.imprimir();
		i1.xerox();
		i1.cancelar();
		System.out.println();
		

		i2.imprimir();
		i2.xerox();
		i2.cancelar();
		
	}

}
