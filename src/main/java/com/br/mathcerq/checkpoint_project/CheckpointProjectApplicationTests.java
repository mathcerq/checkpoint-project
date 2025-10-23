package com.br.mathcerq.checkpoint_project; // Use o nome exato do seu pacote!

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.junit.jupiter.api.Test;

// As anotações ativam o perfil 'test', que usa o H2 e ignora o PostgreSQL
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test") 
class CheckpointProjectApplicationTests {

    @Test
    void contextLoads() {
        // Este é um teste básico que apenas verifica se a aplicação consegue iniciar.
    }
}