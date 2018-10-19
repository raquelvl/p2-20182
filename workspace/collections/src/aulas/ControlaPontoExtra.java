package aulas;

import java.util.ArrayList;
import java.util.HashSet;

public class ControlaPontoExtra {
	private ArrayList<String> respostas = new ArrayList<>();
	private HashSet<String> matriculas = new HashSet<>();
	
	public void respondeu(String mat) {
		matriculas.add(mat);
		respostas.add(mat);
	}
	
	public String listaRespostas() {
		String participou = "";
		for (String matricula : respostas) {
			participou += matricula + "\n";
		}
		return participou;
	}
	
	public int numParticipacoes() {
		return respostas.size();
	}
	
	public int numAlunosParticiparam() {
		return matriculas.size();
	}

}
