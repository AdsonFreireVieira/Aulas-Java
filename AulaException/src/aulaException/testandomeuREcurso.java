package aulaException;

import java.util.Scanner;

public class testandomeuREcurso {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try(meuRecurso r = new meuRecurso()){
			
			int valor;
			
			do {
				valor=r.getValue(teclado.nextInt());
				System.err.println("Valor recebido "+ valor);
 
			}while(valor != -1);
			
		}catch (Exception e) {
			System.out.println("erro ex"+e.getMessage());
		}	}

}
