package aulas;

import java.util.Scanner;

public class AposentadoriaV0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String prompt1 = "Digite o valor da contribuicao anual ";
		String prompt2 = "Digite a taxa de rendimentos (valor entre 0 e 100)";
		String prompt3 = "Quanto dinheiro vc quer ter para se aposentar?";

		int contribuicaoAnual = leInteiroPositivo(prompt1, sc);
		double taxa = leTaxa(prompt2, sc) / 100;
		int valorDesejado = leInteiroPositivo(prompt3, sc);

		int anos = calculaTempoDeContribuicao(contribuicaoAnual, taxa, valorDesejado);

		System.out.println("Voce pode se aposentar em " + anos + " anos");

	}

	private static int calculaTempoDeContribuicao(int contribuicaoAnual, double taxa, int valorDesejado) {
		int saldo = 0;
		int anos = 0;
		while (saldo < valorDesejado) {
			saldo = (int) ((saldo + contribuicaoAnual) * (1 + taxa));
			anos++;
		}
		return anos;
	}

	private static int leInteiroPositivo(String p, Scanner sc) {
		int num = 0;
		do {
			System.out.println(p);
			num = sc.nextInt();	
		} while(num <= 0);
		return num;
	}

	private static double leTaxa(String p, Scanner sc) {
		double taxa = 0;
		do {
			System.out.println(p);
			taxa = sc.nextDouble();			
		} while(taxa <= 0 || taxa > 100);
		return taxa;
	}

}
