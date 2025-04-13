package com.api.big_chat_brasil.entites;

import com.api.big_chat_brasil.enums.PlanType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import org.w3c.dom.DocumentType;

import java.math.BigDecimal;

@Entity
public class Client {
    @Id
    private String id;
    private String name;
    private String documentId;
    @Enumerated(EnumType.STRING)
    private DocumentType documentType;
    private BigDecimal balance;
    private BigDecimal limit;
    @Enumerated(EnumType.STRING)
    private PlanType planType;
    private boolean active;
}
