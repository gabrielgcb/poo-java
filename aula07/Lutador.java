public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,
			       int vitorias, int derrotas, int empates) {
		super();
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setVitorias(vitorias);
		this.setDerrotas(derrotas);
		this.setEmpates(empates);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if(peso < 52.2)	
			this.categoria = "inválido";
		else if(peso <= 70.3)
			this.categoria = "leve";
		else if(peso <= 83.9)
			this.categoria = "médio";
		else if(peso <= 120.2)
			this.categoria = "pesado";
		else
			this.categoria = "inválido";
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	public void apresentar() {
		System.out.println("E o nosso próximo lutador, pesando " + this.getPeso() + 
							" kg, diretamente do(a) " + this.getNacionalidade() + 
							",  " + this.getNome() +
							"!!!!!!!");
		System.out.println("--------------------------------------------------");

	}
	public void status() {
		System.out.println("--------------------------------------------------");
		System.out.println("nome: " + this.getNome());
		System.out.println("idade: " + this.getIdade());
		System.out.println("altura: "+ this.getAltura());
		System.out.println("peso: " + this.getPeso());
		System.out.println("categoria: " + this.getCategoria());
		System.out.println("vitorias: " + this.getVitorias());
		System.out.println("derrotas: " + this.getDerrotas());
		System.out.println("empates: " + this.getEmpates());	
		System.out.println("--------------------------------------------------");

	}
	public void ganharLuta() {
		System.out.println("O lutador " + this.getNome() + " ganhou a luta!!!");
		this.setVitorias(this.getVitorias() + 1);
	}
	public void perderLuta() {
		System.out.println("O lutador " + this.getNome() + " perdeu a luta...");
		this.setDerrotas(this.getDerrotas() + 1);
	}
	public void empatarLuta() {
		System.out.println("O lutador " + this.getNome() + " empatou a luta...");
		this.setEmpates(this.getEmpates() + 1);
	}
	
}
