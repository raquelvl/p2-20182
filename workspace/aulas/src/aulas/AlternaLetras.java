package aulas;

import java.util.Scanner;

public class AlternaLetras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String prompt = "Digite a frase a ter as letras alternadas na impressao";
		
		String frase = recebeFrase(sc, prompt);
		char[] caracteres = frase.toCharArray();
		int i = 0;
		for (; i < caracteres.length; i+=2) {
			System.out.print(caracteres[i]);
		}
	}

	private static String recebeFrase(Scanner sc, String prompt) {
		String frase;
		do {
			System.out.println(prompt);
			frase = sc.nextLine();
		} while(frase.equals(""));
		return frase;
	}

}
