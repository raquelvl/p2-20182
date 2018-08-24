import java.util.Scanner;

public class EquacaoDeSegundoGrau {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int a = leInteiro(teclado);
		int b = leInteiro(teclado);
		int c = leInteiro(teclado);

		double delta = Math.pow(b, 2) - (4 * a * c);

		if (delta >= 0) {
			System.out.println((-b + Math.sqrt(delta)) / (2 * a));
			System.out.println((-b - Math.sqrt(delta)) / (2 * a));
		} else
			System.out.println("deu ruim... :(");
	}

	private static int leInteiro(Scanner teclado) {
		System.out.println("entre com o proximo inteiro");
		int a = teclado.nextInt();
		return a;
	}
}





