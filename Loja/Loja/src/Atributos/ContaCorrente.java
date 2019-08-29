package Atributos;

public class ContaCorrente {
	private int banco;
	private int agencia;
	private String conta;
	private double saldo;
	
	public ContaCorrente(int banco, int agencia, String conta, double saldo) {
		this.banco = banco;
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}
	public ContaCorrente() {
		
	}
		public void setbanco(int banco) {
			this.banco = banco;
		}
			public int getbanco() {
				return this.banco;
			}
				public void setagencia(int agencia) {
					this.agencia = agencia;
				}
					public int getagencia() {
						return this.agencia;
					}
						public void setconta (String conta) {
							this.conta = conta;
						}
							public String getconta() {
								return this.conta;
							}
								public void setsaldo(double saldo) {
									this.saldo = saldo;
								}
									public double getsaldo() {
										return this.saldo;
									}
	
}
