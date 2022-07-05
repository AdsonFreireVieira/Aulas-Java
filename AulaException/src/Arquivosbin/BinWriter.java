package Arquivosbin;

import java.io.FileOutputStream;
import java.io.File;
import java.io.ObjectOutputStream;

import java.util.Scanner;

import Arquivos.Players;


public class BinWriter {
	public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
		try {
			File tmArq = new File("arquivo.bin");
                FileOutputStream  fsArq = new FileOutputStream(tmArq);
                
                ObjectOutputStream obj = new ObjectOutputStream(fsArq);
                
                int inicio,fim;
                System.out.println("Digite o id inicial");
                inicio = teclado.nextInt();
                
                System.out.println("Digite id final :");
                fim =teclado.nextInt();
                
                for(int tmp=inicio; tmp<=fim; tmp++) {
                	Players p = new Players(tmp,"Player_"+tmp, tmp);
                	obj.writeObject(p);
                }
                obj.close();
                fsArq.close();
                
		} catch (Exception e) {
			System.out.println("Erro :" + e.getMessage());
		}
	}
}
