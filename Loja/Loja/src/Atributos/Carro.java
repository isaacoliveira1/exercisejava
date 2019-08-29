package Atributos;

public class Carro {
	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private String combustivel;
	
	public Carro (String placa, String marca, String modelo, String cor, String combustivel) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.combustivel = combustivel;
		
	}
	
	public Carro () {
		
	}
		public void setplaca(String placa) {
			 this.placa = placa;
		}
			public String getplaca() {
				return this.placa;
			}
				public void setmarca (String marca) {
					this.marca = marca;
				}
					public String getmarca() {
						return this.marca;
					}
						public void setmodelo(String modelo) {
							this.modelo = modelo;
						}
							public String getmodelo() {
								return this.modelo;
							}
								public void setcor(String cor) {
									this.cor = cor;
								}
									public String getcor() {
										return this.cor;
									}
										public void setcombustivel(String combustivel) {
											this.combustivel = combustivel;
										}
											public String getcombustivel() {
												return this.combustivel;
											}
											
	
	
	
}
