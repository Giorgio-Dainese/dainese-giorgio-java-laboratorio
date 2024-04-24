package com.bibliotecajdbc.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Utente implements Serializable {
    private String codiceUtente;
    private String nome;
    private String cognome;
}
