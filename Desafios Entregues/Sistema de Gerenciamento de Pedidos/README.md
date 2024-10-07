<h1 align="center"> Desafio plataforma DIO </h1>
<h2 align="center"> Sistema de Gerenciamento de Pedidos </h2>

## Introdução
- Sistema simples de gerenciamento de pedidos de um restaurante, aplicando diferentes padrões de projeto..

## Funcionalidades
Criação de diferentes tipos de pedidos (comida, bebida, sobremesa).

Aplicação de descontos e promoções.

Possibilidade de adicionar/remover itens do pedido.

Emissão de relatórios sobre os pedidos.

## Padrões de Projeto a serem utilizados
Factory Method: Para a criação dos pedidos, onde cada tipo de pedido (comida, bebida, sobremesa) terá sua própria implementação.

Singleton: Para a gestão centralizada de um serviço de relatórios, garantindo que apenas uma instância do serviço seja utilizada.

Strategy: Para a aplicação de diferentes tipos de promoções ou descontos no pedido (ex: desconto sazonal, desconto de fidelidade).

Observer: Para notificar o serviço de relatórios sempre que um novo pedido for criado ou modificado.

Decorator: Para adicionar novos comportamentos ao pedido, como a adição de embalagens para viagem ou taxas de serviço.



<h2>Ferramentas utilizadas</h2>

- ``Java``
- ``Visual Code Studio``

<h2>Desenvolvedor</h2>

[<img src="https://avatars.githubusercontent.com/u/159970639?v=4" width=115><br><sub>Raphael Couto</sub>](https://github.com/090Raphael)
