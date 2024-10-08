<h1 align="center"> Desafio plataforma DIO </h1>
<h2 align="center"> API REST na Nuvem Usando Spring Boot 3 java 23 </h2>

## Introdução
- O código que você criou implementa uma API REST básica usando Spring Boot, com as seguintes funcionalidades para gerenciar usuários.

## Funcionalidades
1- Usuario.java: É a classe de modelo que representa os dados de um usuário.

2- UsuarioRepository.java: É o repositório JPA que lida com as operações de banco de dados (CRUD) para os objetos do tipo Usuario.

3- UsuarioService.java: É a camada de serviço que encapsula a lógica de negócios, fornecendo métodos que chamam o repositório para realizar as operações no banco de dados.

## Funcionamento Completo
1- Recebimento de Requisição: Quando uma requisição HTTP chega, o controller (não incluído nesse código) chamaria o UsuarioService.

2- Processamento no Serviço: O serviço (UsuarioService) realiza a lógica de negócios, como salvar ou buscar um usuário, e utiliza o repositório para interagir com o banco de dados.

3- Operações no Banco de Dados: O repositório (UsuarioRepository) usa o JPA para realizar operações no banco de dados, como salvar, deletar ou buscar entidades.

4- Resposta para o Cliente: O serviço retorna o resultado para o controller, que envia a resposta de volta ao cliente.
Essa estrutura segue a arquitetura típica de camadas em aplicações Spring Boot, separando a lógica de negócios da interação com o banco de dados e da recepção de requisições HTTP.

<h2>Ferramentas utilizadas</h2>

- ``Java``
- ``Visual Code Studio``

<h2>Desenvolvedor</h2>

[<img src="https://avatars.githubusercontent.com/u/159970639?v=4" width=115><br><sub>Raphael Couto</sub>](https://github.com/090Raphael)
