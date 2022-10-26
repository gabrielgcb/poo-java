public class PessoaDemo {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Gabriel", 21, 'M');
		
		Livro leitor1 = new Livro("Os miseraveis", "Victor Hugo", 400, 0, false, pessoa1);
		leitor1.abrir();
		leitor1.folhear(100);
		leitor1.avancarPag();
		System.out.println(leitor1.toString());
		leitor1.mostrarDetalhes();

	}
}
