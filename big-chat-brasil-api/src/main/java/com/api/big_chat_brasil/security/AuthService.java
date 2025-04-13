package com.api.big_chat_brasil.security;


import com.api.big_chat_brasil.dtos.AuthRequest;
import com.api.big_chat_brasil.dtos.AuthResponse;
import com.api.big_chat_brasil.dtos.ClientResponse;
import com.api.big_chat_brasil.entites.Client;
import com.api.big_chat_brasil.repositores.ClientRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class AuthService {

    private final ClientRepository clientRepository;
    private final JwtToken jwtService;

    public AuthService(ClientRepository clientRepository, JwtToken jwtService) {
        this.clientRepository = clientRepository;
        this.jwtService = jwtService;
    }

    public AuthResponse login(AuthRequest request) {
        Client client = clientRepository.findByDocumentId(request.getDocumentId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado"));

        String token = jwtService.generateToken(client.getId());

        return new AuthResponse(
                token,
                new ClientResponse(
                        client.getId(),
                        client.getName(),
                        client.getDocumentId(),
                        client.getDocumentType(),
                        client.getBalance(),
                        client.getLimitAmount(),
                        client.getPlanType(),
                        client.isActive()
                )
        );
    }


}
