package com.example.demo.modo;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private String fotocCliente;



}
