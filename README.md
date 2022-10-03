<h1 align="center"> 
  <p align="center"> Aplicação Web utilizando apenas Servlets, páginas Jsp e JDBC. </p>
</h1>

![javaee](https://user-images.githubusercontent.com/104053775/193376553-d36161bd-eadd-4242-975e-19386768bfc7.png)

## Este Repositório contém exercícios e projetos utilizando o Java EE, mais especificamente, os componentes mais básicos; afim de criar uma aplicação web. Entender o **padrão de projeto MVC** e colocá-lo em prática.

## ✔️ Técnicas e tecnologias utilizadas neste Repositório

- ``Java 11``
- ``ECLIPSE IDE ENTERPRISE EDITION``
- ``Paradigma de orientação a objetos``
- ``Selenium``
- ``DBUnit``
- ``Servlets``
- ``HTML E JSP``
- ``JDBC``
- ``MySQL 8.0.30``
- ``Apache TomCat 9.0``
- ``Design Pattern MVC``
- ``Protocolo HTTP``

### O conteúdo deste repósitorio faz parte da **Formação Spring-Boot da Alura** e também do curso de **Desenvolvimento Ágil com Java Avançado do ITA**
### A pasta destaque é a Web Application, onde eu criei uma aplicação web utilizando apenas servlets,páginas jsp e jdbc para acessar o banco de dados, todos estes conceitos são importantes para futuras tecnologias que se aplicam ao Spring-Boot framework

# Projeto - Sistema Simples de Fórum

A aplicação que foi desenvolvida é um sistema simples de fórum, onde os usuários podem adicionar tópicos e comentários aos tópicos. Eles recebem pontos pelas ações que fazem no sistema e uma tela de ranking mostra a colocação dos usuários.

``Abaixo segue a descrição das telas do sistema:``

- Tela Login - Essa é a tela inicial. Possui os campos login e senha para o usuário se autenticar. Se o usuário se autenticar com sucesso, ele deve ser redirecionado para a Tela Tópicos. Se não se autenticar com sucesso, o usuário deve ser direcionado para essa mesma tela, que deve exibir uma mensagem de erro.  Deve possuir o link para a Tela Cadastro.

- Tela Cadastro - Essa tela possui um formulário em que o usuário deve entrar com suas informações (nome, login, email e senha) e se cadastrar. Ao inserir as informações do usuário, ele é direcionado a Tela Login.

- Tela Tópicos - Essa tela possui uma tabela com os tópicos criados pelo usuário. Cada tópico na tabela irá exibir o título e o nome do usuário que o criou. Ao clicar em um tópico, o usuário vai para a Tela Exibe Tópico. Existe um link que vai para a Tela Ranking e um link que vai para a Tela Insere Tópico.

- Tela Exibe Tópico - Essa tela exibe o tópico com o título do tópico, o nome de quem o colocou e seu texto. Abaixo do tópico são exibidos os comentários adicionados. Cada comentário possui somente o texto e o nome de quem o inseriu. Abaixo de tudo, existe um campo grande de texto e um botão para adicionar um novo comentário. Ao adicionar o comentário, o usuário deve ser redirecionado para a mesma Tela Exibe Tópico. Existe um link para voltar para a Tela Tópicos.

- Tela Insere Tópico - Essa tela apresenta um formulário para para adicionar o título de um tópico e um campo grande de texto para colocar seu conteúdo. Ao submeter, o tópico é inserido e o usuário é redirecionado para a Tela Tópicos.

- Tela Ranking - Essa tela apresenta a lista dos usuários ordenados pela quantidade de pontos que possuem. Deve haver uma tabela com a colocação, nome, login e quantidade de pontos. Quando um usuário inserir um tópico, ele deve ganhar 10 pontos e quando adicionar um comentário deve ganhar 3 pontos. Existe um link para voltar para a Tela Tópicos.

``Abaixo estão descritos os requisitos técnicos da aplicação:``

- Foi utilizado uma estrutura MVC, separando as responsabilidades das classes nas camadas.

- Utilizei SERVLETS como a camada de controller, JSP como a camada de view e JDBC para o acesso ao banco de dados. 

- Foram feitos os testes das classes que acessam o banco de dados com o DBUnit e pelo menos 3 testes com o Selenium que envolva a navegação entre pelo menos 2 telas.

``Estrutura do banco de dados:``

- A tabela usuario, ela armazena os usuários com seus respectivos pontos.

- A tabela topico armazena um tópico do fórum, e possui as informações do título, conteúdo e o login do usuário que o criou. 

- A tabela comentario armazena os comentários feitos para um tópico, com o texto, o login do usuário que o fez e o id do tópico relacionado.


``Meu vídeo no Youtube utilizando a Aplicação como foi descrita`` - https://www.youtube.com/watch?v=oO640jXofb4&ab_channel=RafaelBessa

### Para quem quer reproduzir minha Aplicação

- Todos os .jars utilizados estão dentro do projeto, basta copiá-los e adicionar no build path do seu projeto, fique atento às versões utilizadas
- Recomendo utilizar uma extensão no Google Chrome chamada Selenium IDE, você pode gerar os testes de maneira mais produtiva.
- As páginas html e sua estilização foram feitas de maneira simples, eu quis focar mais na funcionalidade do que no design, porém, você pode utilizar o html e css que quiser, basta apenas seguir as ideias adequadas para não fazer requests errados.
- As páginas Jsp, as vezes eu utilizei a expression language e as vezes eu utilizei jstl, fique à vontade para usar qual quiser, fiz assim para fins de treinamento.
- Eu realmente não utilizei nenhum framework para auxiliar, essa era a ideia do projeto


