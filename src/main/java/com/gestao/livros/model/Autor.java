package com.gestao.livros.model;

import java.io.Serializable;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="Autores")
public class Autor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    @Column(nullable = false)
    private String primeiroNome;
    @Column(nullable = false)
    private String ultimoNome;

}
