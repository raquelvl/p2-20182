package aulas;

import java.util.LinkedHashMap;
import java.util.Set;

public class Apelidorio {
	private LinkedHashMap<String, String> apelidos = new LinkedHashMap<>();

	public void adicionaApelido(String nome, String apelido) {
		apelidos.put(nome, apelido);
	}

	public String removeApelido(String nome) {
		return apelidos.remove(nome);
	}

	public String getApelido(String nome) {
		return apelidos.get(nome);
	}

	@Override
	public String toString() {
		Set<String> chaves = apelidos.keySet();
		String aux = "";
		for (String nome : chaves) {
			aux += nome +  " - ";
			aux += apelidos.get(nome) + "\n";
		}
		return aux;
	}
	
	public boolean contemNome(String nome) {
		return apelidos.containsKey(nome);
	}
	
	public boolean contemApelido(String apelido) {
		return apelidos.containsValue(apelido);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apelidos == null) ? 0 : apelidos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Apelidorio)) {
			return false;
		}
		Apelidorio other = (Apelidorio) obj;
		if (apelidos == null) {
			if (other.apelidos != null) {
				return false;
			}
		} else if (!apelidos.equals(other.apelidos)) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Apelidorio amigosDaRaquel = new Apelidorio();
		amigosDaRaquel.adicionaApelido("Guilherme", "GuiGui");
		amigosDaRaquel.adicionaApelido("Marcus", "Kinho");
		amigosDaRaquel.adicionaApelido("Nina", "Ninoquinha");
		amigosDaRaquel.adicionaApelido("Nathalia", "Tati");
		amigosDaRaquel.adicionaApelido("Mariana", "Maribs");
		System.out.println(amigosDaRaquel);
		
		amigosDaRaquel.adicionaApelido("Mariana", "Nana");
		
		System.out.println(amigosDaRaquel);
		
		amigosDaRaquel.adicionaApelido("Fernanda", "Nana");
		
		System.out.println(amigosDaRaquel);
	}
}









