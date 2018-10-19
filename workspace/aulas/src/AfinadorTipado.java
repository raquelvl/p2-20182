import java.util.Scanner;

public class AfinadorTipado {

	public void afina(Uculele u) {

		// ...

		u.toca(Nota.C);

		// ...

	}

	public void afina(Cavaquinho s) {

		// ...

		s.toca(Nota.C);

		// ...

	}

	public void afina(Violao v) {

		// ...

		v.toca(Nota.C);

		// ...

	}

	public void afina(Baixo b) {

		// ...

		b.toca(Nota.C);

		// ...

	}

	public static void main(String[] args) {
		AfinadorTipado afinador = new AfinadorTipado();

		Scanner sc = new Scanner(System.in);

		int escolha = 4;

		while (escolha <= 4 && escolha > 0) {

			prompt();

			escolha = sc.nextInt();

			switch (escolha) {

			case 1:
				afinador.afina(new Uculele());
				break;

			case 2:
				afinador.afina(new Cavaquinho());
				break;

			case 3:
				afinador.afina(new Baixo());
				break;
			case 4:
				afinador.afina(new Violao());
				break;
			}
		}
	}

	private static void prompt() {

		System.out.println("Que instrumento voce quer afinar?");
		System.out.println("1. Para afinar a flauta;");
		System.out.println("2. Para afinar o sax;");
		System.out.println("3. Para afinar o baixo;");
		System.out.println("4. Para afinar o violao;");
		System.out.println(">4 ou <0 Para sair.");
	}

}