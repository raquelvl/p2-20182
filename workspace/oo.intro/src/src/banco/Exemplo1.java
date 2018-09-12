package banco;


public class Exemplo1 {

	public static void main(String[] args) {
		Conta1 umaConta = new Conta1(1, "Joao", "309140605-06");
		umaConta.depositar(1000.0);
		System.out.println(umaConta.getSaldo());
		umaConta.sacar(300.0);
		System.out.println(umaConta);
		System.out.println(umaConta.getSaldo());
	}

}
