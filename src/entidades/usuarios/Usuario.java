package entidades.usuarios;

import entidades.emprestimos.IEmprestimoStrategy;

public abstract class Usuario {
	private int id;
	private String nome;
	private IEmprestimoStrategy emprestimo;
	
	public Usuario(int codigo, String nome, IEmprestimoStrategy emprestimo) {
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
