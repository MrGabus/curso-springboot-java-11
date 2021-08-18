# 
<h1 align="center">
    <a href="https://spring.io/projects/spring-boot/">Código do Curso Spring Boot Java 11</a>
</h1>
<p align="center">Código criado para back-end.</p>

<img src="https://img.shields.io/badge/Java-Curso%20Java-red" />


### Informações

- [x] Implementação de busca e inserção de Usuarios.
- [x] Implementação de busca e inserção de Produtos.
- [x] Implementação de busca e inserção de Categorias.
- [x] Implementação de busca e inserção de Vendas.

### ⚒️ Biblioteca

Utilizado PostgreSQL como bando de dados. <br>
//Caso queira mudar o DB, olhar em /curso/src/main/resources no application-dev.properties.<br>
//

### Sobre

👉 Este cídog foi criado para estudo, nescessario somente com um banco de dados para criar os schemas.

### Para testes.

Usar postman.

Exp:
Busca de usuário: GET https://curso-java-sboot.herokuapp.com/users 

Inserir usuário: POST https://curso-java-sboot.herokuapp.com/users

{
"name": "Lucas Delta", 
"email": "lucas@gmail.com", 
"password": "123456",
"phone": "977557755"
} 
    
