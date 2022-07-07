package lambdasStream;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MinhaAplicacao {
	
	public static void main(String[] args) {
		meuObjeto o =new  meuObjeto();
		
		/*
		o.metodoDoObjeto(new minhaInterface() {
			public void metodoDaInterface() { 
				System.out.println("MEtodo da Interface Executando");
			}
		}); 
		o.metodoDoObjeto(()->System.out.println("executando de novo'"));
		
		System.out.println("Fim do Programa");*/
		
o.outroMetodoObjeto((e,f)-> {
              System.out.println("Valor do E="+ e);
              System.out.println("Valor do F ="+f);
           },
		Integer.parseInt(args[0]),
		Float.parseFloat(args[1]));	
}

}
