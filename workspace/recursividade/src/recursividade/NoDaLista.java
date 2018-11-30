package recursividade;

public class NoDaLista<T> {
	private T data;
	private NoDaLista<T> proximo;
	private NoDaLista<T> anterior;

	public NoDaLista() {
		this.data = null;
		this.proximo = null;
		this.anterior = null;
	}

	public NoDaLista(T obj) {
		this.data = obj;
		this.proximo = null;
		this.anterior = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public NoDaLista<T> getProximo() {
		return proximo;
	}

	public NoDaLista<T> getAnterior() {
		return anterior;
	}
	
	public void setProximo(NoDaLista<T> proximo) {
		this.proximo = proximo;
	}
	
	public void setAnterior(NoDaLista<T> anterior) {
		this.anterior = anterior;
	}
	
	public void print() {
		System.out.println(data);
	}

	@Override
	public String toString() {
		return "NoDaLista [data=" + data + "]";
	}
	
	

}
