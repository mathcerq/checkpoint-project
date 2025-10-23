package com.br.mathcerq.checkpoint_project;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles; // Reativar este
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.junit.jupiter.api.Test;

// Forçamos o uso das configurações de teste
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test") 
class CheckpointProjectApplicationTests {

    @Test
    void contextLoads() {
        // Teste de contexto
    }
}