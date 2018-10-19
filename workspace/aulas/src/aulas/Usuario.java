package aulas;

import java.util.Arrays;

public class Usuario {
	private String nome;
	private Postagem[] postagens;
	private int proxima = 0;

	public Usuario(String nome) {
		super();
		this.nome = nome;
		postagens = new Postagem[5];
	}

	public Usuario(String nome, String texto) {
		this(nome);
		postagens[proxima++] = new Postagem(texto);
	}

	public String getNome() {
		return nome;
	}

	public void adicionaPost(String texto) {
		if(proxima == 5)
			proxima = 0;
		postagens[proxima++] = new Postagem(texto);
	}
	
	public String[] getPostagens() {
		String[] posts = new String[5];
		int i = 0;
		for (Postagem postagem : postagens) {
			if(postagem == null)
				break;
			posts[i++] = postagem.toString() + "\n";
		}
		return Arrays.copyOfRange(posts, 0, i);
	}
	
	

}
