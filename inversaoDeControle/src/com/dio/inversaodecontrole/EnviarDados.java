package com.dio.inversaodecontrole;

public class EnviarDados {

    public EnviarDados(String tipo, String endereco, String nome) {

    }

    public static EnviarDados obterDadosEmail() {
        return new EnviarDados("projecto", "dio@gmail.com", "Hélder Costa");
    }

    public void retornar(String mensagem) {
        System.out.println("Dado enviado!");
    }
}
