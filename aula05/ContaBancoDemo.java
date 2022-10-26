import java.io.*;

public class ContaBancoDemo {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String nome = reader.readLine();

		ContaBanco conta1 = new ContaBanco(/*saldo inicial*/0, /*status inicial*/false);
		conta1.setnumConta(9448);
		conta1.setTipo("cc");
		conta1.setDono(nome);
		System.out.println("\n\tNOVA ABERTURA DE CONTA\n");
		conta1.abrirConta(conta1.getTipo());
		conta1.verificarConta();

		ContaBanco conta2 = new ContaBanco(/*saldo inicial*/0, /*status inicial*/false);
		conta2.setnumConta(7777);
		conta2.setTipo("cp");
		conta2.setDono("Yuan");
		System.out.println("\n\tNOVA ABERTURA DE CONTA\n");
		conta2.abrirConta(conta2.getTipo());
		conta2.verificarConta();

		System.out.println("\n\tDEPOSITO DE 300 NA CONTA DE GABRIEL BISPO\n");
		conta1.depositar(300);
		System.out.println("\n\tDEPOSITO DE 500 NA CONTA DE B. GABS\n");
		conta2.depositar(500);

		System.out.println("-----------------------------");
		conta1.verificarConta();
		System.out.println("-----------------------------");
		conta2.verificarConta();

		/*System.out.println("\n\tDEPOSITO NO VALOR DE 50\n");
		conta1.depositar(50);
		conta1.verificarConta();
		System.out.println("\n\tDEPOSITO NO VALOR DE 30 E SAQUE NO VALOR DE 60\n");
		conta1.depositar(30);
		conta1.sacar(60);
		conta1.verificarConta();
		System.out.println("\n\tSAQUE NO VALOR DE 50 E PAGAMENTO DA MENSALIDADE\n");
		conta1.sacar(50);
		conta1.pagarMensal();
		conta1.verificarConta();
		System.out.println("\n\tSAQUE NO VALOR DE 10\n");
		conta1.sacar(10);
		conta1.verificarConta();
		System.out.println("\n\tFECHAMENTO DE CONTA\n");
		conta1.fecharConta();
		conta1.verificarConta();*/

	}
}