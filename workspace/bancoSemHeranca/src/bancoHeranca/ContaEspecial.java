package bancoHeranca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContaEspecial {
	private int numero;
	private double saldo;
	private String nomeDoTitular;
	private String CPFDoTitular;
	private String dataDeCriacao;
	private double limiteCheque = 2000;

	public ContaEspecial(int id, String nomeDoTitular, String cPFDoTitular) {
		numero = id;
		this.nomeDoTitular = nomeDoTitular;
		CPFDoTitular = cPFDoTitular;
		dataDeCriacao = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	public double saque(double valor) {
		if ((saldo + limiteCheque) >= valor)
			saldo -= valor;
		return saldo;
	}

	public double deposito(double valor) {
		saldo += valor;
		return saldo;
	}

	public String listaExtrato() {
		return LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " Saldo: R$ " + saldo;
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}
	

	public String getCPFDoTitular() {
		return CPFDoTitular;
	}

	public String getDataDeCriacao() {
		return dataDeCriacao;
	}

	public double getLimiteCheque() {
		return limiteCheque;
	}

	public void setLimiteCheque(double limiteCheque) {
		this.limiteCheque = limiteCheque;
	}

}
