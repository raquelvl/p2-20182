import java.text.SimpleDateFormat;

public class Anotacao {
	private String data;
	private String anotacao;

	public Anotacao(String data) {
		this.data = data;
	}

	public Anotacao(String data, String anotacao) {
		this.data = data;
		this.anotacao = anotacao;
	}



	public void setAnotacao(String anotacao) {
		this.anotacao = anotacao;
	}

	public void complementaAnotacao(String complemento) {
		anotacao += complemento;
	}


	public String getData() {
		return data;
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
		return "Anotacao [data=" + formatarData() + ", anotacao=" + anotacao + "]";
	}

	private String formatarData() {
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		return f.format(data);
	}

	public boolean contemPalavra(String palavra) {
		if(anotacao.contains(palavra))
			return true;
		return false;
	}
}
