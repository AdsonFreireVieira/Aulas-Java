package lambdasStream;

public class meuObjeto {

	public void metodoDoObjeto(minhaInterface m) {
		System.out.println("dentro da interface obj");
		m.metodoDaInterface();
	}
	
	public void outroMetodoObjeto(InterfaceFuncional m2, int valor, float valor2) {
		m2.executaMetodo(valor , valor2);
	}
}
