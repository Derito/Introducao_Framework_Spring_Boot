# Comandos SpringBoot
mvn spring-boot:run // Roda o projecto na ide
http://localhost:8080 //visualizar o projecto no browser
## Rodar debug
inserir no properties o comando debug=true
## Gerar jar ou war
mvn clean package // Roda o projecto criando um jar ou war
## Rodar o jar
java -jar target/projecto.jar //Roda o projecto
## Mostra todo o conteudo use sem o pipeline e o less
jar tf projecto.jar | less // 
## Faça o build do projecto
mvn clean install
## Mova o projecto war no tomcat na pasta webapps para rodar
mv target/projecto.war ../apache-tomcat-9.0.56/webapps

cd apache-tomcat-9.0.56 // entrar na pasta e rodar
## Iniciar o projecto war
bash apache-tomcat-9.0.56/bin/start.sh ou
.satartup.sh // inicia o projecto.war
## Browser 
localhost:8080/projecto

# Spring Boot Profiles
## Usando o properties

Para desenvolvimento e para produção
usando @Configuration