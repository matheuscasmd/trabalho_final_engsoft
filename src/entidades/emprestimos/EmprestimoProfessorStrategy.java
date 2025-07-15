package entidades.emprestimos;

import java.util.List;

import entidades.Emprestimo;
import entidades.Livro;
import entidades.usuarios.Usuario;

public class EmprestimoProfessorStrategy extends EmprestimoStrategy {

	
	public static final int SEM_LIMITE = Integer.MAX_VALUE;

	public EmprestimoProfessorStrategy() {
		super(SEM_LIMITE, 8);
	}
	
	@Override
	public boolean podeEmprestimo(Usuario usuario, Livro livro) {
	    List<Emprestimo> emprestimos = usuario.getEmprestimos();
	    boolean semExemplarDisponivel = livro.getExemplarDisponivel() == null;
	    long emprestimosAtraso = emprestimos.stream().filter(Emprestimo::estaAtrasado).count();

	    return !semExemplarDisponivel && emprestimosAtraso == 0;
	}

	
}
