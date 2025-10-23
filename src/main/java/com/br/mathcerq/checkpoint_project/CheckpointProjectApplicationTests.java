package com.br.mathcerq.checkpoint_project;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.junit.jupiter.api.Test;

// Removemos @ActiveProfiles para deixar o Spring carregar o arquivo em src/test/resources
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT) 
class CheckpointProjectApplicationTests {

    @Test
    void contextLoads() {
        // Teste de contexto
    }
}