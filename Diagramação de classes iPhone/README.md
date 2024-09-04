# DIO - Trilha Java Básico
www.dio.me

#### Autores
- [Gleyson Sampaio](https://github.com/glysns)

## Modelagem UML

1 Identificação das Classes e Interfaces

Com base nas funcionalidades descritas, você pode criar três interfaces e uma classe concreta para representar o iPhone:

Reprodutor Musical: Representa a funcionalidade de reprodutor de música.
Aparelho Telefônico: Representa a funcionalidade de telefone.
Navegador na Internet: Representa a funcionalidade de navegador web.
iPhone: Implementa as interfaces de acordo com suas funcionalidades.

## 1.2 Diagrama de Classes UML

Aqui está um exemplo de como você pode criar o diagrama UML:

Interface ReprodutorMusical

Métodos:
+tocar() : void
+pausar() : void
+selecionarMusica(musica: String) : void
Interface AparelhoTelefonico

Métodos:
+ligar(numero: String) : void
+atender() : void
+iniciarCorreioVoz() : void
Interface NavegadorInternet

Métodos:
````+exibirPagina(url: String) : void
+adicionarNovaAba() : void
+atualizarPagina() : void
Classe iPhone 
```` 

Implementa:
ReprodutorMusical
AparelhoTelefonico
NavegadorInternet
Métodos:
Implementa todos os métodos das interfaces.





<h2>Ferramentas utilizadas</h2>

- ``Java``
- ``Visual Code Studio``

<h2>Desenvolvedor</h2>

[<img src="https://avatars.githubusercontent.com/u/159970639?v=4" width=115><br><sub>Raphael Couto</sub>](https://github.com/090Raphael)
