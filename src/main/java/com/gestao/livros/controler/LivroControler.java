package com.example.demo.controler;

import com.example.demo.model.Livro;
import com.example.demo.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroControler {

    @Autowired
    private LivroService livroService;

    @GetMapping()
    public List<Livro> listarLivrosFiltro(@RequestParam(required = false) String nome){
        return livroService.buscaLivrosNome(nome);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void adicionarLivro(@RequestBody Livro livro){
        livroService.adicionarLivro(livro);
    }
}
