package praCachorro;

public class Main {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Uso incorreto do sistema!");
			System.exit(1);
		}
		
		try {
			InterfaceLinhaDeComando ilc = new InterfaceLinhaDeComando(Integer.parseInt(args[0]), Double.parseDouble(args[1]));
			ilc.start();
		} catch (NumberFormatException nfe) {
			System.err.println("Uso correto do programa: ");
			System.err.println("java Main <inteiro:numero de quartos> <real:valor da diaria>");
			System.err.println("Exemplo: java Main 10 82.50");
		}

	}
}