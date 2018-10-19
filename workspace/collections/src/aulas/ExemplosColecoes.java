package aulas;

import java.util.ArrayList;
import java.util.HashSet;

public class ExemplosColecoes {
	public static void main(String[] args) {
		try {
			teste1();
		} catch (IndexOutOfBoundsException iobe) {
			System.err.println("IndexOutOfBoundsException: " + iobe.getMessage());
		}
		teste2();
	}

	public static void teste1() {
		String[] palavras1 = new String[10];
		for (int i = 0; i < palavras1.length; i++) {
			palavras1[i] = "Raquel";
		}
		palavras1[10] = "Raquel"; // o que vai acontecer aqui?
	}

	public static void teste2() {
		ArrayList<String> palavras2 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			palavras2.add(i, "Raquel");
		}
		palavras2.add(10, "Raquel"); // o que vai acontecer aqui?
		imprimeArrayList(palavras2);
	}

	private static void imprimeArrayList(ArrayList<String> palavras2) {
		for (String palavra : palavras2) {
			System.out.println(palavra);
		}
		//mostrar com for normal
	}

	public void teste3() {
		ArrayList<Aluno> alunos = new ArrayList<>();
		// adiciona elemento na posicao 0
		alunos.add(0, new Aluno("Monica", 10.0));
		// adiciona elemento no fim da lista
		alunos.add(new Aluno("Cebolinha", 9.0));
		alunos.size(); // indica o numero de elementos inseridos
		Aluno cebolinha = new Aluno("Cebolinha", 9.0);
		alunos.contains(cebolinha); // informa T se o aluno está na lista
		
	}
	
	public static void teste4() {
		HashSet<String> palavras3 = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			palavras3.add("Raquel");
		}
		System.out.println(palavras3.contains("Raquel")); 	
		System.out.println(palavras3.size());
	}

}
