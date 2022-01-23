package com.dio.usandofeign2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "agenda",url="http://localhost:8080/contacto")
public interface ConsumindoApi {

    @RequestMapping(method = RequestMethod.GET, value="/")
    Contacto retornarContacto();
}
