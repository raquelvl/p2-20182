package bancoHeranca;

import java.util.HashMap;
import java.util.Map;

public class Banco {
	private Map<Integer, ContaSimples> contas = new HashMap<>();
	private int id = 1;

	public int adicionaConta(String tipoDeConta, String nome, String cpf) {
		contas.put(id, ContaFactory.criaConta(tipoDeConta, id, nome, cpf));
		return id++;
	}

	public double saca(int numeroDaConta, double valor) {
		existeConta(numeroDaConta);
		return contas.get(numeroDaConta).saque(valor);

	}

	private void existeConta(int numeroDaConta) {
		if (!contas.containsKey(numeroDaConta))
			throw new IllegalArgumentException("Conta nao existe.");
	}

	public double deposita(int numeroDaConta, double valor) {
		existeConta(numeroDaConta);
		return contas.get(numeroDaConta).deposito(valor);
	}

	public String extrato(int numeroDaConta) {
		existeConta(numeroDaConta);
		return contas.get(numeroDaConta).listaExtrato();
	}
}
