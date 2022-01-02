package br.com.cod3r.exerciciossb.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.cod3r.exerciciossb.model.entities.Produto;

@Repository
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{
	
}
