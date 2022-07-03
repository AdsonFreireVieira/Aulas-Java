package aulaException;

import java.util.Scanner;

public class TesteException {
	
	public static void main(String[] args) {
		
		Scanner ler =new Scanner(System.in);
		
		try {
	   
		int a=Integer.parseInt(args [0]);
		int b=Integer.parseInt(args[1]);
		int c = a/b;
		
		System.out.println("Resultado da Divisao  " + c);
	}
		catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			  System.out.println("informe dois valores");
		}
		catch (ArithmeticException e) {
	         System.out.println(" erro Divisao por Zero");
		 }
		catch (Exception e) {
                System.out.println("deu Ruim");
		}
		finally {
			System.out.println("Chegou finally");
		}
	} 
}
