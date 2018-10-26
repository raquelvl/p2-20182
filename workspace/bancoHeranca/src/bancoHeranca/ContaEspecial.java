package bancoHeranca;

public class ContaEspecial extends ContaSimples {
	private double limiteCheque = 2000;

	public ContaEspecial(int id, String nomeDoTitular, String cPFDoTitular) {
		super(id, nomeDoTitular, cPFDoTitular);
	}

	public double saque(double valor) {
		if ((super.getSaldo() + limiteCheque) >= valor)
			super.saque(valor);
		return super.getSaldo();
	}

	public void setLimiteCheque(double limiteCheque) {
		this.limiteCheque = limiteCheque;
	}

}
