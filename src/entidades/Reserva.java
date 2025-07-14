package entidades;

import java.time.LocalDate;

import entidades.usuarios.Usuario;

public class Reserva {
    Usuario usuario;
    Livro livro;
    LocalDate data;
    public Reserva(Usuario u, Livro l, LocalDate d) {
        usuario = u; livro = l; data = d;
    }
    public String toString() {
        return livro.getTitulo() + " (" + data + ")";
    }
    
    public Livro getLivro() {
    	return this.livro;
    }
}