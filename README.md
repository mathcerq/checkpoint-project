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

Passo 1: Subir o banco PostgreSQL
docker run --name checkpoint-db -e POSTGRES_USER=user -e POSTGRES_PASSWORD=password -e POSTGRES_DB=mydatabase -p 5432:5432 -d postgres:15-alpine

Passo 2: Rodar a API usando a imagem publicada
docker run --name checkpoint-api --link checkpoint-db:postgres-db \
  -e SPRING_DATASOURCE_URL=jdbc:postgresql://postgres-db:5432/mydatabase \
  -e SPRING_DATASOURCE_USERNAME=user \
  -e SPRING_DATASOURCE_PASSWORD=password \
  -p 8080:8080 mdasilvacerq/checkpoint-project:latest

  A API estará rodando em:
👉 http://localhost:8080

## 3. Acesso à Documentação (Swagger)

A documentação interativa da API (Swagger UI) pode ser acessada no seguinte endpoint:

**`http://localhost:8080/swagger-ui.html`**

## 4. Links do Projeto

GitHub: https://github.com/mdasilvacerq/checkpoint-project

Docker Hub: https://hub.docker.com/r/mdasilvacerq/checkpoint-project
