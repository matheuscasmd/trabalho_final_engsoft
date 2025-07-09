package entidades.fabricas;

import entidades.usuarios.Professor;
import entidades.usuarios.Usuario;

public class ProfessorFactory implements UsuarioFactory {

	@Override
	public Usuario criarUsuario(int codigo, String nome) {
		return new Professor(codigo,nome);
	}

}
