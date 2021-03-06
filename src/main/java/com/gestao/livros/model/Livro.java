package com.gestao.livros.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Data
@Entity
public class Livro implements Serializable {
    @Id
    @GeneratedValue
    private int codigo;

    @Column(nullable = false, unique = true)
    private String titulo;

    @Column(nullable = false)
    private int ano;

    @ManyToOne()
    private Editora editora;

    @ManyToMany
    private Collection<Autor> autores;

}
