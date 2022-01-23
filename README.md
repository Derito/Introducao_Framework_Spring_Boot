# Alguns Comandos usados no Spring Boot

# Comandos
1. mvn spring-boot:run - ***Roda o projecto na IDE***
2. http://localhost:8080  - ***Visualizar o projecto no browser***
## Rodar o debug
1. Inserir no application.properties o comando ***debug=true***
## Gerar um arquivo jar ou war
1. mvn clean package - ***Roda o projecto criando um arquivo jar ou war***
## Rodar o jar
1. java -jar target/projecto.jar - ***Roda o projecto***
## Mostrar todo o conteúdo do jar 
1. jar tf projecto.jar | less - ***Recomendo usar sem o pipeline e o less no JDK 11***
## Fazer o build do projecto
1. mvn clean install
## Mova o projecto war para o tomcat na pasta webapps para rodar
1. mv target/projecto.war ../apache-tomcat-9.0.56/webapps
2. cd apache-tomcat-9.0.56 - ***Entrar na pasta do tomcat***
## Iniciar o projecto war
1. bash apache-tomcat-9.0.56/bin/start.sh ou
2. .satartup.sh // inicia o projecto.war
## Browser para Visualizar
1. localhost:8080/projecto

# Spring Boot Profiles

## Usando o properties
... em dev ... e ... em prod ...
Para desenvolvimento e para produção
usando @Configuration
## Comandos na linha de comando Spring Boot
Os comandos redeferidos tem prioridade em relação ao existente no application.properties
mvn spring-boot:run -Dserver.port=8085
## Variaveis de ambiente
injecção com a anotação  @Value({NOME_VARIAVEL})
default quando não se passa variavel
na classe AppController
# SWAGGER2 - Documentando a API
## Dependências
1. Busque as dependências no site https://mvnrepository.com 
```
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.9.2</version>
</dependency>

<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.9.2</version>
</dependency>
```

## Configuração
1. Criar class SwaggerConfig
2. Anotar com @Configuration e @EnableSwagger2
3. inserir os metodos
```
@Bean
public Docket api(){
return new Docket(DocumentationType.SWAGGER_2)
.select()
.apis(RequestHandlerSelectors.basePackage("com.helder.gestaoalunos.controller"))
.paths(PathSelectors.any())
.build()
.apiInfo(builApiInfo());
}
private ApiInfo constroiApiInfo(){
    return new ApiInfoBuilder()
        .title("API Gestão Alunos")
        .description("Rest API Gestão de Alunos Configurando do Swagger")
        .version("0.0.1")
        .contact(new Contact("Helder","github/",null))
        .buid();
}
```
3. Rodar a aplicação
4. Abrir o browser para visualizar
localhost:8080/swagger-ui.html
