package com.example.demo.controler;

import com.example.demo.model.Autor;
import com.example.demo.repository.AutorRepository;
import com.example.demo.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorControler {

    @Autowired
    private AutorService autorService;

    @GetMapping()
    public List<Autor> listarAutorFiltro(@RequestParam(required = false) String nome){
        return autorService.buscaAutorNome(nome);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void adicionarAutor(@RequestBody Autor autor){
        autorService.adicionaAutor(autor);
    }
}
