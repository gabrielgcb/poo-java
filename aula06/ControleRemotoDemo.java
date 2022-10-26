public class ControleRemotoDemo {
	public static void main(String[] args) {

		ControleRemoto cr1 = new ControleRemoto(50, false, false);

		cr1.ligar();
		cr1.abrirMenu();
		cr1.maisVolume(50);
		cr1.abrirMenu();
		cr1.menosVolume(60);
		cr1.abrirMenu();
		cr1.fecharMenu();
		cr1.abrirMenu();
		cr1.ligarMudo();
		cr1.abrirMenu();
		//cr1.desligarMudo();
		//cr1.abrirMenu();
	}
}