package entidades.emprestimos;

import entidades.Livro;
import entidades.usuarios.Usuario;

public class EmprestimoAlunoGraduacaoStrategy extends EmprestimoStrategy {
	
	public EmprestimoAlunoGraduacaoStrategy() {
		super(3,4);
	}

	@Override
	public boolean podeEmprestimo(Usuario usuario, Livro livro) {
		// TODO Auto-generated method stub
		return false;
	}
}
