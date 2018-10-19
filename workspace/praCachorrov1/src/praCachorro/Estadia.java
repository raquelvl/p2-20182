package praCachorro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Estadia implements Comparable<Estadia> {
	private Cachorro cachorro;
	private int numDias;
	private LocalDate dataDeEntrada;
	private int numeroDoQuarto;
	private boolean ocupado;

	public Estadia(int numQuarto) {
		ocupado = false;
		this.numeroDoQuarto = numQuarto;
	}

	public Estadia(String nome, String raca, int numMeses, int numDias, int numeroDoQuarto) {

		this.cachorro = new Cachorro(nome, raca, numMeses);
		if (numDias <= 0)
			throw new IllegalArgumentException("numero de dias da estadia tem que ser maior que zero");
		this.numDias = numDias;
		this.dataDeEntrada = LocalDate.now();
		this.numeroDoQuarto = numeroDoQuarto;
		ocupado = true;
	}

	public Cachorro getCachorro() {
		return cachorro;
	}

	public int getNumDias() {
		return numDias;
	}

	public String getDataDeEntrada() {
		return dataDeEntrada.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	public int getNumeroDoQuarto() {
		return numeroDoQuarto;
	}

	public String dataDeSaida() {
		return dataDeEntrada.plusDays(numDias).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " ao meio dia";
	}

	@Override
	public String toString() {
		if (ocupado) {
			return cachorro.getNome() + ", quarto n. " + numeroDoQuarto + ", estadia de " + numDias
					+ " dias, iniciando em " + getDataDeEntrada();
		}
		return "quarto vazio";

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cachorro == null) ? 0 : cachorro.hashCode());
		result = prime * result + ((dataDeEntrada == null) ? 0 : dataDeEntrada.hashCode());
		result = prime * result + numDias;
		result = prime * result + numeroDoQuarto;
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
		Estadia other = (Estadia) obj;
		if (cachorro == null) {
			if (other.cachorro != null)
				return false;
		} else if (!cachorro.equals(other.cachorro))
			return false;
		if (dataDeEntrada == null) {
			if (other.dataDeEntrada != null)
				return false;
		} else if (!dataDeEntrada.equals(other.dataDeEntrada))
			return false;
		if (numDias != other.numDias)
			return false;
		if (numeroDoQuarto != other.numeroDoQuarto)
			return false;
		return true;
	}

	@Override
	public int compareTo(Estadia o) {
		return o.getNumDias() - getNumDias();
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void alocaQuarto() {
		this.ocupado = true;
	}

	public void alocaQuarto(String nome, String raca, int numMeses, int numDias, int numeroDoQuarto) {
		this.cachorro = new Cachorro(nome, raca, numMeses);
		if (numDias <= 0)
			throw new IllegalArgumentException("numero de dias da estadia tem que ser maior que zero");
		this.numDias = numDias;
		this.dataDeEntrada = LocalDate.now();
		this.numeroDoQuarto = numeroDoQuarto;
		ocupado = true;
	}

	public void liberaQuarto() {
		this.cachorro = null;
		this.dataDeEntrada = null;
		this.numDias = 0;
		this.ocupado = false;
	}

}
