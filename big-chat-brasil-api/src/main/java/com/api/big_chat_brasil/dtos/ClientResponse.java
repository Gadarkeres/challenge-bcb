package com.api.big_chat_brasil.dtos;

import com.api.big_chat_brasil.enums.DocumentType;
import com.api.big_chat_brasil.enums.PlanType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@RequiredArgsConstructor
public class ClientResponse {
    private final String id;
    private final String name;
    private final String documentId;
    private final DocumentType documentType;
    private final BigDecimal balance;
    private final BigDecimal limit;
    private final PlanType planType;
    private final boolean active;


}
