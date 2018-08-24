import java.util.Scanner;

public class AlunosIdadeNota {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String promptNumAlunos = "Informe o numero de alunos a serem cadastrados: ";
		String promptNome = "Informe o nome do proximo aluno a ser cadastrado: ";
		String promptIdade = "Informe a idade do proximo aluno a ser cadastrado: ";
		String promptNota = "Informe a nota do proximo aluno a ser cadastrado: ";

		int numAlunos = recebeIntPositivo(promptNumAlunos, sc);

		String[] nomes = new String[numAlunos];
		int[] idades = new int[numAlunos];
		int[] notas = new int[numAlunos];

		for (int i = 0; i < numAlunos; i++) {
			nomes[i] = recebeString(promptNome, sc);
			idades[i] = recebeIntPositivo(promptIdade, sc);
			notas[i] = recebeIntPositivo(promptNota, sc);
		}
		
		int cont = 0;
		for (int i = 0; i < numAlunos; i++) {
			if(idades[i] > 20 && notas[i] >= 7)
				cont++;
		}
		
		System.out.println(cont);
	}

	private static String recebeString(String promptNome, Scanner sc) {
		String nome = "";
		do {
			System.out.println(promptNome);
			nome = sc.nextLine();
		} while (nome.equals(""));
		return nome;
	}

	private static int recebeIntPositivo(String prompt1, Scanner sc) {
		int num = 0;
		do {
			System.out.println(prompt1);
			num = Integer.parseInt(sc.nextLine());
		} while (num <= 0);
		return num;
	}

}
