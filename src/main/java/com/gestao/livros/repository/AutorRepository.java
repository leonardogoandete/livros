package com.gestao.livros.repository;

import com.gestao.livros.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {

    public List<Autor> findByprimeiroNomeContaining(String nome);
}
