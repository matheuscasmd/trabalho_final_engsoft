package entidades.usuarios;

import entidades.emprestimos.EmprestimoAlunoPosStrategy;

public class AlunoPosGraduacao extends Usuario {

	public AlunoPosGraduacao(int codigo, String nome, EmprestimoAlunoPosStrategy emprestimo) {
		super(codigo, nome, emprestimo);
	}

}
