package Atributos;

public class Paciente {
	private String nome;
	private double peso;
	private double altura;
	private String tipoSangue;
	
	public Paciente (String nome, double peso, double altura, String tipoSangue) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.tipoSangue = tipoSangue;
	}
	public Paciente() {
		
	}
		public void setnome( String nome) {
			this.nome = nome;
		}
			public String getnome() {
				return this.nome;
			}
				public void setpeso(double peso) {
					this.peso = peso;
				}
					public double getpeso() {
						return this.peso;
						}
						public void setaltura(double altura) {
							this.altura = altura;
						}
							public double getaltura() {
								return this.altura;
								}
								public void settiposangue (String tipoSangue) {
									this.tipoSangue = tipoSangue;
								}
									public String gettiposangue() {
										return this.tipoSangue;
									}
	
	
	
	
	
}
