package com.games.Games.repository;

import com.games.Games.model.Categoria;
import com.games.Games.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    public List<Categoria> findByNomeContainingIgnoreCase(@Param("nomeProdutoRepository") String nome);
}
