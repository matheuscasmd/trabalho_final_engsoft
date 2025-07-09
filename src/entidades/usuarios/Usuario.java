package entidades.usuarios;

public abstract class Usuario {
	private int id;
	private String nome;
	
	public Usuario(int codigo, String nome) {
		this.id = codigo;
		this.setNome(nome);
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
