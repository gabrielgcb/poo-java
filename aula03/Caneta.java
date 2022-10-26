public class Caneta {
	public String modelo;
	public String cor;
	private Double ponta;
	protected int carga;
	private boolean tampada;

	public void status() {
		System.out.println("Modelo da caneta: " + this.modelo);
		System.out.println("Cor da caneta: " + this.cor);
		System.out.println("Ponta da caneta: " + this.ponta);
		System.out.println("Carga da caneta: " + this.carga);
		System.out.println("A caneta esta tampada? " + this.tampada);
	}

	private void rabiscar() {
		if(this.tampada == true)
			System.out.println("Erro, nao posso rabiscar.");
		else
			System.out.println("Gabriel 2");
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}

}