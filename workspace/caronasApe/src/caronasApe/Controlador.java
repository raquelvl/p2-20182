package caronasApe;

import java.util.HashMap;
import java.util.Map;

public class Controlador {
	private Map<String, Usuario> usuarios;
	private Map<Integer, Caminhada> caminhadas;
	private int proximoId = 0;

	public Controlador() {
		usuarios = new HashMap();
		caminhadas = new HashMap();
	}

	public int cadastrarCaminhada(String login, String origem, String destino) {
		caminhadas.put(proximoId, new Caminhada(login, origem, destino, proximoId));
		return proximoId++;
	}

	public void cadastrarUsuario(String login, String email, String url) {
		usuarios.put(login, new Usuario(login, email, url));
	}

}
