package Atributos;

public class Remedio {
	private String nome;
	private String tipo;
	private int dose;
	private int periodicidade;
	
	public Remedio(String nome, String tipo, int dose, int periodicidade) {
		this.nome = nome;
		this.tipo = tipo;
		this.dose = dose;
		this.periodicidade = periodicidade;
		
	}
	public Remedio() {
		
	}
		public void setnome(String nome) {
			this.nome = nome;
		}
			public String getnome() {
				return this.nome;
			}
				public void settipo(String tipo) {
					this.tipo = tipo;
				}
					public String gettipo() {
						return this.tipo;
					}
						public void setdose(int dose) {
							this.dose = dose;
						}
							public int getdose() {
								return this.dose;
							}
								public void setperiodicidade(int periodicidade) {
									this.periodicidade = periodicidade;
								}
									public int getperiodicidade() {
										return this.periodicidade;
									}
	
	
	
	
	
}
