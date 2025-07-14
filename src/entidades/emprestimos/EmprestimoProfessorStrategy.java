package entidades.emprestimos;

public class EmprestimoProfessorStrategy extends EmprestimoStrategy {

	
	public static final int SEM_LIMITE = Integer.MAX_VALUE;

	public EmprestimoProfessorStrategy() {
		super(SEM_LIMITE, 8);
	}

	
	@Override
	public void realizarEmprestimo(int idUsuario, int codigoLivro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getLimiteLivros() {
		return SEM_LIMITE;
	}

	@Override
	public int getPrazoDias() {
		return 8;
	}

	
}
