package com.example.demo.controler;

import com.example.demo.model.Autor;
import com.example.demo.model.Editora;
import com.example.demo.service.EditoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editoras")
public class EditoraControler {

    @Autowired
    private EditoraService editoraService;

    @GetMapping()
    public List<Editora> listarEditorasFiltro(@RequestParam(required = false) String nome){
        return editoraService.buscaEditoraNome(nome);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void adicionarEditora(@RequestBody Editora editora){
        editoraService.adicionaEditora(editora);
    }
}
