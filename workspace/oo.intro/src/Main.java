import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        if (args.length > 1) {
			System.out.println("Uso incorreto do sistema!");
			System.exit(1);
		}
        InterfaceLinhaDeComando ilc = new InterfaceLinhaDeComando(Integer.parseInt(args[0]));
        ilc.start();
    }
}