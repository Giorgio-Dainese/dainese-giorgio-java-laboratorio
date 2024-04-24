package com.bibliotecajdbc.model;

import lombok.*;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Libro implements Serializable{
    private String codiceIsbn;
    private String titolo;
    private String genere;
    private String annoPubblicazione;
    private String autore;
}
