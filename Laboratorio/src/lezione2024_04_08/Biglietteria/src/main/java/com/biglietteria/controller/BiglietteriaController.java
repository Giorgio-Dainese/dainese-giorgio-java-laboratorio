package com.biglietteria.controller;

import com.biglietteria.model.Biglietteria;
import com.biglietteria.repository.BiglietteriaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("biglietteria/")
public class BiglietteriaController {

    @GetMapping(value = "selezionaTuttoBiglietteria")
    public static List<Biglietteria> selezionaTutteBiglietterie(){
        return BiglietteriaRepository.selezionaBiglietterie();
    }

}

