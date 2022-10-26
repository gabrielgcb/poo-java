public class Caneta {
	
	public String modelo;
	private String cor;
	private double ponta;
	private boolean tampada;

	public Caneta(String m, String c, double p) {
		this.setModelo(m);
		this.setCor(c);
		this.setPonta(p);
		this.tampar();
	}

	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}

	public String getCor() {
		return this.cor;
	}
	public void setCor(String c) {
		this.cor = c;
	}

	public double getPonta() {
		return this.ponta;
	}
	public void setPonta(double p) {
		this.ponta = p;
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}

	public boolean isTampada() {
		return this.tampada;
	}

	public void status() {
		System.out.println("Sobre a caneta: ");
		System.out.println("Modelo: " + getModelo());
		System.out.println("Ponta: " + getPonta());
		System.out.println("Cor: " + getCor());
		System.out.println("Tampada: " + getTampada());
	}
}