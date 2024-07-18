package com.esercitazionepersona.controller;

import com.esercitazionepersona.model.Persona;
import com.esercitazionepersona.repository.PersonaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/persona")
public class PersonaController {
    @GetMapping(value = "selezionaTuttePersone")
    public static List<Persona> selezionaPersone(){
        return PersonaRepository.selectAllPersona();
    }

    @PostMapping(value = "inserisciPersona")
    public static Persona inserisciPersona(@RequestBody Persona persona){
        return PersonaRepository.inserisciPersona(persona);
    }

    @PostMapping(value = "selezionePerEmail")
    public static Persona selezionaPerEmail(@RequestBody String email){
        return PersonaRepository.selezionaPerEmail(email);
    }
}
