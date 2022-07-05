package Arquivosbin;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import Arquivos.Players;

public class binReader {

	   public static void main(String[] args) {
		   try {
			   File tmpArq = new File ("arquivo.bin");
			   FileInputStream  fsArq = new FileInputStream(tmpArq);
			   ObjectInputStream obj = new ObjectInputStream(fsArq);
			   		Players p;

			   do {
				   p=(Players)obj.readObject();
				   if(p !=null){
					   System.out.println("Lido :"+p.ShowInfos());
				   }
			    
			   }while(p!= null);
				   obj.close();
				   fsArq.close();
			   }
			   catch (EOFException e) {
			   
			System.out.println("Fim dos Registros");
		
	} 
		   catch (Exception e) {
             System.out.println("Erro "+ e.getMessage());
		   }
		   
		   }
}
