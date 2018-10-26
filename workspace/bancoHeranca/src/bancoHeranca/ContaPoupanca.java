package bancoHeranca;

public class ContaPoupanca extends ContaSimples {
	private double juros = 0.0075;

	public ContaPoupanca(int id, String nomeDoTitular, String cPFDoTitular) {
		super(id, nomeDoTitular, cPFDoTitular);
	}

	@Override
	public double deposito(double valor) {
		valor = valor + valor * juros;
		super.deposito(valor);
		return super.getSaldo();
	}

}
