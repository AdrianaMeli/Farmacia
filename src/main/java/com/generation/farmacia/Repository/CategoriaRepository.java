package com.generation.farmacia.Repository;


import com.generation.farmacia.Model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    public List<Categoria> findAllByCategoriaContainingIgnoreCase(@Param("tipo") String tipo);

}
