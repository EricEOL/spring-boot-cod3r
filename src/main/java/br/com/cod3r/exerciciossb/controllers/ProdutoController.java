package br.com.cod3r.exerciciossb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import br.com.cod3r.exerciciossb.model.repositories.ProdutoRepository;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@PostMapping
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}

	@GetMapping
	public Iterable<Produto> obterProdutos() {
		 return produtoRepository.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
		Optional<Produto> produto = produtoRepository.findById(id);
		return produto;
	}

	@PutMapping
	public Produto alterarProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}
}
