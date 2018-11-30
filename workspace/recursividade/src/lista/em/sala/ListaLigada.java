package lista.em.sala;

import recursividade.MinhaListaLigada;

public class ListaLigada<T> {
	private No<T> primeiro = null;
	private No<T> ultimo = null;

	public No<T> getPrimeiro() {
		return primeiro;
	}

	public No<T> getUltimo() {
		return ultimo;
	}

	public void setPrimeiro(No<T> primeiro) {
		this.primeiro = primeiro;
	}

	/* adiciona no iniio */
	public void adiciona(T t) {
		No no = new No(t);
		if (primeiro == null && ultimo == null) {
			setPrimeiro(no);
			no.setProximo(null);
			setUltimo(no);
			no.setAnterior(null);
		} else {
			primeiro.setAnterior(no);
			no.setAnterior(null);
			no.setProximo(primeiro);
			setPrimeiro(no);
		}
	}

	private void setUltimo(No no) {
		ultimo = no;
	}

	/* remove do inicio */
	public void remove() {
		if (primeiro == null)
			return;
		// if (primeiro.getProximo() == null) {
		// primeiro = null;
		else {
			primeiro = primeiro.getProximo();
			primeiro.setAnterior(null);
		}
	}

	public void print() {
		print(primeiro);
	}

	private void print(No n) {
		if (n == null)
			return;
		System.out.println(n);
		print(n.getProximo());
	}

	public static void main(String[] args) {
		ListaLigada<String> mll = new ListaLigada<>();
		mll.adiciona("Test");
		mll.adiciona("Free");
		mll.adiciona("Yes");
		mll.adiciona("Me");
		mll.print();
		mll.remove();
		mll.print();
		// System.out.println(mll.getCount());

	}
}
