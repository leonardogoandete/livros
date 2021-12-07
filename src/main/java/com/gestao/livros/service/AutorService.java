package com.example.demo.service;

import com.example.demo.model.Autor;
import com.example.demo.repository.AutorRepository;
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
}
