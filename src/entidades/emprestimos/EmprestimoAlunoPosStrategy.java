package entidades.emprestimos;

import entidades.Livro;
import entidades.usuarios.Usuario;

public class EmprestimoAlunoPosStrategy extends EmprestimoStrategy {

	public EmprestimoAlunoPosStrategy() {
		super(3, 5);
	}

	@Override
	public boolean podeEmprestimo(Usuario usuario, Livro livro) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
