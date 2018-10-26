package bancoHeranca;

public class ContaFactory {
	public static final String CONTA_SIMPLES = "conta_simples";
	public static final String CONTA_POUPANCA = "conta_poupanca";
	public static final String CONTA_ESPECIAL = "conta_especial";

	public static ContaSimples criaConta(String tipoDeConta, int id, String nome, String cpf) {
		if (tipoDeConta.equals(CONTA_SIMPLES))
			return new ContaSimples(id, nome, cpf);
		else if (tipoDeConta.equals(CONTA_POUPANCA))
			return new ContaPoupanca(id, nome, cpf);
		else if (tipoDeConta.equals(CONTA_ESPECIAL))
			return new ContaEspecial(id, nome, cpf);
		return null;
	}

}
