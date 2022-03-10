package io.github.diegodev.domain.model;

import javax.persistence.*;

@Entity
public class Cliente{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(length = 100)
    private String nome;

    public Cliente(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
