package br.com.unicsul.ads.controller;

import br.com.unicsul.ads.entity.Exercicio;
import br.com.unicsul.ads.service.ExercicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/exec")
public class ExercicioController {

    @Autowired
    ExercicioService exercicioService;

    @PostMapping
    public Exercicio criar (@RequestBody Exercicio e){
        return exercicioService.criar(e);
    }
}
