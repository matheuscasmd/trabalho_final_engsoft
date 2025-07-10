package entidades.fabricas;

import entidades.emprestimos.EmprestimoProfessorStrategy;
import entidades.usuarios.Professor;
import entidades.usuarios.Usuario;

public class ProfessorFactory implements IUsuarioFactory {

	@Override
	public Usuario criarUsuario(int codigo, String nome) {
		return new Professor(codigo, nome, new EmprestimoProfessorStrategy());
	}

}
