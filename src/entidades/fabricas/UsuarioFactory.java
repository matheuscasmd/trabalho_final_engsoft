package entidades.fabricas;

import entidades.usuarios.Usuario;

public interface UsuarioFactory {
	public Usuario criarUsuario(int codigo, String nome);
}
