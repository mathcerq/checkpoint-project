# Estágio de Build (Usa o Maven para compilar e gerar o JAR)
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
# Copia o pom.xml para o container para resolver as dependências
COPY pom.xml .
RUN mvn dependency:go-offline
# Copia o código-fonte
COPY src ./src
# Compila o projeto e gera o JAR final
RUN mvn clean package -DskipTests

# Estágio de Execução (Usa uma imagem Java JRE mais leve para rodar o JAR)
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# Copia o JAR gerado no estágio 'build'
COPY --from=build /app/target/*.jar app.jar
# Expõe a porta que o Spring Boot usa
EXPOSE 8080
# Comando para rodar a aplicação Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]