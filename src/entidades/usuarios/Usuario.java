package entidades.usuarios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entidades.Emprestimo;
import entidades.Exemplar;
import entidades.Livro;
import entidades.Reserva;
import entidades.emprestimos.EmprestimoStrategy;

public class Usuario {
    protected int codigo;
    protected String nome;
    protected List<Emprestimo> emprestimos = new ArrayList<>();
    protected List<Reserva> reservas = new ArrayList<>();
    protected EmprestimoStrategy regraEmprestimo;
    
    public Usuario(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public boolean emprestar(Livro livro) {
        if (!regraEmprestimo.podeEmprestimo(this, livro)) return false;
        Exemplar ex = livro.getExemplarDisponivel();
        if (ex == null) return false;
        LocalDate hoje = LocalDate.now();
        LocalDate devolucao = hoje.plusDays(regraEmprestimo.getPrazoDias());
        Emprestimo e = new Emprestimo(this,livro.getTitulo(), ex, hoje, devolucao);
        emprestimos.add(e);
        ex.status = StatusExemplar.EMPRESTADO;
        ex.emprestadoPara = this;
        reservas.removeIf(r -> r.getLivro() == livro);
        livro.reservas.removeIf(r -> r.usuario == this);
        return true;
    }

    public void devolver(Livro livro) {
        for (Emprestimo e : emprestimos) {
            if (e.livro == livro && e.status.equals("EM CURSO")) {
                e.status = "FINALIZADO";
                e.dataDevolucaoReal = LocalDate.now();
                e.exemplar.status = StatusExemplar.DISPONIVEL;
                break;
            }
        }
    }

    public void reservar(Livro livro) {
        Reserva r = new Reserva(this, livro, LocalDate.now());
        reservas.add(r);
        livro.adicionarReserva(r);
    }

    public void mostrarInfo() {
        System.out.println("Usuário: " + nome);
        System.out.println("Empréstimos:");
        for (Emprestimo e : emprestimos)
            System.out.println("- " + e);
        System.out.println("Reservas:");
        for (Reserva r : reservas)
            System.out.println("- " + r);
    }
}