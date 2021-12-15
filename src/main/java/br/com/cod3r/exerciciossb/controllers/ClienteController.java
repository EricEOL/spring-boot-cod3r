package br.com.cod3r.exerciciossb.controllers;

import br.com.cod3r.exerciciossb.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping("/qualquer")
    public Cliente obterCliente() {
        return new Cliente(10, "Eric", "12345677899");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id) {
        return new Cliente(id, "Thamiris", "92318932918");
    }
}
