package papagaio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Post {

	private final String usuario;
	private final String texto;
	private final LocalDate dataDePublicacao;

	public Post(final String usuario, final String mensagem, final LocalDate dataDePublicacao) {

		this.usuario = usuario;
		this.texto = mensagem;
		this.dataDePublicacao = dataDePublicacao;
	}

	public String getNomeDoUsuario() {
		return usuario;
	}

	public String getTextMessage() {
		return texto;
	}

	public String getPublicationInstant() {
		return dataDePublicacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss"));
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataDePublicacao == null) ? 0 : dataDePublicacao.hashCode());
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		Post other = (Post) obj;
		if (dataDePublicacao == null) {
			if (other.dataDePublicacao != null)
				return false;
		} else if (!dataDePublicacao.equals(other.dataDePublicacao))
			return false;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

}