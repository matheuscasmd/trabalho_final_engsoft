package entidades;

import java.util.ArrayList;
import java.util.List;

import entidades.enums.StatusExemplar;
import entidades.usuarios.Professor;
import entidades.usuarios.Usuario;
import utils.ObservadorLivro;

public class Livro {
    private int id;
    private String titulo;
    private String editora;
    private String autores;
    private int edicao;
    private int anoPublicacao;
    private List<Exemplar> exemplares = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();
    private List<ObservadorLivro> observadores = new ArrayList<>();

    public Livro(int id, String titulo, String editora, String autores, int edicao, int anoPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.editora = editora;
        this.autores = autores;
        this.edicao = edicao;
        this.anoPublicacao = anoPublicacao;
    }
    
    public Exemplar getExemplarDisponivel() {
        return exemplares.stream().filter(e -> e.getStatus() == StatusExemplar.DISPONIVEL).findFirst().orElse(null);
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
    
    public void adicionarReserva(Reserva r) {
        reservas.add(r);
        if (reservas.size() > 2) notificarObservadores();
    }
    
    public void notificarObservadores() {
        for (ObservadorLivro o : observadores) o.notificar(this);
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
    
    public void removerReserva(Usuario u) {
    	this.reservas.removeIf(r -> r.usuario == u);
    }

	public int getCodigo() {
		return this.id;
	}



	public void adicionarObservador(Professor p) {
		observadores.add(p);
	}



	public void descrever() {
		System.out.println("Código: " + id);
        System.out.println("Título: " + titulo);
        System.out.println("Editora: " + editora);
        System.out.println("Autores: " + autores);
        System.out.println("Edição: " + edicao);
        System.out.println("Ano: " + anoPublicacao);
	}

	public void adicionarExemplar(Exemplar exemplar) {
		exemplares.add(exemplar);
	}
}
