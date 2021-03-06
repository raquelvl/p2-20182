import java.util.Scanner;

public class CalculosSobreNumerosv0 {
	public static void main(String[] args) {
		Scanner leNumeros = new Scanner(System.in);

		System.out.println("quantos numeros vai considerar?");
		final int N = leNumeros.nextInt();

		int[] numeros = new int[N];
		int soma = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < N; i++) {
			numeros[i] = recebeInteiro(leNumeros, "Digite o proximo numero");
			soma += numeros[i];
			if (numeros[i] < min) {
				min = numeros[i];
			}
			if (numeros[i] > max) {
				max = numeros[i];
			}
		}

		System.out.printf("A media dos numeros eh %.2f, o menor numero eh %d e o maior numero eh %d.", 
				(double)(soma / N), min, max);

	}

	private static int recebeInteiro(Scanner sc, String string) {
		System.out.println(string);
		return sc.nextInt();
	}

}
