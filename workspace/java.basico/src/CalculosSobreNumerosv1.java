import java.util.Scanner;

public class CalculosSobreNumerosv1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		final int N = recebeInteiro(teclado, "quantos numeros vai considerar?");

		int[] numeros = new int[N];

		recebeNumeros(teclado, numeros);
		int soma = soma(numeros);
		int min = minimo(numeros);
		int max = maximo(numeros);

		System.out.printf("A media dos numeros eh %.2f, o menor numero eh %d e o maior numero eh %d.",
				(double) (soma / N), min, max);
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
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < min) {
				min = numeros[i];
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

	private static void recebeNumeros(Scanner sc, int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = recebeInteiro(sc, "Digite o proximo numero");
		}
	}

	private static int recebeInteiro(Scanner sc, String string) {
		System.out.println(string);
		return sc.nextInt();
	}

}
