# Projeto de Consulta de CEP com Spring Boot

Este é um projeto de exemplo que demonstra como fazer uma requisição de CEP usando a API do ViaCEP em uma aplicação Spring Boot.

## Descrição

O projeto consiste em uma aplicação Spring Boot que expõe um endpoint REST para consultar informações de um CEP específico. A aplicação faz uma requisição à API do ViaCEP para obter os dados do CEP e retorna essas informações em formato JSON.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.3.8**
- **Spring WebFlux** (para chamadas HTTP reativas)
- **Spring Web** (para expor endpoints REST)
- **Jackson** (para manipulação de JSON)
- **Spring Boot Starter Test** (para testes)


## Como Executar o Projeto

### Pré-requisitos

- Java 17 instalado
- Maven instalado
- IDE de sua preferência (IntelliJ IDEA, Eclipse, etc.)

### Passos para Execução

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/mariaoliveira27/ceprequest
2. **Navegue até o diretório do projeto:**

   ```bash
   cd ceprequest
3. **Compile o projeto:**

   ```bash
   mvn clean install
4. **Execute a aplicação:**

   ```bash
   mvn spring-boot:run

A aplicação estará disponível em http://localhost:8080.
