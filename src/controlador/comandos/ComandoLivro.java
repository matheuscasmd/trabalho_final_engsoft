package controlador.comandos;

import entidades.Livro;
import utils.Repositorio;

public class ComandoLivro implements IComando {

	@Override
	public void executar(String[] args) {
		Livro l = Repositorio.getInstance().buscarLivroPorCodigo(Integer.parseInt(args[1]));
        l.descrever();
    }

}
