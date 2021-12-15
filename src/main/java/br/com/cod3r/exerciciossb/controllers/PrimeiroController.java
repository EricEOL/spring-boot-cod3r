package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class PrimeiroController {

    //@RequestMapping(method = RequestMethod.GET, path = "/ola")
    @GetMapping("/ola")
    public String ola() {
        return "Olá Spring Boot!";
    }
}
