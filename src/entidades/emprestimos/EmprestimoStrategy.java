package entidades.emprestimos;

import entidades.Livro;
import entidades.usuarios.Usuario;

public abstract class EmprestimoStrategy {
    protected final int limiteLivros;
    protected final int prazoDias;

    public EmprestimoStrategy(int limiteLivros, int prazoDias) {
        this.limiteLivros = limiteLivros;
        this.prazoDias = prazoDias;
    }

    public int getPrazoDias() {
        return prazoDias;
    }

    public int getLimiteLivros() {
        return limiteLivros;
    }

    public abstract boolean podeEmprestimo(Usuario usuario, Livro livro);
}
