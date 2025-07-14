package controlador.comandos;

import entidades.Livro;
import entidades.usuarios.Professor;
import entidades.usuarios.Usuario;
import utils.Repositorio;

public class ComandoObservar implements IComando {

	@Override
	public void executar(String[] args) {
		Usuario u = Repositorio.getInstance().buscarUsuarioPorCodigo(Integer.parseInt(args[1]));
		Livro l = Repositorio.getInstance().buscarLivroPorCodigo(Integer.parseInt(args[2]));

		if (!(u instanceof Professor) || l == null) {
		    System.out.println("Usuário não é professor ou livro não encontrado.");
		    return;
		}

		Professor p = (Professor) u;
		l.adicionarObservador(p);
		System.out.println("Professor registrado como observador.");
    }

}
