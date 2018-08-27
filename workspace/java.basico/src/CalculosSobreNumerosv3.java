public class CalculosSobreNumerosv3 {
	public static void main(String[] args) {

		final int QTDE_DE_NUMEROS = Entrada.recebeInteiro("quantos numeros vai considerar?");

		/* criando um array de tamanho QTDE_DE_NUMEROS */
		int[] numeros = new int[QTDE_DE_NUMEROS];
		
		/* recebendo o array de tamanho QTDE_DE_NUMEROS*/
		Entrada.recebeNumeros(numeros, "Digite o proximo numero");

		String e = null;
		while (true) {
			e = Entrada.recebeLinha(menu());

			switch (e) {
			case "0":
				System.out.println("A soma dos numeros eh " + soma(numeros));
				break;

			case "1":
				System.out.printf("A media dos numeros eh %.2f\n", (double) (soma(numeros) / QTDE_DE_NUMEROS));
				break;

			case "2":
				System.out.println("O menor numero eh " + minimo(numeros));
				break;

			case "3":
				System.out.println("O maior numero eh " + maximo(numeros));
				break;

			case "4":
				boolean encontrou = pesquisa(numeros);
				System.out.println(encontrou ? "o numero estah no array" : "o numero nao estah no array");
				break;

			case "5":
				boolean ehMultiplo = verificaSeSomaEhMultiploDeTres(numeros);
				System.out.println(ehMultiplo ? "a soma eh multiplo de 3" : "a soma nao eh multiplo de 3");
				break;

			default:
				System.exit(0);
			}
		}

	}

	private static String menu() {
		String menu = "---------------------------------------------------------";
		menu += System.lineSeparator();
		menu.concat("Digite 0 para ver a soma\n");
		menu += "Digite 1 para ver a media\n";
		menu = menu.concat("Digite 2 para ver o minimo\n");
		menu = menu.concat("Digite 3 para ver o maximo\n");
		menu += "Digite 4 para pesquisar um numero no array (esta/nao esta)\n";
		menu += "Digite 5 para ver se a soma dos numeros eh multiplo de 3 (sim/nao)\n";
		menu = menu.concat("Para sair do programa digite qualquer outro digito/caractere.\n");
		return menu;
	}

	private static boolean verificaSeSomaEhMultiploDeTres(int[] numeros) {
		if ((soma(numeros) % 3) == 0)
			return true;
		return false;
	}

	private static boolean pesquisa(int[] numeros) {
		int numero = Entrada.recebeInteiro("Digite o numero a ser pesquisado");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == numero)
				return true;
		}
		return false;
	}

	private static int maximo(int[] numeros) {
		int max = Integer.MIN_VALUE;
		for (int numero : numeros) {
			if (numero > max) {
				max = numero;
			}
		}
		return max;
	}

	private static int minimo(int[] numeros) {
		int min = Integer.MAX_VALUE;
		for (int numero : numeros) {
			if (numero < min) {
				min = numero;
			}
		}
		return min;
	}

	private static int soma(int[] numeros) {
		int soma = 0;
		for (int numero : numeros) {
			soma += numero;
		}
		return soma;
	}

}
