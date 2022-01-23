package com.dio.injecaodependencia;

import org.springframework.beans.factory.annotation.Autowired;

public class Tratador {
    public static void main(String[] args) {

        Tratador tratador = new Tratador(new Cachorro());
        tratador.automovel();

    }
    @Autowired //injecção de dependencia
    private Animal animal;

    public Tratador(Animal obj){
        this.animal=obj;
    }
    public void automovel(){
        animal.acao();
    }
}
