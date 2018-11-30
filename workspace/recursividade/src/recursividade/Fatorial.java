package recursividade;

public class Fatorial {

	public static int fatorial(int n) {
		if(n == 1)
			return 1;
		return n * fatorial(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(Fatorial.fatorial(5));
	}
}
