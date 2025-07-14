package main;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sistema Biblioteca");
        System.out.println("Comandos: emp, dev, res, obs, liv, usu, ntf, sai");
        while (true) {
            System.out.print("# ");
            String linha = sc.nextLine();
            if (linha.equals("sai")) break;
            InterpretadorComandos.executar(linha);
        }
        sc.close();
    }
} 
