package papagaio;

public class Usuario {

	private final String nome;
	private final String[] seguidos = new String[100];
	private int numSeguidos = 0;
	private Post[] posts = new Post[100];

	public Usuario(final String nome) {
		this.nome = nome;
	}

	public String getNomeDeUsuario() {
		return nome;
	}

	public String[] getUsuariosSeguidos() {
		return seguidos;
	}

	public void seguir(String nome) {
		seguidos[numSeguidos++] = nome;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Usuario user = (Usuario) o;

		return nome != null ? nome.equals(user.nome) : user.nome == null;
	}

	@Override
	public int hashCode() {
		return nome != null ? nome.hashCode() : 0;
	}
}
