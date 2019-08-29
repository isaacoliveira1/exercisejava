package Atributos;

public class Agenda {
	private String tarefa;
	private String data;
	private String hora;
	private String respo;
	
	
	public Agenda(String tarefa, String data, String hora, String respo) {
		this.tarefa = tarefa;
		this.data = data;
		this.hora = hora;
		this.respo = respo;
	}
	public Agenda() {
		
	}
		public void settarefa(String tarefa) {
			this.tarefa = tarefa;			
		}
			public String gettarefa() {
				return this.tarefa;
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
				  			public void setrespo(String respo) {
				  				this.respo = respo;
				  			}
				  				public String getrespo() {
				  					return this.respo;
				  				}
	
	
	
	
	
	
	
	
}
