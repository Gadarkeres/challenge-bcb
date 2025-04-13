package com.api.big_chat_brasil.entites;

import com.api.big_chat_brasil.enums.DocumentType;
import com.api.big_chat_brasil.enums.PlanType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Client {
    @Id
    private String id;
    private String name;
    @Column(unique = true, nullable = false)
    private String documentId;
    @Enumerated(EnumType.STRING)
    private DocumentType documentType;
    private BigDecimal balance;
    private BigDecimal limitAmount;
    @Enumerated(EnumType.STRING)
    private PlanType planType;
    private boolean active;
}
