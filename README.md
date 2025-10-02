# 🚀 checkpoint-project | API de Produtos (Spring Boot + PostgreSQL)

Este projeto é uma aplicação Java Spring Boot com acesso a banco de dados PostgreSQL, empacotada e orquestrada via Docker.

## 1. Execução a partir do Docker Compose (Recomendado)

Instruções para iniciar a API e o Banco de Dados juntos (docker-compose up).

1.  Clone este repositório.
2.  Certifique-se de ter o Docker e Docker Compose instalados.
3.  Na raiz do projeto, execute o comando para iniciar os serviços:
    ```bash
    docker-compose up
    ```
4.  A API estará rodando em `http://localhost:8080`.

## 2. Execução a partir da Imagem Publicada no Docker Hub

Instruções para iniciar a API usando a imagem já publicada (docker run).

Este método exige que você inicie um container de banco de dados PostgreSQL separadamente ou que ele já esteja rodando.

1.  Puxe e execute a imagem do Docker Hub:
    ```bash
    docker run -d -p 8080:8080 \
      -e SPRING_DATASOURCE_URL=jdbc:postgresql://<IP_DO_SEU_BANCO>:5432/mydatabase \
      -e SPRING_DATASOURCE_USERNAME=user \
      -e SPRING_DATASOURCE_PASSWORD=password \
      mdasilvacerq/checkpoint-project:latest
    ```
    **Nota:** Substitua `<IP_DO_SEU_BANCO>` pelo endereço do seu servidor PostgreSQL.

## 3. Acesso à Documentação (Swagger)

A documentação interativa da API (Swagger UI) pode ser acessada no seguinte endpoint:

**`http://localhost:8080/swagger-ui.html`**