package bancoHeranca;

public class BancoFacade {
	private Banco banco = new Banco();

	public int adicionaConta(String tipoDeConta, String nome, String cpf) {
		return banco.adicionaConta(tipoDeConta, nome, cpf);
	}

	public double saca(String tipoDeConta, int numeroDaConta, double valor) {
		return banco.saca(tipoDeConta, numeroDaConta, valor);
	}

	public double deposita(String tipoDeConta, int numeroDaConta, double valor) {
		return banco.deposita(tipoDeConta, numeroDaConta, valor);
	}
	
	public String extrato(String tipoDeConta, int numeroDaConta) {
		return banco.extrato(tipoDeConta, numeroDaConta);
	}

}
