package recursividade;

public class MinhaListaLigada<T> {
	private NoDaLista<T> primeiro;
	private NoDaLista<T> ultimo;
	private int count;

	/* adiciona no inicio */
	public void adiciona(T data) {
		NoDaLista<T> novoNo = new NoDaLista<T>(data);
		if (primeiro == null) {
			novoNo.setProximo(null);
			primeiro = novoNo;
			ultimo = novoNo;
		} else if (ultimo.equals(primeiro)) {
			novoNo.setProximo(primeiro);
			ultimo = primeiro;
			primeiro = novoNo;
		} else {
			novoNo.setProximo(primeiro);
			primeiro.setAnterior(novoNo);
			primeiro = novoNo;
		}
		count++;
	}


	private void imprimeLista(NoDaLista<T> no) {
		System.out.println("No = " + no.getData());
		if (no.getProximo() != null)
			imprimeLista(no.getProximo());
	}

	public void print() {
		imprimeLista(primeiro);
	}

	public static void main(String[] args) {
		MinhaListaLigada<String> mll = new MinhaListaLigada<>();
		mll.adiciona("Test");
		mll.adiciona("Free");
		mll.adiciona("Yes");
		mll.adiciona("Me");
		mll.print();
		System.out.println(mll.getCount());

	}

	private int getCount() {
		return count;
	}
}
