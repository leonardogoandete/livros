package com.example.demo.repository;

import com.example.demo.model.Editora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Integer> {
    public List<Editora> findBynomeContaining(String nome);
}
