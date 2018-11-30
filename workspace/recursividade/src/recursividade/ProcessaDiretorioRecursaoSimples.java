package recursividade;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ProcessaDiretorioRecursaoSimples {

	public static void processa(File arquivo) throws IOException {
		if (!arquivo.isDirectory()) {
			FileReader fr = null;
			try {
				fr = new FileReader(arquivo);
				BufferedReader br = new BufferedReader(fr);
				System.out.println(">>> " + arquivo.getName() + 
						            " 1a linha: " + br.readLine());
			} finally {
				if (fr != null) {
					fr.close();
				}
			}
			return;
		}
		for (File fDir : arquivo.listFiles()) {
			if (fDir.isDirectory()) {
				System.out.println(fDir.getName());
			}
			processa(fDir);
		}
	}

	public static void main(String[] args) throws IOException {
		processa(new File("src"));
	}

}