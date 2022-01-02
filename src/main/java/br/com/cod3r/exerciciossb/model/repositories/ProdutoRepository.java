package br.com.cod3r.exerciciossb.model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.cod3r.exerciciossb.model.entities.Produto;

@Repository
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{

    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

    //Exemplo de criação de query com Spring boot
    @Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
    public Iterable<Produto> searchByNameLike(@Param("nome") String nome);

}
