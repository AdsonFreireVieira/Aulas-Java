package LeitorArquivos;

import java.io.File;
import java.io.FileReader;

import Arquivos.Players;

import java.io.BufferedReader;

public class LeitorArquivos {

	public static void main(String[] args) {

		try {
			File tmpArquivo = new File("arquivo.txt");
			FileReader rdArquivo = new FileReader(tmpArquivo);

			BufferedReader br = new BufferedReader(rdArquivo);
			String linha;

			while ((linha = br.readLine()) != null) {
				String infos[] = linha.split(";");
				Players p = new Players(Integer.parseInt(infos[0]), infos[1], Float.parseFloat(infos[2]));
				System.out.println("Lido :"+p.ShowInfos());
			}
			br.close();
			rdArquivo.close();
		} catch (Exception e) {
			System.out.println("erro" + e.getMessage());
		}

	}
}
