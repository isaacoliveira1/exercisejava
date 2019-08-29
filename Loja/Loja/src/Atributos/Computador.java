package Atributos;

public class Computador {
	private double pr;
	private int n;
	private int m;
	private int h;
	private double t;
	
	public Computador(double pr, int n, int m, int h, double t) {
		this.pr = pr;
		this.n = n;
		this.m = m;
		this.h = h;
		this.t = t;
		}
	public Computador() {
		
	}
		public void setpr(double pr) {
			this.pr = pr;
		}
			public double getpr() {
				return this.pr;
			}
				public void setn(int n) {
					this.n = n;
				}
					public int getn() {
						return this.n;
					}
						public void setm(int m) {
							this.m = m;
						}
							public int getm() {
								return this.m;
							}
								public void seth(int h) {
									this.h = h;
								}
									public int geth() {
										return this.h;
										}
											public void sett(double t) {
												this.t = t;
											}
												public double gett() {
													return this.t;
												}
	
}
