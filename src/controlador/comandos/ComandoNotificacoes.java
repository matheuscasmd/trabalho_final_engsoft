package controlador.comandos;

import entidades.Livro;
import entidades.usuarios.Professor;
import entidades.usuarios.Usuario;
import utils.Repositorio;

public class ComandoNotificacoes implements IComando {

	@Override
	public void executar(String[] args) {
		
		Usuario u = Repositorio.getInstance().buscarUsuarioPorCodigo(Integer.parseInt(args[1]));

		if (!(u instanceof Professor)) {
		    System.out.println("Usuário não é professor ou livro não encontrado.");
		    return;
		}

		Professor p = (Professor) u;
        System.out.println("Notificações: " + p.getNotificacoes());
    }

}
