package entidades;

public class Livro {
    private int id;
    private String titulo;
    private String editora;
    private String autores;
    private int edicao;
    private int anoPublicacao;

    public Livro(int id, String titulo, String editora, String autores, int edicao, int anoPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.editora = editora;
        this.autores = autores;
        this.edicao = edicao;
        this.anoPublicacao = anoPublicacao;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return String.format(
            "Livro [ID=%d, Título=%s, Editora=%s, Autores=%s, Edição=%s, Ano=%d]",
            id, titulo, editora, autores, edicao, anoPublicacao
        );
    }

	public int getCodigo() {
		return this.id;
	}
}
