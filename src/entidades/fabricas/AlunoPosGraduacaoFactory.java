package entidades.fabricas;

import entidades.usuarios.AlunoPosGraduacao;
import entidades.usuarios.Usuario;

public class AlunoPosGraduacaoFactory implements UsuarioFactory {

	@Override
	public Usuario criarUsuario(int codigo, String nome) {
		return new AlunoPosGraduacao(codigo, nome);
	}

}
