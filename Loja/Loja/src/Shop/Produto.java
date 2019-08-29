package Shop;

public class Produto
 {
	private int codigo;
	private String desc;
	private int est;
	private double pr;
	
	public Produto (){
		
		
	}
	public Produto(int codigo, String desc, int est, double pr) {
		this.codigo = codigo;
		this.desc = desc;
		this.est = est;
		this.pr = pr;
	}
	public void imprimir() {
		System.out.println("Código: " +codigo + "\nDescrição: "+desc+"\nEstoque: " + est+"\nPreço: "+pr);
	}
		public void setcod(int codigo) {
			this.codigo = codigo;
		}
			public int getcodigo() {
				return this.codigo;
			}
				public void setdesc (String desc) {
					this.desc = desc;
				}
					public String getdesc() {
						return this.desc;
					}
						public void setest (int est) {
							this.est = est;
						}
							public int getest() {
								return this.est;
							}
								public void setpreco(double pr) {
									this.pr = pr;
								}
									public double getpreco () {
										return this.pr;
									}
									
	
}
