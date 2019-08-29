package Atributos;

public class Multa {
	private String placa;
	private String tipoMulta;
	private String data;
	private String vencimento;
	
	public Multa(String placa, String tipoMulta, String data, String vencimento) {
		this.placa = placa;
		this.tipoMulta = tipoMulta;
		this.data = data;
		this.vencimento = vencimento;
		}	
		
		public Multa () {
			
		}
			public void setplaca(String placa) {
				this.placa = placa;
			}
				public String getplaca() {
					return this.placa;
				}
					public void settipomulta (String tipoMulta) {
						this.tipoMulta = tipoMulta;
					}
						public String gettipomulta() {
							return this.tipoMulta;
						}
							public void setdata (String data) {
								this.data = data;
							}
								public String getdata() {
									return this.data;
								}
									public void setvencimento (String vencimento) {
										this.vencimento = vencimento;
									}
										public String getvencimento(){
											return this.vencimento;
										}
							
							
}
