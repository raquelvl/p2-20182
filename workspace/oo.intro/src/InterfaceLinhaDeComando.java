import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class InterfaceLinhaDeComando {

	private Scanner recebeNumeros;
	private Scanner recebeLinha;
	private DiarioDeClasse dc;

	public InterfaceLinhaDeComando(int numAulas) {
		recebeNumeros = new Scanner(System.in);
		recebeLinha = new Scanner(System.in);
		dc = new DiarioDeClasse(numAulas);
	}	

	public void start() throws ParseException {
		/*
		 * para o menu
		 */
		final String MENU = "1- adicionar anotacao;\n" + "2- pesquisar i-esima anotacao;\n" + "3- listar anotacoes;\n"
				+ "4- pesquisar palavra-chave;\n" + "5- Sair";
		final int ANOTAR = 1, PESQUISAR = 2, LISTAR = 3, PESQUISAR_PALAVRA = 4, SAIR = 5;
		final String PROMPT_GET_ANOTACAO = "Qual anotacao quer ver? ";
		final String PROMPT_PALAVRA_CHAVE = "Qual a palavra a ser pesquisada nas anotacoes?";

		int op;
		
		// manipular diario
		do {
			op = leInt(MENU);
			switch (op) {

			case ANOTAR:
				boolean adicionou = dc.adicionaAnotacao(recebeData(), recebeAnotacao());
				valida(adicionou);
				break;

			case PESQUISAR:
				if (dc.getQtdeDeAnotacoes() == 0)
					continue;
				System.out.println(dc.recuperaAnotacao(getNumeroDaAnotacao(PROMPT_GET_ANOTACAO)));
				break;

			case LISTAR:
				System.out.println(dc.toString());
				break;

			case PESQUISAR_PALAVRA:
				String[] anotacoes = dc.pesquisaPalavra(
						                leLinha(recebeLinha, PROMPT_PALAVRA_CHAVE));
				System.out.println(Arrays.toString(anotacoes));
				break;

			case SAIR:
				break;

			default:
				System.out.println("Opcao invalida!");
			}
		} while (dc.getQtdeDeAnotacoes() != dc.getNumeroDeAulas() && op != SAIR);
	}

	private void valida(boolean adicionou) {
		if (adicionou)
			System.out.println("Anotacao inserida com sucesso");
		else
			System.out.println("Nao foi possivel inserir nova anotacao");
	}

	private int getNumeroDaAnotacao(final String PROMPT_GET_ANOTACAO) {
		int i = 0;
		do {
			i = leInt(PROMPT_GET_ANOTACAO);
		} while (i >= dc.getQtdeDeAnotacoes() || i < 0);
		return i;
	}

	private String leLinha(Scanner recebeLinha, String prompt) {
		System.out.println(prompt);
		return recebeLinha.nextLine();
	}

	private String recebeAnotacao() {
		System.out.println("Anotacao da aula: ");
		return recebeLinha.nextLine();
	}

	private String recebeData() throws ParseException {
		String dataRecebida;
		System.out.println("Digite a data (dd/MM/yyyy): ");
		dataRecebida = recebeLinha.nextLine();
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			df.parse(dataRecebida);
		} catch (Exception ex) {
			return recebeData();
		}
		return dataRecebida;
	}

	private int leInt(String msg) {
		System.out.println(msg);
		while (!recebeNumeros.hasNextInt()) {
			recebeNumeros.nextLine();
			System.out.println(msg);
		}
		return recebeNumeros.nextInt();
	}
}
