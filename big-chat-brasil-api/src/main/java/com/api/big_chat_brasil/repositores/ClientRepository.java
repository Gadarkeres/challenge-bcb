package com.api.big_chat_brasil.repositores;

import com.api.big_chat_brasil.entites.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, String> {
    Optional<Client> findByDocumentId(String documentId);
}
