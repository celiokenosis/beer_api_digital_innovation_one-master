# beer_api_digital_innovation_one-master
Beer API DIO 
Digital Innovation: Expert class - Desenvolvimento de testes unitários para validar uma API REST de gerenciamento de estoques de cerveja.

Nesta live coding, vamos aprender a testar, unitariamente, uma API REST para o gerenciamento de estoques de cerveja. Vamos desenvolver testes unitários para validar o nosso sistema de gerenciamento de estoques de cerveja, e também apresentar os principais conceitos e vantagens de criar testes unitários com JUnit e Mockito. Além disso, vamos também mostrar como desenvolver funcionalidades da nossa API através da prática do TDD.

Durante a sessão, serão abordados os seguintes tópicos:

    Baixar um projeto através do Git para desenolver nossos testes unitários.
    Apresentação conceitual sobre testes: a pirâmide dos tipos de testes, e também a importância de cada tipo de teste durante o ciclo de desenvolvimento.
    Foco nos testes unitários: mostrar o porque é importante o desenvolvimento destes tipos de testes como parte do ciclo de desenvolvimento de software.
    Principais frameworks para testes unitários em Java: JUnit, Mockito e Hamcrest.
    Desenvolvimento de testes unitários para validação de funcionalides básicas: criação, listagem, consulta por nome e exclusão de cervejas.
    TDD: apresentação e exemplo prático em 2 funcionaliades importantes: incremento e decremento do número de cervejas no estoque.

Para executar o projeto no terminal, digite o seguinte comando:

mvn spring-boot:run 

Para executar a suíte de testes desenvolvida durante a live coding, basta executar o seguinte comando:

mvn clean test

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

http://localhost:8080/api/v1/beers

