package praCachorro;

import java.util.Scanner;

public class InterfaceLinhaDeComando {

	private Scanner recebeLinha;
	private HotelFacade hotel;

	public InterfaceLinhaDeComando(int numQuartos, double valorDiaria) {
		recebeLinha = new Scanner(System.in);
		hotel = new HotelFacade(numQuartos, valorDiaria);
	}

	public void start() {

		/*
		 * para o menu
		 */
		final String PROMPT = ">";
		final String CHECKIN = "checkin", CHECKOUT = "checkout", ESTADIAS = "estadias", LUCRO = "lucro", SAIR = "sair";

		String[] op;

		// manipular hotel
		do {
			System.out.println(PROMPT);
			op = recebeLinha.nextLine().trim().toLowerCase().split(" ");
			switch (op[0]) {

			case CHECKIN:
				if (op.length > 5) {
					System.out.println("uso incorreto do sistema para checkin");
					break;
				}
				try {
					hotel.checkin(op[1], op[2], Integer.parseInt(op[3]), Integer.parseInt(op[4]));
				} catch (NumberFormatException nfe) {
					System.out.println("uso incorreto do sistema para checkin");
				} catch (IllegalArgumentException iae) {
					System.out.println("Checkin nao realizado (informacao incorreta): " + iae.getMessage());
					// System.exit(1);
				} catch (NullPointerException npe) {
					System.out.println("Checkin nao realizado (falta informacao): " + npe.getMessage());
				} catch (ArrayIndexOutOfBoundsException aiobe) {
					System.out.println("uso incorreto do sistema para checkin");
				}
				break;

			case CHECKOUT:
				hotel.checkout(op[1], Integer.parseInt(op[2]));
				break;

			case ESTADIAS:
				String[] estadias = hotel.listaEstadias(op[1]);
				for (String estadia : estadias) {
					System.out.println(estadia);
				}
				break;

			case LUCRO:
				System.out.printf("R$ %.2f\n", hotel.getLucro());
				break;

			case SAIR:
				System.exit(0);
				break;

			default:
				System.out.println("Opcao invalida!");
			}
		} while (op[0] != SAIR);
	}
}
