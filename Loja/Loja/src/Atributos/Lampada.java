package Atributos;

public class Lampada {
	private boolean estado;
		
	
	public Lampada() {
		
	}
	public Lampada(boolean estado) {
		this.estado = estado;
	}
	public void setestado(boolean estado) {
		this.estado =estado;
		}
	public boolean getestado() {
		return this.estado;
	}
	public void alteraestado(boolean estado) {
		this.estado = estado;
	}
	
}
