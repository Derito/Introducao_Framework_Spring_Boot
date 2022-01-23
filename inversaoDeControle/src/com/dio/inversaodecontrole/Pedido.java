package com.dio.inversaodecontrole;

public class Pedido {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.gravar();
    }
    //Inversao de controle
    private final EnviarDados enviar =  EnviarDados.obterDadosEmail();

    public  void gravar(){
      // this.enviar = new EnviarDados("projecto","dio@gmail.com","nome"); inserido na classe EnviarDados
        this.enviar.retornar("Pedido criado!");
    }
}
