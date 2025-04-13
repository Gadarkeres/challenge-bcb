package com.api.big_chat_brasil.dtos;

import com.api.big_chat_brasil.enums.DocumentType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class AuthRequest {
    private final String documentId;
    private final DocumentType documentType;
}
