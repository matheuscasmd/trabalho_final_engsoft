package entidades.emprestimos;

public class EmprestimoAlunoPosStrategy extends EmprestimoStrategy {

	public EmprestimoAlunoPosStrategy() {
		super(3, 5);
	}
	
	//5 dias de emprestimo
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
		return 5;
	}

	

}
