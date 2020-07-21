# Shopy-API

Este projeto é uma API [Spring Boot](http://projects.spring.io/spring-boot/) desenvolvida para servir como e-commerce.

## Diagrama de Classes


![Alt text](https://user-images.githubusercontent.com/28203278/83186379-d42dcf80-a102-11ea-8d44-cc34ab39b514.png)


## Requisitos da Máquina

Para rodar a aplicação você irá precisar de:

*   [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java™ Platform, Standard Edition Development Kit 
*   [Maven 3](https://maven.apache.org) - Gerenciador de Dependências
*   [Spring Boot](https://spring.io/projects/spring-boot) - Framework para facilitar o bootstrapping and desenvolvimento de novas aplicações Spring 
*   [MySQL](https://www.mysql.com/) - Sistema de Gerenciamento de Banco de Dados Relacional Open-Source 
*   [Git](https://git-scm.com/) - Sistema de Controle de Versão


## Ferramentas Externas Utilizadas

* [Postman](https://www.getpostman.com/) - API Development Environment (Testing Documentation)
* [Thymeleaf](https://www.thymeleaf.org/) - Server-side Java template engine (Template dos e-mails)


## Rodando a Aplicação Localmente

Primeiro renomeie o arquivo `ApplicationExample.properties` em `shopy/src/main/resources/`  para `applicatioin.properties` e preencha-o com os dados necessários correspondentes às configurações da sua máquina. 

Há diversos caminhos para rodar uma aplicação com Spring Boot na sua máquina local. Um deles é executar o método `main` na classe `shopy/src/main/java/com/anaclara/shopy` da sua IDE. Para tal sga os passos abaixo:
1. Faça o Download do zip do projeto ou clone o repositório Git
2. Extraia o conteúdo do zip
3. Abra o Command Prompt e navegue ($cd) até a pasta contendo o pom.xml
4. Abra o eclipse
5. Vá em: File -> Import -> Existing Maven Project -> Navegue até a pasta onde você extraiu o zip
6. Selecione o projeto
6.5. [Opcional] selecione em qual ambiente você deseja rodar a aplicação em application.properties: test, dev ou prod. A melhor opção para um primeiro contato seria test.
7. Escolha o arqquivo Spring Boot Application (procure por @SpringBootApplication)
8. Clique com o direito no arquivo e faça Run as Java Application

Uma alternativa é utilizar o [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) com o comando:

```shell
mvn spring-boot:run
```

### Segurança

No pom.xml é possível verificar as dependências externas utilizadas para adicionar funcionalidades de segurança ao projeto: 

```
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>

		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt</artifactId>
			<version>0.7.0</version>
		</dependency>
```
A classe de configuração `SecurityConfig` é usada para definir as configurações de segurança. Esta classe necessariamente herda de `WebSecurityConfigurerAdapter` para cumprir com os padrões da biblioteca.
Todas as senhas de usuários são guardadas no banco de dados encodadas (Veja BCypts)
Para utilizar o framework Spring Security é necessário criar a classe de usuário conforme o contrato do framework, implementar a interface `UserDetails` e o serviço descrito pela interface `UserdetailsService`. 



### URLs

|  URL |  Método | Descrição |
|----------|--------------|--------------|



## Arquivos e Diretórios

O projeto tem uma estrutura de diretórios particular. Uma árvore representativa é mostrada a seguir:

```
.
├── shopy-api
├── src
│   └── main
│       └── java
│            └── com.anaclara.shopy
│                   ├── ShopyApiApplication.java
│                   ├── config
│                   ├── domain
│                   ├── dto
│                   ├── repository
│                   ├── resources
│                   ├── security
│                   └── services
│             
├── src
│   └── main
│       └── resources
├── src
│   └── test
│       └── java
├── JRE System Library
├── Maven Dependencies
├── src
├── target
│   └──application-0.0.1-SNAPSHOT
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Pacotes & Arquivos

- `config` — classes de configuração da aplicação
- `domain` — classes para representar entidades modeladas
- `dto` — Data Transfer Object/classes que lidam com a comunicação com o banco de dados
- `repository` — classes que lidam com a comunicação com o banco de dados
- `services` — classes para lidar com as regras de negócio
- `security` — configurações de segurança da aplicação
- `resource` — classes para ouvir/direcionar as requisições doc cliente
- `resources/application.properties` — O Spring lê as propriedades definidas neste arquivo para configurar sua aplicação. Neste arquivo você pode definir a porta padrão do servidor, o context path do servidor, os URLs do banco de dados etc., neste arquivo
- `pom.xml` - contém todas as dependências do projeto e suas respectivas configurações


## Cliente

Como projeto complementar a este foi desenvolvido uma aplicação cliente com Angular que interage com esta aplicação. Verifique o repósitório [shopy-ui](https://github.com/AnaKlara/shopy-ui) no Github.

Qualquer dúvida e/ou feedback escreva um e-mail para claracorreadasilva@gmail.com
