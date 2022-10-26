/*
Criando um objeto Caneta, demonstrando suas características/atributos, 
comportamento/métodos e estado atual.
Logo em seguida, configurando a visibilidade dos atributos e métodos.
*/

public class CanetaDemo {
	public static void main(String[] args) {

		Caneta c1 = new Caneta();
		c1.modelo = "bic cristal";
		c1.cor = "azul";
		//c1.ponta = 0.5;
		c1.carga = 50;
		//c1.tampada = true;

		//c1.rabiscar();
		c1.tampar();
		//c1.destampar();
		c1.status();

	}
}