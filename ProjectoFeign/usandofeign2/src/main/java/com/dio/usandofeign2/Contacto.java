package com.dio.usandofeign2;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Contacto {

    private Long id;
    private String nome;
    private String telefone;
}
