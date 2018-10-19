package caronasApe;

import java.util.HashSet;
import java.util.Set;

public class Caminhada {
	private String login, origem, destino;
	private int id;
	private boolean ativa;
	private Set<String> usuarios;
	
	public Caminhada(String loginDoUsuario, String origem, String destino, int id) {
		this.origem = origem;
		this.destino = destino;
		this.id = id;
		this.ativa = true;
		usuarios = new HashSet<>();
		usuarios.add(loginDoUsuario);
		this.login = loginDoUsuario;
	}
	
	public boolean isAtiva() {
		return ativa;
	}

	public void finaliza() {
		this.ativa = false;
	}

	public String getLogin() {
		return login;
	}

	public String getOrigem() {
		return origem;
	}

	public String getDestino() {
		return destino;
	}

	public int getId() {
		return id;
	}

	public Set<String> getUsuarios() {
		return usuarios;
	}

	public String loginDeQuemCriou() {
		return login;
	}
	
	

}
