package bancoHeranca;

import java.util.HashMap;
import java.util.Map;

public class Banco {
	public static final String CONTA_SIMPLES = "conta_simples";
	public static final String CONTA_POUPANCA = "conta_poupanca";
	public static final String CONTA_ESPECIAL = "conta_especial";
	private Map<Integer, ContaSimples> contasSimples = new HashMap<>();
	private Map<Integer, ContaPoupanca> contasPoupanca = new HashMap<>();
	private Map<Integer, ContaEspecial> contasEspeciais = new HashMap<>();
	private int id = 1;

	public int adicionaConta(String tipoDeConta, String nome, String cpf) {
		if (tipoDeConta.equals(CONTA_SIMPLES))
			contasSimples.put(id, new ContaSimples(id, nome, cpf));
		else if (tipoDeConta.equals(CONTA_POUPANCA))
			contasPoupanca.put(id, new ContaPoupanca(id, nome, cpf));
		else if (tipoDeConta.equals(CONTA_ESPECIAL))
			contasEspeciais.put(id, new ContaEspecial(id, nome, cpf));
		return id++;
	}

	public double saca(String tipoDeConta, int numeroDaConta, double valor) {
		if (tipoDeConta.equals(CONTA_SIMPLES)) {
			ContaSimples conta = contasSimples.get(numeroDaConta);
			return conta.saque(valor);
		}
		if (tipoDeConta.equals(CONTA_POUPANCA)) {
			ContaPoupanca conta = contasPoupanca.get(numeroDaConta);
			return conta.saque(valor);
		}
		if (tipoDeConta.equals(CONTA_ESPECIAL)) {
			ContaEspecial conta = contasEspeciais.get(numeroDaConta);
			return conta.saque(valor);
		}

		throw new IllegalArgumentException("Conta nao existe.");
	}

	public double deposita(String tipoDeConta, int numeroDaConta, double valor) {
		if (tipoDeConta.equals(CONTA_SIMPLES)) {
			ContaSimples conta = contasSimples.get(numeroDaConta);
			return conta.deposito(valor);
		}
		if (tipoDeConta.equals(CONTA_POUPANCA)) {
			ContaPoupanca conta = contasPoupanca.get(numeroDaConta);
			return conta.deposito(valor);
		}
		if (tipoDeConta.equals(CONTA_ESPECIAL)) {
			ContaEspecial conta = contasEspeciais.get(numeroDaConta);
			return conta.deposito(valor);
		}

		throw new IllegalArgumentException("Conta nao existe.");
	}

	public String extrato(String tipoDeConta, int numeroDaConta) {
		if (tipoDeConta.equals(CONTA_SIMPLES)) {
			ContaSimples conta = contasSimples.get(numeroDaConta);
			return conta.listaExtrato();
		}
		if (tipoDeConta.equals(CONTA_POUPANCA)) {
			ContaPoupanca conta = contasPoupanca.get(numeroDaConta);
			return conta.listaExtrato();
		}
		if (tipoDeConta.equals(CONTA_ESPECIAL)) {
			ContaEspecial conta = contasEspeciais.get(numeroDaConta);
			return conta.listaExtrato();
		}

		throw new IllegalArgumentException("Conta nao existe.");
	}
}
