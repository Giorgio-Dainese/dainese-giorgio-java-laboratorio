package com.biglietteria.model;

import lombok.*;

import java.io.Serializable;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Biglietteria implements Serializable {
    private String codiceBiglietteria;
    private String indirizzo;
    private String nomeBiglietteria;
}
