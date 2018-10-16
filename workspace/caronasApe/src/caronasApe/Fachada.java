package caronasApe;

public class Fachada {
	private Controlador controlador = new Controlador();
	
	public int cadastrarCaminhada(String login, String origem, String destino) {
		return controlador.cadastrarCaminhada(login, origem, destino);
	}
	
	public void cadastrarUsuario(String login, String email, String url) {
		
	}
	
	public void cadastrarSeguidor(String login, int id) {
		
	}
	
	public void comentarCaminhada(int id, String comentario) {
		
	}
	
	public String listarCaminhadas() {
		return null;
	}
	
	public void concluirCaminhada(int id) {
		
	}

	public String listarTotalDeCaminhadas(String login) {
		return null;
	}
	
	public String exibirComentarios(int id) {
		return null;
	}
}
