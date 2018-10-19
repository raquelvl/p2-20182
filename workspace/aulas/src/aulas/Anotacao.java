package aulas;

public class Anotacao {
	private String data;
	private String texto;
	
	public Anotacao(String data, String texto) {
		this.data = data;
		this.texto = texto;
	}

	public Anotacao() {
		super();
	}


	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Anotacao [data=" + data + ", texto=" + texto + "]";
	}
	
	public boolean pesquisaPalavra(String palavra) {
		return texto.contains(palavra);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
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
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		return true;
	}
	
	

}
