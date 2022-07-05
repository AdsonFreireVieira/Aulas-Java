package Arquivos;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class EscritordeArquivos {

	public static void main(String[] args) {
		try {
			Scanner teclado = new Scanner(System.in);
			File tmpArquivo = new File("arquivo.txt");
			FileWriter wtArquivo = new FileWriter(tmpArquivo, true);

			int inicio, fim;

			System.out.println("digite id inicial");
			inicio = teclado.nextInt();
			System.out.println("Digite id final ");
			fim = teclado.nextInt();

			for (int tmp = inicio; tmp <= fim; tmp++) {
				Players p = new Players(tmp,"Player_"+tmp,tmp);
				wtArquivo.write(p+"\n");
			}
			wtArquivo.close();

		}

		catch (Exception e) {

			System.out.println("Erro " + e.getMessage());
		}
	}
	}

