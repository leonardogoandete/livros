package com.example.demo.repository;

import com.example.demo.model.Editora;
import com.example.demo.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {
    public List<Livro> findBytituloContaining(String nome);
}
