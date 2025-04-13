package com.api.big_chat_brasil.dtos;

import com.api.big_chat_brasil.enums.DocumentType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class AuthResponse {
    private final String token;
    private final ClientResponse documentType;
}
