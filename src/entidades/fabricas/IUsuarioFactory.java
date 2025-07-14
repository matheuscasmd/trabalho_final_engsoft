package entidades.fabricas;

import entidades.usuarios.Usuario;

public interface IUsuarioFactory {
	public Usuario criarUsuario(int codigo, String nome);
}