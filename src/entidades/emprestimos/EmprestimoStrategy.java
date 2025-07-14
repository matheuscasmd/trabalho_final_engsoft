package entidades.emprestimos;

public abstract class EmprestimoStrategy {
    protected final int limiteLivros;
    protected final int prazoDias;

    public EmprestimoStrategy(int limiteLivros, int prazoDias) {
        this.limiteLivros = limiteLivros;
        this.prazoDias = prazoDias;
    }

    public abstract void realizarEmprestimo(int idUsuario, int codigoLivro);

    public abstract int getLimiteLivros();

    public abstract int getPrazoDias();
}
