import java.util.Scanner;

public class Entrada {
	private static Scanner leNumeros = new Scanner(System.in);
	private static Scanner leLinhas = new Scanner(System.in);
	
	public static void recebeNumeros(int[] numeros, String prompt) {
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = recebeInteiro(prompt);
		}
	}

	public static int recebeInteiro(String prompt) {
		System.out.println(prompt);
		return Integer.parseInt(leNumeros.nextLine());
	}

	public static String recebeLinha(String prompt) {
		System.out.println(prompt);
		return leLinhas.nextLine();
	}
}
