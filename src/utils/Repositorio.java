package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entidades.Exemplar;
import entidades.Livro;
import entidades.fabricas.AlunoGraduacaoFactory;
import entidades.fabricas.AlunoPosFactory;
import entidades.fabricas.IUsuarioFactory;
import entidades.fabricas.ProfessorFactory;
import entidades.usuarios.Usuario;

public class Repositorio {
	
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	
	private Repositorio() {
		popularUsuariosDadosTeste();
		popularLivrosDadosTeste();
		popularExemplares();
	}
	private static Repositorio instance;
	
	
	public static Repositorio getInstance() {
		if(instance == null) {
			instance = new Repositorio();
		}
		return instance;
	}
	
	
	private void popularUsuariosDadosTeste() {
	    Map<String, IUsuarioFactory> fabricas = new HashMap<>();
	    
	    fabricas.put("Aluno Graduação", new AlunoGraduacaoFactory());
	    fabricas.put("Aluno Pós-Graduação", new AlunoPosFactory());
	    fabricas.put("Professor", new ProfessorFactory());

	    List<String[]> dadosUsuarios = List.of(
	        new String[]{"123", "Aluno Graduação", "João da Silva"},
	        new String[]{"456", "Aluno Pós-Graduação", "Luiz Fernando Rodrigues"},
	        new String[]{"789", "Aluno Graduação", "Pedro Paulo"},
	        new String[]{"100", "Professor", "Carlos Lucena"}
	    );

	    for (String[] dados : dadosUsuarios) {
	        int codigo = Integer.parseInt(dados[0]);
	        String tipo = dados[1];
	        String nome = dados[2];

	        IUsuarioFactory fabrica = fabricas.get(tipo);
	        if (fabrica != null) {
	            Usuario usuario = fabrica.criarUsuario(codigo, nome);
	            usuarios.add(usuario);
	        }
	    }
	}

	
	private void popularLivrosDadosTeste() {
		livros.add(new Livro(100, "Engenharia de Software", "Addison Wesley", "Ian Sommervile", 6, 2000));
		livros.add(new Livro(101, "UML - Guia do Usuário", "Campus", "Grady Booch, James Rumbaugh, Ivar Jacobson", 7, 2000));
		livros.add(new Livro(200, "Code Complete", "Microsoft Press", "Steve McConnel", 2, 2014));
		livros.add(new Livro(201, "Agile Software Development, Principles, Patterns and Practices", "Prentice Hall", "Robert Martin", 1, 2002));
		livros.add(new Livro(300, "Refactoring: Improving the Design of existing Code", "Addison Wesley Professional", "Martin Fowler", 1, 1999));
		livros.add(new Livro(301, "Software Metrics: A rigorous and Practical Approach", "CRC Press", "Norman Fenton, James Bieman", 3, 2014));
		livros.add(new Livro(400, "Design Patterns: Element of Reusable Object-Oriented Software", "Addison Wesley Professional" , "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", 1, 1994));
		livros.add(new Livro(401, "UML Distilled: A Brief Guide to the Standard Object Modeling Language", "Addison Wesley Professional", "Martin Fowler", 3, 2003));
	}
	
	

    private void popularExemplares() {
        buscarLivroPorCodigo(100).adicionarExemplar(new Exemplar(1));
        buscarLivroPorCodigo(100).adicionarExemplar(new Exemplar(2));
        buscarLivroPorCodigo(101).adicionarExemplar(new Exemplar(3));
        buscarLivroPorCodigo(200).adicionarExemplar(new Exemplar(4));
        buscarLivroPorCodigo(201).adicionarExemplar(new Exemplar(5));
        buscarLivroPorCodigo(300).adicionarExemplar(new Exemplar(6));
        buscarLivroPorCodigo(300).adicionarExemplar(new Exemplar(7));
        buscarLivroPorCodigo(400).adicionarExemplar(new Exemplar(8));
        buscarLivroPorCodigo(400).adicionarExemplar(new Exemplar(9));
    }

	
	
	public Usuario buscarUsuarioPorCodigo(int idUsuario) {
	    for (Usuario u : usuarios) {
	        if (u.getCodigo() == idUsuario) {
	            return u;
	        }
	    }
	    return null;
	}

	
	public Livro buscarLivroPorCodigo(int idLivro) {
	    for (Livro l : livros) {
	        if (l.getCodigo() == idLivro) {
	            return l;
	        }
	    }
	    return null;
	}
}



