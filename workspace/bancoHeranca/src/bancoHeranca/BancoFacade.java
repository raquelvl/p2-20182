package bancoHeranca;

public class BancoFacade {
	private Banco banco = new Banco();

	public int adicionaConta(String tipoDeConta, String nome, String cpf) {
		return banco.adicionaConta(tipoDeConta, nome, cpf);
	}

	public double saca(int numeroDaConta, double valor) {
		return banco.saca(numeroDaConta, valor);
	}

	public double deposita(int numeroDaConta, double valor) {
		return banco.deposita(numeroDaConta, valor);
	}
	
	public String extrato(int numeroDaConta) {
		return banco.extrato(numeroDaConta);
	}

}
