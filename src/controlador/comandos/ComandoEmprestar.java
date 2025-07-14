package controlador.comandos;

import entidades.Livro;
import entidades.usuarios.Usuario;
import utils.Repositorio;

public class ComandoEmprestar implements IComando {

	@Override
	public void executar(String[] args) {
		
        Usuario u = Repositorio.getInstance().buscarUsuarioPorCodigo(Integer.parseInt(args[1]));
        Livro l = Repositorio.getInstance().buscarLivroPorCodigo(Integer.parseInt(args[2]));
        
        
        if (u == null || l == null) {
            System.out.println("Usuário ou livro não encontrado.");
            return;
        }
        
        
        if (!u.emprestar(l)) System.out.println("Empréstimo falhou.");
        else System.out.println("Empréstimo realizado.");
    }

}
