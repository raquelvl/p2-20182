import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Anotacao {
	private LocalDate data;
	private String anotacao;

	public Anotacao(int dia, int mes, int ano) {
		this.data = LocalDate.of(ano, mes, dia);
	}

	public Anotacao(int dia, int mes, int ano, String anotacao) {
		this(dia, mes, ano);
		this.anotacao = anotacao;
	}

	public void setAnotacao(String anotacao) {
		this.anotacao = anotacao;
	}

	public void complementaAnotacao(String complemento) {
		anotacao += complemento;
	}

	public String getData() {
		return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	public String getAnotacao() {
		return anotacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anotacao == null) ? 0 : anotacao.hashCode());
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
		Anotacao other = (Anotacao) obj;
		if (anotacao == null) {
			if (other.anotacao != null)
				return false;
		} else if (!anotacao.equals(other.anotacao))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getData() + " - " + anotacao;
	}

	public boolean contemPalavra(String palavra) {
		if (anotacao.contains(palavra))
			return true;
		return false;
	}
}
