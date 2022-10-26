public class CanetaDemo {
	public static void main(String[] args) {

		Caneta c1 = new Caneta();
		c1.modelo = "bic";
		c1.cor = "azul";
		c1.ponta = 0.5;
		c1.carga = 90;
		c1.tampar();

		c1.status();
		c1.rabiscar();
	}
}