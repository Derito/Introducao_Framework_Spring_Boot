package com.dio.usandofeign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contacto")
public class AgendaController {

    @GetMapping
    public Contacto retornarContacto() {
        return Contacto.builder()
                .id(1L)
                .nome("Helder")
                .telefone("923 345 678")
                .build();
    }
}
