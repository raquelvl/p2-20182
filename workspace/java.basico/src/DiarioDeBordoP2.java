import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Codigo desenvolvido para aulas de P2-computacao@ufcg 2018.1 Usado como prova
 * de conceito, podendo ser melhorado. Assuntos: estruturas básicas de java
 * 
 * @author Livia/Raquel
 *
 */
public class DiarioDeBordoP2 {

	private static Scanner recebeNumeros = new Scanner(System.in);
	private static Scanner recebeLinha = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * para o menu
		 */
		final String MENU = "1- adicionar anotacao;\n" + "2- pesquisar i-esima anotacao;\n" + "3- listar anotacoes;\n"
				+ "4- pesquisar palavra-chave;\n" + "5- Sair";
		final int ANOTAR = 1, PESQUISAR = 2, LISTAR = 3, PESQUISAR_PALAVRA = 4, SAIR = 5;

		final String PROMPT_GET_ANOTACAO = "Qual anotacao quer ver? ";
		final String PROMPT_PALAVRA_CHAVE = "Qual a palavra a ser pesquisada nas anotacoes?";

		final int AULAS = recuperaNumeroDeAulas(args);

		String[] datas = new String[AULAS];
		String[] anotacoes = new String[AULAS];

		int op;
		int qtdEntradas = 0;

		// manipular diario
		do {
			op = leInt(MENU);
			switch (op) {

			case ANOTAR:
				qtdEntradas = anotar(anotacoes, datas, qtdEntradas);
				break;

			case PESQUISAR:
				if (qtdEntradas == 0)
					continue;
				int i = getNumeroDaAnotacao(PROMPT_GET_ANOTACAO, qtdEntradas);
				imprimeAnotacao(datas, anotacoes, i);
				break;

			case LISTAR:
				imprimeAnotacoes(datas, anotacoes, qtdEntradas);
				break;

			case PESQUISAR_PALAVRA:
				pesquisaPalavraChave(PROMPT_PALAVRA_CHAVE, datas, anotacoes, qtdEntradas);
				break;

			case SAIR:
				break;

			default:
				System.out.println("Opcao invalida!");
			}
		} while (qtdEntradas != anotacoes.length && op != SAIR);
	}// main

	private static void pesquisaPalavraChave(final String PROMPT_PALAVRA_CHAVE, String[] datas, String[] anotacoes,
			int qtdEntradas) {
		String palavraChave = leLinha(recebeLinha, PROMPT_PALAVRA_CHAVE);
		for (int j = 0; j < qtdEntradas; j++) {
			if (anotacoes[j].contains(palavraChave))
				imprimeAnotacao(datas, anotacoes, j);
		}
	}

	private static void imprimeAnotacoes(String[] datas, String[] anotacoes, int qtdEntradas) {
		for (int j = 0; j < qtdEntradas; j++) {
			imprimeAnotacao(datas, anotacoes, j);
		}
	}

	private static int getNumeroDaAnotacao(final String PROMPT_GET_ANOTACAO, int qtdEntradas) {
		int i = 0;
		do {
			i = leInt(PROMPT_GET_ANOTACAO);
		} while (i >= qtdEntradas || i < 0);
		return i;
	}

	private static String leLinha(Scanner recebeLinha, String prompt) {
		System.out.println(prompt);
		return DiarioDeBordoP2.recebeLinha.nextLine();
	}

	private static void imprimeAnotacao(String[] datas, String[] textos, int i) {
		System.out.println(datas[i] + "-" + " " + textos[i]);
	}

	private static int recuperaNumeroDeAulas(String[] args) {
		if (args.length > 1) {
			System.out.println("Uso incorreto do sistema!");
			System.exit(1);
		}

		return Integer.parseInt(args[0]);
	}

	private static int anotar(String[] textos, String[] datas, int qtdEntradas) {
		recebeData(datas, qtdEntradas);
		return recebeAnotacao(textos, qtdEntradas);
	}

	private static int recebeAnotacao(String[] textos, int qtdEntradas) {
		System.out.println("Anotacao da aula: ");
		textos[qtdEntradas++] = recebeLinha.nextLine();
		return qtdEntradas;
	}

	private static void recebeData(String[] datas, int index) {
		try {
			System.out.println("Digite a data (dd/MM/yyyy): ");
			String dataRecebida = recebeLinha.nextLine();
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			datas[index] = df.parse(dataRecebida).toString();
		} catch (Exception ex) {
			recebeData(datas, index);
		}
	}

	private static int leInt(String msg) {
		System.out.println(msg);
		while (!recebeNumeros.hasNextInt()) {
			recebeNumeros.nextLine();
			System.out.println(msg);
		}
		return recebeNumeros.nextInt();
	}
}