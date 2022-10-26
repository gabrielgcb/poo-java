public class Caneta {
	String modelo;
	String cor;
	Double ponta;
	int carga;
	boolean tampada;

	void status() {
		System.out.println("Modelo da caneta: " + this.modelo);
		System.out.println("Cor da caneta: " + this.cor);
		System.out.println("Ponta da caneta: " + this.ponta);
		System.out.println("Carga da caneta: " + this.carga);
		System.out.println("A caneta esta tampada? " + this.tampada);
	}

	void rabiscar() {
		if(this.tampada == true)
			System.out.println("Erro, nao posso rabiscar.");
			
		else
			System.out.println("Gabriel 2");
	}

	void tampar() {
		this.tampada = true;
	}

	void destampar() {
		this.tampada = false;
	}


}