package Atributos;

public class RecipienteAct {

	public static void main(String[] args) {
		Recipiente r1 = new Recipiente();
		Recipiente r = new Recipiente (1500, 500);
		System.out.println("Capacidade: "+ r.getcp()+ " ml");try { Thread.sleep (1000); } catch (InterruptedException ex) {}
		System.out.println("Enchendo o recipiente");try { Thread.sleep (1000); } catch (InterruptedException ex) {}
		System.out.println("Quantidade: "+ r.getqt()+ " ml");try { Thread.sleep (1000); } catch (InterruptedException ex) {}
		r1.setcp(8000);
		r1.setqt(7000);
		System.out.println();
		System.out.println("Capacidade: "+ r1.getcp()+ " ml");try { Thread.sleep (1000); } catch (InterruptedException ex) {}
		System.out.println("Enchendo o recipiente");try { Thread.sleep (1000); } catch (InterruptedException ex) {}
		System.out.println("Quantidade: "+ r1.getqt()+ " ml");

	}

}
