package com.digitalinovationone.utilizandobeans.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Livro {

    private String nome;
    private String codigo;

    public String getNome() {
        return nome;
    }
    @Autowired
    AutorLivro autorLivro;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public AutorLivro getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(AutorLivro autorLivro) {
        this.autorLivro = autorLivro;
    }

    public void exibir(){
        System.out.println(this.nome +"-"+ this.codigo);
        autorLivro.exibirAutor();

    }
}
