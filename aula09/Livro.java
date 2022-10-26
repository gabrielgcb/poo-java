public class Livro implements Publicacao {

	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = pagAtual;
		this.aberto = aberto;
		this.leitor = leitor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.setAberto(true);
	}

	@Override
	public void fechar() {
		this.setAberto(false);
	}

	@Override
	public void folhear(int qtdPags) {
		if(this.isAberto()) {
			if(qtdPags < this.getTotPaginas()) {
				System.out.println("Folheando o livro...");
				this.setPagAtual(this.getPagAtual() + qtdPags);
			} else {
				this.setPagAtual(0);
			}	
		} else {
			System.out.println("Não é possível folhear o livro, pois ele não está aberto.");
		}	
	}

	@Override
	public void avancarPag() {
		if(this.isAberto()) {
			if(this.getPagAtual() < this.getTotPaginas()) {
				this.setPagAtual(this.getPagAtual() + 1);
			} else {
				this.setPagAtual(0);
			}	
		}	
		else
			System.out.println("Não é possível avançar a página, pois o livro não está aberto.");
	}

	@Override
	public void voltarPag() {
		if(this.isAberto())
			this.setPagAtual(this.getPagAtual() - 1);
		else
			System.out.println("Não é possível volar a página, pois o livro não está aberto.");
	}
	
	public void mostrarDetalhes() {
		System.out.println("Titulo: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total de Páginas: " + this.getTotPaginas());
		System.out.println("Pagina atual: " + this.getPagAtual());
		System.out.println("O livro está aberto? " + this.isAberto());
		System.out.println("Leitor: " + leitor.getNome());
	}

	@Override
	public String toString() {
		return "Livro [titulo = " + titulo + ", autor = " + autor + ", totPaginas = " + totPaginas + ", pagAtual = " + pagAtual
				+ ", aberto = " + aberto + ", leitor = " + leitor.getNome() + ", idade = " + leitor.getIdade() + ", sexo = " + leitor.getSexo() + "]";
	}	
	
}
