package aulas;

public class Aluno {
	private String nome;
	private double cra;

	public Aluno(String nome, double cra) {
		super();
		this.nome = nome;
		this.cra = cra;
	}

	public double getCra() {
		return cra;
	}

	public void setCra(double cra) {
		this.cra = cra;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", cra=" + cra + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cra);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Aluno other = (Aluno) obj;
		if (Double.doubleToLongBits(cra) != Double.doubleToLongBits(other.cra))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(!(obj instanceof Aluno))
//			return false;
//		Aluno a = (Aluno) obj;
//		return nome.equals(a.nome) && cra == a.cra;
//	}

}
