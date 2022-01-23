package com.digitalinovationone.utilizandobeans;

import com.digitalinovationone.utilizandobeans.model.Autor;
import com.digitalinovationone.utilizandobeans.model.AutorLivro;
import com.digitalinovationone.utilizandobeans.model.Livro;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean // o mesmo que <bean id="livro" class="com.springbeans.Livro"/> em xml
    public  Livro getLivro(){
        return new Livro();
    }

    @Bean
    public AutorLivro getAutorLivro(){
        return new Autor();
    }
}
