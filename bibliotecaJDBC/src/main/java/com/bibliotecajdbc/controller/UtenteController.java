package com.bibliotecajdbc.controller;

import com.bibliotecajdbc.model.Libro;
import com.bibliotecajdbc.model.Utente;
import com.bibliotecajdbc.repository.LibroRepository;
import com.bibliotecajdbc.repository.UtenteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "utente")
public class UtenteController {

    @PostMapping(value = "/insertUtente")
    public static Utente insertUtente(@RequestBody Utente utente){
        return UtenteRepository.insertUtente(utente);

        //Come si mandano i parametri con @Requestbody tramite URL nelle richieste post? Si passa un json.
    }

}