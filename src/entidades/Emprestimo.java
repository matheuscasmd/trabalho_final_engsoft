package entidades;

import java.time.LocalDate;

import entidades.usuarios.Usuario;

public class Emprestimo {
	private Usuario usuario;
	private String tituloLivro;
	private Exemplar exemplar;
	private LocalDate dataEmprestimo, dataPrevistaDevolucao, dataDevolucao;
	private String status = "Em curso";
	
	public Emprestimo(Usuario usuario, String titulo, Exemplar exemplar, LocalDate dataEmprestimo, LocalDate dataPrevistaDevolucao) {
		this.usuario = usuario;
		this.tituloLivro = titulo;
		this.exemplar = exemplar;
		this.dataEmprestimo = dataEmprestimo;
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
	}
	
	public String toString() {
        return tituloLivro + " - " + dataEmprestimo + " a " + dataPrevistaDevolucao + " - " + status;
    }
		
}
