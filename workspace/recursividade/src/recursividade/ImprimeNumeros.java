package recursividade;

public class ImprimeNumeros {
	private int num;
	private int until;
	
	public ImprimeNumeros(int ate) {
		num = 1;
		this.until = ate;
	}

	public void imprime() {
		System.out.println(num);
		num++;
		if(num <= until) 
			imprime();
	}
	
	public static void main(String[] args) {
		ImprimeNumeros i = new ImprimeNumeros(20);
		i.imprime();
	}

}
