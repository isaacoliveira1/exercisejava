package Atributos;

public class Cliente {
	private String nome;
	private String email;
	private int codigo;
	private int fone;
	
	public Cliente(String nome, String email, int codigo, int fone) {
		this.nome = nome;
		this.email = email;
		this.codigo = codigo;
		this.fone = fone;
		
		}
	public Cliente() {
		
	}
				public String getnome() {
					return this.nome;
					
				}
					public void setnome(String nome) {
						this.nome = nome;
					}
							public String getemail() {
								return this.email;
								
							}
							public void setemail(String email) {
								this.email = email;
							}
								public int getcodigo() {
									return  this.codigo;
									}
									public void setcodigo(int codigo) {
										this.codigo = codigo;
									}
										public int getfone() {
											return this.fone;
										}
											public void setfone(int fone) {
												this.fone = fone;
											}
}
