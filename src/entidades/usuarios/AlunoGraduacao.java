package entidades.usuarios;

import entidades.emprestimos.EmprestimoAlunoGraduacaoStrategy;

public class AlunoGraduacao extends Usuario {

	public AlunoGraduacao(int codigo, String nome, EmprestimoAlunoGraduacaoStrategy emprestimo) {
		super(codigo,nome,emprestimo);
	}
	
}
