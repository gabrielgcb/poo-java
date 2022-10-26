public class ContaBanco {
	
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	public ContaBanco(double saldo, boolean status) {
		this.setSaldo(saldo);
		this.setStatus(status);
	}

	public int getnumConta() {
		return this.numConta;
	}

	public void setnumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return this.dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if(tipo.equals("cc"))
			this.setSaldo(50);
		else
			this.setSaldo(150);
	}

	public void fecharConta() {
		if(this.getSaldo() > 0)
			System.out.println("Nao eh possivel fechar a conta, pois ha saldo disponivel.");
		else if(this.getSaldo() < 0)
			System.out.println("Nao possivel fechar a conta, pois ha debito na conta.");
		else {
			System.out.println("Fechamento da conta realizado com sucesso.");
			this.setnumConta(0);
			this.setTipo(null);
			this.setDono(null);
			this.setSaldo(0);
			this.setStatus(false);
		}
	}

	public void depositar(double valor) {
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Valor do deposito: " + valor + ". Saldo atual: " + this.getSaldo());
		} else {
			System.out.println("Erro ao realizar o deposito, pois a conta nao foi aberta.");
		} 
	}

	public void sacar(double valor) {
		if(this.getStatus()) {
			if(this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Valor do saque realizado: " + valor + ". Saldo restante: " + this.getSaldo());
			} else {
				System.out.println("Saldo insuficiente (" + this.getSaldo() + ")" + " para realizar esse valor de saque (" + valor + ").");
			}
		} else {
			System.out.println("Erro ao realizar saque, pois a conta nao foi aberta.");
		}
		
	}

	public void pagarMensal() {
		if(this.getStatus()){
			if(this.getTipo().equals("cc")){
				if(this.getSaldo() >= 20){
					this.setSaldo(this.getSaldo() - 20);
					System.out.println("Pagamento automatico da mensalidade da conta corrente: " + 20);
					System.out.println("Saldo atual: " + this.getSaldo());
				}	
			} else {
				if(this.getSaldo() >= 12) {
					this.setSaldo(this.getSaldo() - 12);
					System.out.println("Valor realizado do pagamento da mensalidade da conta corrente: " + 12);
					System.out.println("Saldo atual: " + this.getSaldo());
				}	
			}
		} else {
			System.out.println("Erro ao pagar a mensalidade, pois a conta nao foi aberta.");
		}
	}

	public void verificarConta() {
		System.out.println("Numero da conta: " + this.getnumConta());
		System.out.println("Tipo da conta: " + this.getTipo());
		System.out.println("Dono da conta: " + this.getDono());
		System.out.println("Saldo da conta: " + this.getSaldo());
		System.out.println("Status da conta: " + this.getStatus());
	}
}