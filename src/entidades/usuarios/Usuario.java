package entidades.usuarios;

import entidades.emprestimos.EmprestimoStrategy;

public abstract class Usuario {
	private int id;
	private String nome;
	private EmprestimoStrategy emprestimo;
	
	public Usuario(int codigo, String nome, EmprestimoStrategy emprestimo) {
		this.id = codigo;
		this.setNome(nome);
		this.emprestimo = emprestimo;
	}

	public int getCodigo() {
		return this.id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
