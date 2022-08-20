package br.com.fiap.springbootcartao.repository;

import br.com.fiap.springbootcartao.models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer> {

}
