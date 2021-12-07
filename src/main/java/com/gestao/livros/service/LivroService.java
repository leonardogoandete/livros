package com.gestao.livros.service;

import com.gestao.livros.model.Livro;
import com.gestao.livros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepo;

    public void adicionarLivro(Livro livro){
        livroRepo.save(livro);
    }

    public List<Livro> buscaLivrosNome(String nome){
        return (nome != null) ? livroRepo.findBytituloContaining(nome) : livroRepo.findAll();
    }
}
