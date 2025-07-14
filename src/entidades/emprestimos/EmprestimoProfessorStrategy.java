package entidades.emprestimos;

import entidades.Livro;
import entidades.usuarios.Usuario;

public class EmprestimoProfessorStrategy extends EmprestimoStrategy {

	
	public static final int SEM_LIMITE = Integer.MAX_VALUE;

	public EmprestimoProfessorStrategy() {
		super(SEM_LIMITE, 8);
	}
	
	@Override
	public boolean podeEmprestimo(Usuario usuario, Livro livro) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
