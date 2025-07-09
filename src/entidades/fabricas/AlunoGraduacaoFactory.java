package entidades.fabricas;

import entidades.usuarios.AlunoGraduacao;
import entidades.usuarios.Usuario;

public class AlunoGraduacaoFactory implements UsuarioFactory {

	@Override
	public Usuario criarUsuario(int codigo, String nome) {
		return new AlunoGraduacao(codigo,nome);
	}

}
