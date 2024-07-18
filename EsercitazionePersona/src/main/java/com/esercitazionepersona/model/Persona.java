package com.esercitazionepersona.model;


import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Persona implements Serializable {
    private String email;
    private String nome;
    private String cognome;
}
