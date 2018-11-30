package lista.em.sala;

public class No<T> {
	private T valor;
	private No proximo;
	private No anterior;

	public No(T t) {
		valor = t;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	public T getValor() {
		return valor;
	}

	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}

	@Override
	public String toString() {
		return "No [valor=" + valor + "]";
	}

}
