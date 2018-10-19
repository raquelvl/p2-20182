package aulas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Conta1 {
	private String titular;
	private String cpfTitular;
	private double saldo = 0.0;
	private int numero;
	private LocalDate dataDeAbertura;

	public Conta1(String titular, String cpfTitular, int numero) {
		this.titular = titular;
		this.cpfTitular = cpfTitular;
		this.numero = numero;
		dataDeAbertura = LocalDate.now();
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public LocalDate getDataDeAbertura() {
		return dataDeAbertura;
	}

	public double sacar(double valor) {
		if (valor <= saldo && valor > 0.0)
			saldo -= valor;
		return saldo;
	}

	public double depositar(double valor) {
		if (valor > 0)
			saldo += valor;
		return saldo;
	}

	public double transferir(Conta1 outra, double valor) {
		double old = saldo;
		sacar(valor);
		if (saldo < old)
			outra.depositar(valor);
		return saldo;
	}

	public String toString() {
		return "Conta numero " + numero + ":\nTitular: " + getTitular() + "\nSaldo: R$ " + getSaldo()
				+ "\nData de abertura: " + dataDeAbertura.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpfTitular == null) ? 0 : cpfTitular.hashCode());
		result = prime * result + numero;
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
		Conta1 other = (Conta1) obj;
		if (cpfTitular == null) {
			if (other.cpfTitular != null)
				return false;
		} else if (!cpfTitular.equals(other.cpfTitular))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}

}
