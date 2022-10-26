public class CanetaDemo {
	public static void main(String[] args) {

		Caneta c1 = new Caneta("BIC", "AZUL", 0.5);

		c1.setModelo("BIC");
		c1.setPonta(0.5);

		c1.status();

		/*System.out.println("Modelo da caneta: " + c1.getModelo());
		System.out.println("Ponta da caneta: " + c1.getPonta());
		System.out.println("Cor: " + c1.getCor());
		System.out.println("Tampada: " + c1.getTampada());*/

	}
}