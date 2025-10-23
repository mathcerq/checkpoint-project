package com.br.mathcerq.checkpoint_project;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource; // Novo Import
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.junit.jupiter.api.Test;

// Injetamos a URL do H2 diretamente no teste, forçando o uso do banco em memória.
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT) 
@TestPropertySource(properties = {
    "spring.datasource.url=jdbc:h2:mem:testdb",
    "spring.datasource.driver-class-name=org.h2.Driver"
})
class CheckpointProjectApplicationTests {

    @Test
    void contextLoads() {
        // Teste de contexto
    }
}