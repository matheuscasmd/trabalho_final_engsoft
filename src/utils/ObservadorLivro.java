package utils;

import entidades.Livro;

public interface ObservadorLivro {
    void notificar(Livro livro);
}