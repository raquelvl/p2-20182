import java.util.Scanner;

public class Aposentadoriav1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double alvo = recebeDouble(sc, "Quanto dinheiro voce quer para se aposentar? ");
		double juros = recebeDouble(sc, "Taxa de juros em % (exemplo: digite 7.5 para 7.5%): ") / 100;
		double contribuicao = recebeDouble(sc, "Quanto dinheiro voce vai contribuir todo ano?");

		System.out
				.println("Voce pode se aposentar em " + calculaAnosContribuicao(alvo, contribuicao, juros) + " anos.");
	}

	private static double recebeDouble(Scanner teclado, String mensagem) {
		System.out.println(mensagem);
		return teclado.nextDouble();
	}

	private static int calculaAnosContribuicao(double alvo, double contribuicao, double juros) {
		double saldo = 0.0;
		int anos = 0;
		while (saldo < alvo) {
			saldo = (saldo + contribuicao) * (1 + juros);
			anos++;
		}
		return anos;
	}
}