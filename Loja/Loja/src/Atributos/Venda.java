package Atributos;

public class Venda {
	private String cliente;
	private String data;
	private String hora;
	private double total;
	
	public Venda(String cliente, String data, String hora, double total) {
		this.cliente = cliente;
		this.data = data;
		this.hora = hora;
		this.total = total;
	}
	public Venda() {
		
	}
		public void setcliente(String cliente) {
			this.cliente = cliente;
		}
			public String getcliente() {
				return this.cliente;
			}
				public void setdata(String data) {
					this.data = data;
				}
					public String getdata() {
						return this.data;
					}
						public void sethora(String hora) {
							this.hora = hora;
						}
							public String gethora() {
								return this.hora;
							}
								public void settotal(double total) {
									this.total = total;
								}
									public double gettotal() {
										return this.total;
										
									}
	
	
}
