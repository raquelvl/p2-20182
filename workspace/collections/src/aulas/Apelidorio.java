package aulas;

import java.util.HashMap;

public class Apelidorio {
	private HashMap<String, String> apelidos;
	
	public Apelidorio() {
		apelidos = new HashMap<>();
	}

	public boolean temApelido(String nome) {
		return apelidos.containsKey(nome);
	}
	
	public String getApelido(String nome) {
		return apelidos.get(nome);
	}
	
	public String listaApelidos() {
		String strAux = "";
		for (String nome : apelidos.keySet()) {
			strAux += apelidos.get(nome) + "\n";
		}
		return strAux;
	}
	
	public String toString() {
		String strAux = "";
		for (String nome : apelidos.keySet()) {
			strAux += nome + " - ";
			strAux += apelidos.get(nome) + "\n";
		}
		return strAux;
	}
	
	public void adicionaApelido(String nome, String apelido) {
		apelidos.put(nome, apelido);
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
	
	public String removeApelido(String nome) {
		return apelidos.remove(nome);
	}
	
	public int quantosApelidos() {
		return apelidos.size();
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
