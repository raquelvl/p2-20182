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
		if (qtdeDeAnotacoes == numeroDeAulas) 
			return false;
		anotacoes[qtdeDeAnotacoes++] = new Anotacao(data, anotacao);
		return true;
	}
	
	public int getNumeroDeAulas() {
		return numeroDeAulas;
	}
	
	public int getQtdeDeAnotacoes() {
		return qtdeDeAnotacoes;
	}

	public String recuperaAnotacao(int index) {
		if(index >= 0 && index < qtdeDeAnotacoes)
			return anotacoes[index].toString();
		return "anotacao nao existe.";
	}

	@Override
	public String toString() {
		return "DiarioDeClasse [anotacoes=" + Arrays.toString(anotacoes) + "]";
	}

	public String[] pesquisaPalavra(String palavra) {
		String[] result = new String[getQtdeDeAnotacoes()];
		int numOcorrencias = 0;
		for (Anotacao anotacao: anotacoes) {
			if(anotacao != null && anotacao.contemPalavra(palavra)) {
				result[numOcorrencias] = anotacao.toString();
				numOcorrencias++;
			}
		}
		return Arrays.copyOfRange(result, 0, numOcorrencias);
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiarioDeClasse other = (DiarioDeClasse) obj;
		if (!Arrays.equals(anotacoes, other.anotacoes))
			return false;
		if (numeroDeAulas != other.numeroDeAulas)
			return false;
		if (qtdeDeAnotacoes != other.qtdeDeAnotacoes)
			return false;
		return true;
	}
	
	
}
