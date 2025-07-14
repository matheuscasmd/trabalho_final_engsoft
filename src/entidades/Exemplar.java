package entidades;

public class Exemplar {
	
	private int codigoLivro,codigoExemplar;
	private boolean disponivel;
	
	
	public Exemplar(int livro, int exemplar) {
		this.setCodigoLivro(livro);
		this.setCodigoExemplar(exemplar);
		this.setDisponivel(true);
	}


	public int getCodigoLivro() {
		return codigoLivro;
	}


	public void setCodigoLivro(int codigoLivro) {
		this.codigoLivro = codigoLivro;
	}


	public int getCodigoExemplar() {
		return codigoExemplar;
	}


	public void setCodigoExemplar(int codigoExemplar) {
		this.codigoExemplar = codigoExemplar;
	}


	public boolean isDisponivel() {
		return disponivel;
	}


	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
}
