package controlador.comandos;

import entidades.usuarios.Usuario;
import utils.Repositorio;

public class ComandoUsuario implements IComando {

	@Override
	public void executar(String[] args) {
		Usuario u = Repositorio.getInstance().buscarUsuarioPorCodigo(Integer.parseInt(args[1]));
		
		if(u != null) {
	        u.descrever();
		} else {
		    System.out.println("Usuário não encontrado");
		}
    }

}
