package main;

import java.util.HashMap;
import java.util.Map;

import controlador.comandos.ComandoDevolver;
import controlador.comandos.ComandoEmprestar;
import controlador.comandos.ComandoLivro;
import controlador.comandos.ComandoNotificacoes;
import controlador.comandos.ComandoObservar;
import controlador.comandos.ComandoReservar;
import controlador.comandos.ComandoUsuario;
import controlador.comandos.IComando;

public class InterpretadorComandos {
    private static final Map<String, IComando> comandos = new HashMap<>();
    static {
        comandos.put("emp", new ComandoEmprestar());
        comandos.put("dev", new ComandoDevolver());
        comandos.put("res", new ComandoReservar());
        comandos.put("obs", new ComandoObservar());
        comandos.put("liv", new ComandoLivro());
        comandos.put("usu", new ComandoUsuario());
        comandos.put("ntf", new ComandoNotificacoes());
    }

    public static void executar(String linha) {
        String[] partes = linha.split(" ");
        IComando cmd = comandos.get(partes[0]);
        if (cmd != null) cmd.executar(partes);
        else System.out.println("Comando inválido");
    }
}