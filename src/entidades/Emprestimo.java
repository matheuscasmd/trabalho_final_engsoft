package entidades;

import java.time.LocalDate;

import entidades.enums.StatusEmprestimo;
import entidades.usuarios.Usuario;

public class Emprestimo {
	private Usuario usuario;
	private Livro livro;
	private Exemplar exemplar;
	private LocalDate dataEmprestimo, dataPrevistaDevolucao, dataDevolucao;
	private StatusEmprestimo status;
	
	public Emprestimo(Usuario usuario, Livro livro, Exemplar exemplar, LocalDate dataEmprestimo, LocalDate dataPrevistaDevolucao) {
		this.usuario = usuario;
		this.livro = livro;
		this.exemplar = exemplar;
		this.dataEmprestimo = dataEmprestimo;
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
		this.status = StatusEmprestimo.EM_CURSO;
	}
	
	public String toString() {
        return livro.getTitulo() + " - " + dataEmprestimo + " a " + dataPrevistaDevolucao + " - " + status;
    }
		
	public Livro getLivro() {
		return this.livro;
	}
	
	public void setStatus(StatusEmprestimo status) {
		this.status = status;
	}
	
	public void setDataDevolucao(LocalDate data) {
		this.dataDevolucao = data;
	}
	
	public String getStatus() {
		if(this.status.equals(StatusEmprestimo.EM_CURSO)) {
			return "Em curso";
		}
		return "Finalizado";
	}

	public Exemplar getExemplar() {
		return this.exemplar;
	}
	
	public boolean estaAtrasado() {
        return status.equals(StatusEmprestimo.EM_CURSO) && LocalDate.now().isAfter(dataPrevistaDevolucao);
    }
}
