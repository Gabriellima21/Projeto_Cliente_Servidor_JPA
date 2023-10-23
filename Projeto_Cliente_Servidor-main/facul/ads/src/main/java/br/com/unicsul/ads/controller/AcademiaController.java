package br.com.unicsul.ads.controller;

import br.com.unicsul.ads.service.AcademiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AcademiaController {

    @Autowired
    @Qualifier("rotaPadrao")
    private String rotaPadrao;

    @Autowired
    @Qualifier("rotaApresentacao")
    private String rotaApresentacao;

    @Autowired
    @Qualifier("rotaExec")
    private String rotaExec;

    @Autowired
    @Qualifier("rotaSupino")
    private String rotaSupino;

    @Autowired
    AcademiaService academiaService;

   @GetMapping
    public String rotaIndex(){
       return rotaPadrao;
    }

    @GetMapping("/apresentacao")
    public String rotaApresentacao(){return rotaApresentacao;}

    @GetMapping ("/exercicio")
    public String rotaExercicio(){
       return rotaExec;
    }

    @GetMapping ("/exercicio/{id}")
    public String rotaExercicioComParametro(@PathVariable("id") Integer id) {
        return academiaService.rotaExercicioComParametro(id);
    }
}
