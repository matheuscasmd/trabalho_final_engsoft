package entidades.emprestimos;

public class EmprestimoAlunoGraduacaoStrategy extends EmprestimoStrategy {
	
	public EmprestimoAlunoGraduacaoStrategy() {
		super(3,4);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void realizarEmprestimo(int idUsuario, int codigoLivro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getLimiteLivros() {
		return 3;
	}

	@Override
	public int getPrazoDias() {
		return 4;
	}
}
