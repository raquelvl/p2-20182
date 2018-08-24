import java.util.Scanner;

public class Malote {
	public static void main(String[] args) {
		int numOp = 0;
		int num = 0;
		int soma = 0;
		int max = 0;

		do {
			num = recebeInt();
			soma += num;
			if (num != 0)
				numOp++;
			if (num > max)
				max = num;

		} while (numOp < 100 && num != 0);

		int media = (int) (soma / numOp);
		System.out.printf("%d %d %d", soma, media, max);
	}

	private static int recebeInt() {
		Scanner teclado = new Scanner(System.in);
		return teclado.nextInt();
	}
}
