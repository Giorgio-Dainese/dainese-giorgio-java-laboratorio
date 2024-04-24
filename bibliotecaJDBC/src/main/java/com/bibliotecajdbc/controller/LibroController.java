package com.bibliotecajdbc.controller;

import com.bibliotecajdbc.model.Libro;
import com.bibliotecajdbc.repository.LibroRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
