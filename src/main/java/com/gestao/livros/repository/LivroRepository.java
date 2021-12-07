package com.gestao.livros.repository;


import com.gestao.livros.model.Editora;
import com.gestao.livros.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {
    public List<Livro> findBytituloContaining(String nome);
}
