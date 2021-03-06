package com.gestao.livros.service;

import com.gestao.livros.model.Autor;
import com.gestao.livros.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepo;

    public void adicionaAutor(Autor autor){
        autorRepo.save(autor);
    }

    public List<Autor> buscaAutorNome(String nome){
        return (nome != null) ? autorRepo.findByprimeiroNomeContaining(nome) : autorRepo.findAll();
    }

    public void apagaAutor(int id){
        autorRepo.deleteById(id);
    }
}
