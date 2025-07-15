package entidades.emprestimos;

import java.util.List;

import entidades.Emprestimo;
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

    public boolean podeEmprestimo(Usuario usuario, Livro livro) {
    	List<Emprestimo> emprestimos = usuario.getEmprestimos();
        long quantidadeEmCurso = emprestimos.stream().filter(e -> e.getStatus().equals("Em curso")).count();
        boolean jaTem = emprestimos.stream().anyMatch(e -> e.getStatus().equals("Em curso") && e.getLivro() == livro);
        boolean semExemplarDisponivel = livro.getExemplarDisponivel() == null;
        long emprestimosAtraso = emprestimos.stream().filter(e -> e.estaAtrasado()).count();
        if(quantidadeEmCurso >= limiteLivros || jaTem || semExemplarDisponivel || emprestimosAtraso > 0) {
        	return false;
        }
        // Verificação de ele ser um dos "próximos" da fila
        if (!livro.getReservas().isEmpty()) {
            long posicaoNaFila = livro.getReservas().stream()
                .takeWhile(r -> r.getUsuario() != usuario)
                .count();
            if (posicaoNaFila >= livro.getQuantidadeDisponivel()) {
                return false;
            }
        }
        return true;
    }
}
