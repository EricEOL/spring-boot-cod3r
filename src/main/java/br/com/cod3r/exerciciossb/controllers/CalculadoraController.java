package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    // /calculadora/somar/10/20 retornar a soma
    @GetMapping("/somar/{a}/{b}")
    public double somar(@PathVariable double a, @PathVariable double b) {
        return a + b;
    }

    // /calculadora/subtrair?a=10&b=20 retornar a subtracao
    @GetMapping("/subtrair")
    public double subtrair(@RequestParam(name = "a") double a, @RequestParam(name = "b") double b) {
        return a - b;
    }

}
