package aulaException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class leitorArquivos {
	
	public static void main(String[] args)throws Exception {
		
		try (BufferedReader br= new BufferedReader(new FileReader("arquivo.in"));
){
			String  s;
			while((s=br.readLine()) != null) {
				System.out.println("Lido =" + s);
			}
		}
		catch (IOException e) {
               System.out.println("Deu Ruim");
		
		}
	}

}
