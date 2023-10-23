package br.com.unicsul.ads;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(name = "rotaPadrao")
    public String padrao() {
        return "index";
    }

    @Bean(name = "rotaApresentacao")
    public String apresentacao() {
        return "apresentacao";
    }

    @Bean(name = "rotaExec")
    public String exercicio() {
        return "exec";
    }

    @Bean(name = "rotaSupino")
    public String supino() {
        return "supino";
    }
}
