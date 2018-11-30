package recursividade;

public class Exemplo {
	public void imprime(int num) {		
		if (num == 0)
			return;
		imprime(num - 1);
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Exemplo e = new Exemplo();
		e.imprime(10);
	}

}
