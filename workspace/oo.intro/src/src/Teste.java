import java.util.Arrays;

public class Teste {
	private int numeroDeAulas;
	private Anotacao[] anotacoes;
	private int qtdeDeAnotacoes;

	public Teste(int numeroDeAulas) {
		super();
		this.numeroDeAulas = numeroDeAulas;

	}

	@Override
	public String toString() {
		return "Teste [anotacoes=" + Arrays.toString(anotacoes) + "]";
	}

	public int getNumeroDeAulas() {
		return numeroDeAulas;
	}

	public void setNumeroDeAulas(int numeroDeAulas) {
		this.numeroDeAulas = numeroDeAulas;
	}

	public Anotacao[] getAnotacoes() {
		return anotacoes;
	}

	public int getQtdeDeAnotacoes() {
		return qtdeDeAnotacoes;
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
		Teste other = (Teste) obj;
		if (!Arrays.equals(anotacoes, other.anotacoes))
			return false;
		if (numeroDeAulas != other.numeroDeAulas)
			return false;
		if (qtdeDeAnotacoes != other.qtdeDeAnotacoes)
			return false;
		return true;
	}

}
