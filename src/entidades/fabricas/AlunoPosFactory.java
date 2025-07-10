package entidades.fabricas;

import entidades.emprestimos.EmprestimoAlunoPosStrategy;
import entidades.usuarios.AlunoPosGraduacao;
import entidades.usuarios.Usuario;

public class AlunoPosFactory implements IUsuarioFactory {
	
	@Override
	public Usuario criarUsuario(int codigo, String nome) {
		return new AlunoPosGraduacao(codigo, nome, new EmprestimoAlunoPosStrategy());
	}
}
