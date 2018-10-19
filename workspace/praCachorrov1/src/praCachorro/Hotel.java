package praCachorro;

import java.util.Arrays;
import java.util.Comparator;

public class Hotel {
	private Estadia[] estadias;
	private double valorDiaria;
	private double lucro;
	private Comparator<Estadia> comparadorDeEstadias;

	public Hotel(int numQuartos, double valorDiaria) {
		estadias = new Estadia[numQuartos];
		this.valorDiaria = valorDiaria;
		for (int i = 0; i < estadias.length; i++) {
			estadias[i] = new Estadia(i + 1);
		}
		comparadorDeEstadias = new ComparaPorNumeroDeDias();
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public void checkin(String nome, String raca, int numMeses, int numDias) {
		int numeroDoQuarto = encontraQuartoVazio();
		if (numeroDoQuarto > 0) {
			estadias[numeroDoQuarto - 1].alocaQuarto(nome, raca, numMeses, numDias, numeroDoQuarto);
		}
	}

	private int encontraQuartoVazio() {
		for (int i = 0; i < estadias.length; i++) {
			if (!estadias[i].isOcupado()) {
				return i + 1;
			}
		}
		return -1;
	}

	public void checkout(String nome, int quarto) {
		if (estadias[quarto - 1].getCachorro().getNome().equals(nome)) {
			lucro += (estadias[quarto - 1].getNumDias() * valorDiaria);
			estadias[quarto - 1].liberaQuarto();
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

	public String[] listaEstadias(String ordem) {
		Estadia[] aux = new Estadia[getQuantidadeEstadias()];
		int i = 0;
		for (Estadia estadia : estadias) {
			if (estadia.isOcupado())
				aux[i++] = estadia;
		}
		Estadia[] aux2 = Arrays.copyOfRange(aux, 0, i);
		setComparador(ordem);
		Arrays.sort(aux2, comparadorDeEstadias);
		return converteParaString(aux2);
	}

	private void setComparador(String ordem) {
		comparadorDeEstadias = CriaComparadorDeEstadias.getComparator(ordem);
	}

	private String[] converteParaString(Estadia[] aux2) {
		String[] aux = new String[aux2.length];
		for (int i = 0; i < aux2.length; i++) {
			aux[i] = aux2[i].toString();
		}
		return aux;
	}
}
