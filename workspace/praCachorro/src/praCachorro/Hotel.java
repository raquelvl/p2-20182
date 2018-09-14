package praCachorro;

public class Hotel {
	private Estadia[] estadias;
	private double valorDiaria;
	private double lucro;

	public Hotel(int numQuartos, double valorDiaria) {
		estadias = new Estadia[numQuartos];
		this.valorDiaria = valorDiaria;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public void checkin(String nome, String raca, int numMeses, int numDias) {
		int numeroDoQuarto = encontraQuartoVazio();
		if (numeroDoQuarto >= 0) {
			estadias[numeroDoQuarto] = new Estadia(nome, raca, numMeses, numDias, numeroDoQuarto + 1);
		}
	}

	private int encontraQuartoVazio() {
		for (int i = 0; i < estadias.length; i++) {
			if (estadias[i] == null)
				return i;
		}
		return -1;
	}

	public void checkout(String nome, int quarto) {
		if (estadias[quarto - 1].getCachorro().getNome().equals(nome)) {
			lucro += (estadias[quarto - 1].getNumDias() * valorDiaria);
			estadias[quarto - 1] = null;
		}
	}

	private int getQuantidadeEstadias() {
		int numEstadias = 0;
		for (Estadia estadia : estadias) {
			if (estadia != null)
				numEstadias++;
		}
		return numEstadias;
	}

	public double getLucro() {
		return lucro;
	}

	public String[] listaEstadias() {
		String[] aux = new String[getQuantidadeEstadias()];
		int i = 0;
		for (Estadia estadia : estadias) {
			if (estadia != null) {
				aux[i++] = estadia.toString();
			}
		}
		return aux;
	}
}
