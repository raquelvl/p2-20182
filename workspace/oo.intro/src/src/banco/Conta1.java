package banco;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Conta1 {
	private String nomeTitular;
	private String cpfTitular;
	private double saldo;
	private int numero;
	private LocalDate dataDeAbertura;

	public Conta1(int numero, String nome, String cpf) {
		this.numero = numero;
		this.nomeTitular = nome;
		this.cpfTitular = cpf;
		this.dataDeAbertura = LocalDate.now();
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void sacar(double valor) {
		saldo -= valor;
	}

	public void transferir(Conta1 outraConta, double valor) {
		sacar(valor);
		outraConta.depositar(valor);
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public String getCPFTitular() {
		return cpfTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public String toString() {
		return "Conta numero " + getNumero() + ":\nTitular: " + getNomeTitular() + "\nSaldo: R$ " + getSaldo()
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
	
	public double idadeDaContaEmAnos() {
		return dataDeAbertura.until(LocalDate.now(), ChronoUnit.YEARS);
	}

}
