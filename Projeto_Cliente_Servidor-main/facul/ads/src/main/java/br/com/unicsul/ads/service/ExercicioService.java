package br.com.unicsul.ads.service;

import br.com.unicsul.ads.entity.Exercicio;
import br.com.unicsul.ads.exception.ExercicioException;
import br.com.unicsul.ads.repository.ExercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExercicioService {
    protected static final String MENSAGEM_ID_EXERCICIO_NAO_INFORMADO = "ID do exercicio não informado.";
    protected static final String MENSAGEM_NOME_EXERCICIO_NAO_INFORMADO = "Nome do exercicio não informado.";
    protected static final String MENSAGEM_CATEGORIA_EXERCICIO_NAO_INFORMADA = "A categoria do exercicio mão foi informada.";
    protected static final String MENSAGEM_DESCRICAO_EXERCICIO_NAO_INFORMADA = "A descrição do exercicio mão foi informada.";
    protected static final String MENSAGEM_EXRCICIO__NULL = "Exercicio mão foi informadi.";

    @Autowired(required = false)
    ExercicioRepository exercicioRepository;

    public Exercicio criar (Exercicio e){
        if(e.getNome() == null || e.getNome().isBlank()) {
            throw new ExercicioException(MENSAGEM_NOME_EXERCICIO_NAO_INFORMADO);
        } else if (e.getCategoria() == null || e.getCategoria().isBlank()) {
            throw new ExercicioException(MENSAGEM_CATEGORIA_EXERCICIO_NAO_INFORMADA);
        }else if(e.getDescricao() == null || e.getDescricao().isBlank()){
            throw new ExercicioException(MENSAGEM_DESCRICAO_EXERCICIO_NAO_INFORMADA);
        }
        return exercicioRepository.save(e);
    }
}
