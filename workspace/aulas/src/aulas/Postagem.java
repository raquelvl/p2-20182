package aulas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Postagem {
	private String texto;
	private LocalDate data;

	public Postagem(String texto) {
		this.texto = texto;
	}

	public Postagem(String texto, LocalDate data) {
		this.texto = texto;
		this.data = data;
	}

	public String getTexto() {
		return texto;
	}

	public String getData() {
		return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm"));
	}

	public String getTempoPostagem() {
		return getData();
	}
	
	

	@Override
	public String toString() {
		return texto + " (" + getTempoPostagem() + ")";
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
		Postagem other = (Postagem) obj;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		return true;
	}

	public static void main(String[] args) {
		Postagem p = new Postagem("exemplo");
		System.out.println(p.toString());

	}

}
