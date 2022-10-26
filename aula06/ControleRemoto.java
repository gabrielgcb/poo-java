public class ControleRemoto implements Controlador{
	
	private int volume;
	private boolean ligado;
	private boolean tocando;

	public ControleRemoto(int volume, boolean ligado, boolean tocando) {
		this.setVolume(volume);
		this.setLigado(ligado);
		this.setTocando(tocando);
	}

	private int getVolume() {
		return this.volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return this.ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return this.tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	public void ligar() {
		this.setLigado(true);
	}

	public void desligar() {
		this.setLigado(false);
	}

	public void abrirMenu() {
		System.out.println("Controle ligado? " + this.getLigado());
		System.out.println("Volume: " + this.getVolume());
		for(int i = 0; i < this.getVolume(); i += 10) {
			System.out.print('|');
		}
		System.out.println();
		System.out.println("Está tocando? " + this.getTocando());
	}

	public void fecharMenu() {
		System.out.println("Fechando menu...");
	}

	public void maisVolume(int valor) {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() + valor);
		}
	}

	public void menosVolume(int valor) {
		if(this.getLigado()) {
			this.setVolume(this.getVolume() - valor);
		}
	}

	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	public void play() {
		if(this.getLigado() && !this.getTocando()) {
			this.setTocando(true);
		}
	}

	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
	}

}