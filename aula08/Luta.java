import java.util.Random;

public class Luta {
	
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

	public Lutador getDesafiado() {
		return this.desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return this.desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return this.rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean getAprovada() {
		return this.aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	public void marcarLuta(Lutador l1, Lutador l2) {
		if( !(l1.equals(l2)) && 
			  l1.getCategoria().equals(l2.getCategoria()) ){
				this.setAprovada(true);
				this.setDesafiado(l1);
				this.setDesafiante(l2);	
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);	
		}
	}

	public void lutar() {
		if(this.getAprovada()) {
			System.out.println("########## DESAFIADO ##########");
			this.getDesafiado().apresentar();
			System.out.println("########## DESAFIANTE ##########");
			this.getDesafiante().apresentar();

			Random random = new Random();
			int vencedor = random.nextInt(3);

			System.out.println("===== RESULTADO DA LUTA =====");

			switch(vencedor) {
				case 0: this.getDesafiado().ganharLuta();
						this.getDesafiante().perderLuta();
						break;
				case 1: this.getDesafiado().perderLuta();
						this.getDesafiante().ganharLuta();
						break;
				case 2: this.getDesafiado().empatarLuta();
						this.getDesafiante().empatarLuta();
						break;				
			}

		} else {
			System.out.println("A luta nao pode acontecer");
		}
	}
}