package praCachorro;

public class Main {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Uso incorreto do sistema!");
			System.exit(1);
		}
		InterfaceLinhaDeComando ilc = new InterfaceLinhaDeComando(Integer.parseInt(args[0]),
				Double.parseDouble(args[1]));
		ilc.start();
	}
}