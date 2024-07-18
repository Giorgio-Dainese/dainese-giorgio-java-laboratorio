package com.bibliotecajdbc.controller;

import com.bibliotecajdbc.constants.DBConfig;
import com.bibliotecajdbc.model.Libro;
import com.bibliotecajdbc.model.Utente;
import com.bibliotecajdbc.repository.LibroRepository;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "libro")
public class LibroController {

    @GetMapping(value = "/selectAllLibri")
    public static List<Libro> selectLibri(){
        return LibroRepository.selezionaTuttiLibri();
    }

    @GetMapping(value = "/selectGenereLibri")
    public static List<Libro> selectGenereLibri(@RequestParam(value="genere") String genere){
        return LibroRepository.selezionaGenereLibri(genere);
    }

    @PostMapping(value="/insertLibro")
    public static Libro inserisciLibro(@RequestBody Libro libro){
        return LibroRepository.insertLibro(libro);
    }

}
