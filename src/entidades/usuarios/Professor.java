package entidades.usuarios;

import entidades.emprestimos.EmprestimoProfessorStrategy;

public class Professor extends Usuario {

	public Professor(int codigo, String nome, EmprestimoProfessorStrategy emprestimo) {
		super(codigo, nome, emprestimo);
	}

}
