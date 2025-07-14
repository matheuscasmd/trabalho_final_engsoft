package entidades.usuarios;

import entidades.Livro;
import entidades.emprestimos.EmprestimoProfessorStrategy;
import utils.ObservadorLivro;

public class Professor extends Usuario implements ObservadorLivro {
	
	private int numeroNotificacoes = 0;

	public Professor(int codigo, String nome, EmprestimoProfessorStrategy emprestimo) {
		super(codigo, nome, emprestimo);
	}

	public String getNotificacoes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void notificar(Livro livro) {
		numeroNotificacoes++;	
	}

}
