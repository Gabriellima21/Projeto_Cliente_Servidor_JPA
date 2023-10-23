package br.com.unicsul.ads.repository;

import br.com.unicsul.ads.entity.Exercicio; 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExercicioRepository extends JpaRepository<Exercicio,Integer> {
}
