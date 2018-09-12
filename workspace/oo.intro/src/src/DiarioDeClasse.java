import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DiarioDeClasse {
	private int numeroDeAulas;
	private Anotacao[] anotacoes;
	private int qtdeDeAnotacoes;

	public DiarioDeClasse(int numeroDeAulas) {
		this.numeroDeAulas = numeroDeAulas;
		anotacoes = new Anotacao[this.numeroDeAulas];
	}

	public boolean adicionaAnotacao(String data, String anotacao) {
		LocalDate aData = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/uuuu"));
		return adicionaAnotacao(aData.getDayOfMonth(), aData.getMonthValue(), aData.getYear(), anotacao);
	}

	public boolean adicionaAnotacao(int dia, int mes, int ano, String anotacao) {
		if (qtdeDeAnotacoes == numeroDeAulas)
			return false;
		anotacoes[qtdeDeAnotacoes++] = new Anotacao(dia, mes, ano, anotacao);
		return true;
	}

	public int getNumeroDeAulas() {
		return numeroDeAulas;
	}

	public int getQtdeDeAnotacoes() {
		return qtdeDeAnotacoes;
	}

	public String recuperaAnotacao(int index) {
		if (index >= 0 && index < qtdeDeAnotacoes)
			return anotacoes[index].toString();
		return "anotacao nao existe.";
	}

	@Override
	public String toString() {
		String str = "DiarioDeClasse: \n";
		for (int i = 0; i < getQtdeDeAnotacoes(); i++) {
			str = str.concat(recuperaAnotacao(i) + "\n");
		}
		return str;
	}

	public String[] pesquisaPalavra(String palavra) {
		String[] matches = new String[getQtdeDeAnotacoes()];
		int numOcorrencias = 0;
		for (Anotacao anotacao : anotacoes) {
			if (anotacao != null && anotacao.contemPalavra(palavra)) {
				matches[numOcorrencias++] = anotacao.toString();
			}
		}
		return Arrays.copyOfRange(matches, 0, numOcorrencias);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(anotacoes);
		result = prime * result + numeroDeAulas;
		result = prime * result + qtdeDeAnotacoes;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof DiarioDeClasse))
			return false;
		DiarioDeClasse outroDiario = (DiarioDeClasse) obj;

		if (outroDiario.getNumeroDeAulas() != getNumeroDeAulas())
			return false;
		if (outroDiario.getQtdeDeAnotacoes() != getQtdeDeAnotacoes())
			return false;

		for (int i = 0; i < getNumeroDeAulas(); i++) {
			if (!outroDiario.recuperaAnotacao(i).equals(recuperaAnotacao(i)))
				return false;
		}
		return true;
	}

}
