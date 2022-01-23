package com.digitalinovationone.utilizandobeans.model;

import com.digitalinovationone.utilizandobeans.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        livro.setNome("O código");
        livro.setCodigo("f54h");

        Autor autor = factory.getBean(Autor.class);
        autor.setNomeAutor("Hélder");

        livro.exibir();

        ((AbstractApplicationContext)factory).close();
    }
}
