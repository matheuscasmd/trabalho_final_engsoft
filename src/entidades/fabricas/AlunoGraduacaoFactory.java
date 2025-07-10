package entidades.fabricas;

import entidades.emprestimos.EmprestimoAlunoGraduacaoStrategy;
import entidades.usuarios.AlunoGraduacao;
import entidades.usuarios.Usuario;

public class AlunoGraduacaoFactory implements IUsuarioFactory {
	public Usuario criarUsuario(int id, String nome) {
        return new AlunoGraduacao(id, nome, new EmprestimoAlunoGraduacaoStrategy());
    }
}
