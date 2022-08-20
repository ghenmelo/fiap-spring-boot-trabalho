package br.com.fiap.springbootcartao.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Card")
public class Card {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private BigInteger cardNumber;

    private String cardName;

    private LocalDateTime cardCreatedAt;

    private LocalDateTime cardLastModified;

    private BigDecimal cardBalance;

    private String cardPassword;
}
