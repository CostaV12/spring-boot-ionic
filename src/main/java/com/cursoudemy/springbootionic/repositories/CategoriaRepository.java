package com.cursoudemy.springbootionic.repositories;

import com.cursoudemy.springbootionic.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {}
