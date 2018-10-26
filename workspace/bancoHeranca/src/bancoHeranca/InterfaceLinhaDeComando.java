package bancoHeranca;

import java.util.Scanner;

public class InterfaceLinhaDeComando {

	private Scanner recebeLinha;
	private BancoFacade banco;

	public InterfaceLinhaDeComando() {
		recebeLinha = new Scanner(System.in);
		banco = new BancoFacade();
	}

	public void start() {

		/*
		 * para o menu
		 */
		final String PROMPT = ">";
		final String ABRE = "abre", SAQUE = "saque", DEPOSITO = "deposito", EXTRATO = "extrato", SAIR = "sair";
		

		String[] op;

		// manipular banco
		do {
			System.out.println(PROMPT);
			op = recebeLinha.nextLine().trim().toLowerCase().split(" ");
			switch (op[0]) {

			case ABRE:
				if (op.length != 4) {
					System.out.println("uso errado do programa: abre <tipoConta> <nome> <cpf>");
					break;
				}
				int numConta = banco.adicionaConta(op[1], op[2], op[3]);
				System.out.println("Conta numer " + numConta + " aberta com sucesso.");
				break;

			case SAQUE:
				if (op.length != 3) {
					System.out.println("uso incorreto do sistema para saque:\n saque <tipoConta> <numeroDaConta> <valorSacado>");
					break;
				}
				banco.saca(Integer.parseInt(op[1]), Double.parseDouble(op[2]));
				break;

			case DEPOSITO:
				if (op.length != 3) {
					System.out.println("uso incorreto do sistema para deposito:\n deposito <tipoConta> <numeroDaConta> <valorDepositado>");
					break;
				}
				banco.deposita(Integer.parseInt(op[1]), Double.parseDouble(op[2]));
				break;

			case EXTRATO:
				if (op.length != 2) {
					System.out.println("uso incorreto do sistema para extrato: \n extrato <tipoConta> <numeroDaConta>");
					break;
				}
				System.out.println(banco.extrato(Integer.parseInt(op[1])));
				break;

			case SAIR:
				System.out.println("TCHAU!");
				System.exit(0);
				break;

			default:
				System.out.println("Opcao invalida!");
			}
		} while (op[0] != SAIR);
	}
}
