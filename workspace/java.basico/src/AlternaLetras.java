import java.util.Scanner;

public class AlternaLetras {

	public static void main(String[] args) {
		String str = recebeString("Digite a frase a ter letras alternadas");
		char[] strEmCharArray = str.toCharArray();

		for (int i = 0; i < strEmCharArray.length; i++) {
//			if(strEmCharArray[i] == 'q')
//				break;
			if(i%2 == 0)
				continue;
			System.out.print(strEmCharArray[i]);
		}

	}

	private static String recebeString(String prompt) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(prompt);
		return teclado.nextLine();
	}

}
