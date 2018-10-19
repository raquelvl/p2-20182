package aulas;

import java.util.ArrayList;
import java.util.HashSet;

public class PontosExtra {
	private HashSet<String> matriculas;
	private ArrayList<String> quemRespondeu;

	public PontosExtra() {
		matriculas = new HashSet<>();
		quemRespondeu = new ArrayList<>();
	}
	
	public void adicionaParticipacao(String matricula) {
		matriculas.add(matricula);
		quemRespondeu.add(matricula);
	}
	
	public String quemRespondeu() {
		String participou = "";
		for (String matricula : quemRespondeu) {
			participou += matricula + "\n";
		}
		return participou;
	}
	
	public int quantosAlunosParticiparam() {
		return matriculas.size();
	}

}
