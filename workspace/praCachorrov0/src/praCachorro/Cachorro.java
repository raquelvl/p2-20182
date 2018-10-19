package praCachorro;

public class Cachorro {
	private String nome;
	private String raca;
	private int numMeses;

	public Cachorro(String nome, String raca, int numMeses) {
		if(nome == null) {
			throw new IllegalArgumentException("nome nao pode ser null");
		}
		if(nome.trim().equals("")) {
			throw new IllegalArgumentException("nome nao pode ser vazio");
		}
		if(raca == null) {
			throw new IllegalArgumentException("raca nao pode ser null");
		}
		if(raca.trim().equals("")) {
			throw new IllegalArgumentException("raca nao pode ser vazia");
		}
		if(numMeses < 0) {
			throw new IllegalArgumentException("idade tem que ser positiva");
		}
		this.nome = nome;
		this.raca = raca;
		this.numMeses = numMeses;
	}

	public String getNome() {
		return nome;
	}

	public String getRaca() {
		return raca;
	}

	public int getNumMeses() {
		return numMeses;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numMeses;
		result = prime * result + ((raca == null) ? 0 : raca.hashCode());
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
		Cachorro other = (Cachorro) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numMeses != other.numMeses)
			return false;
		if (raca == null) {
			if (other.raca != null)
				return false;
		} else if (!raca.equals(other.raca))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nome + ", da raca " + raca + ", tem " + numMeses + " meses";
	}

}
