package aulas;

import java.util.HashSet;

public class ExemploDeProblemaHash {
	public static void main(String[] args) {
		System.out.println(insereElementos());
	}

	private static int insereElementos() {
		Aluno um = new Aluno("um", 1);
		Aluno dois = new Aluno("dois", 2);
		Aluno outroUm = new Aluno("um", 1);
		
		HashSet<Aluno> alunos = new HashSet<>();
		alunos.add(um);
		alunos.add(dois);
		alunos.add(outroUm);
		alunos.add(um);
		
		imprimeAlunos(alunos);
		
		return alunos.size();
	}

	private static void imprimeAlunos(HashSet<Aluno> alunos) {
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
		
	}

}
