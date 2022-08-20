package br.com.fiap.springbootcartao.controller;

import br.com.fiap.springbootcartao.models.Card;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/card")
public class CardController {

    @GetMapping()
    public List<Card> getCard() {

    }
}
