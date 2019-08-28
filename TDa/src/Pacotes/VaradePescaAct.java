package Pacotes;

public class VaradePescaAct {

	public static void main(String[] args) {
		VaradePesca v = new VaradePesca();
		VaradePesca v1 = new VaradePesca();
		VaradePesca v2 = new VaradePesca();
		
		v.m = "Plastico";
		v.l = "Nylon";
		v.i = "Minhoca";
		v.a = "Hooper";
		
		v1.m = "Madeira";
		v1.l = "Costura";
		v1.i = "Camarão";
		v1.a = "Plastico";
		
		v2.m = "Prata";
		v2.l = "Nylon";
		v2.i = "Artificial";
		v2.a = "Gancho";
		
		v.material();
		v.linha();
		v.anzol();
		v.isca();
		System.out.println();
		v1.material();
		v1.linha();
		v1.anzol();
		v1.isca();
		System.out.println();
		v2.material();
		v2.linha();
		v2.anzol();
		v2.isca();
		
	}
	
	
}
