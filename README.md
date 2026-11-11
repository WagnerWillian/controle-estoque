# 📦 Controle de Estoque em Java

Sistema simples de controle de estoque desenvolvido em Java como exercício prático de Programação Orientada a Objetos (POO).

O objetivo deste projeto é consolidar conhecimentos sobre classes, objetos, encapsulamento, validação de dados e tratamento de exceções.

## 🚀 Funcionalidades

- **Cadastro de produto:** permite informar nome, preço e quantidade inicial.
- **Consulta de produto:** exibe as informações do produto cadastrado.
- **Adição de estoque:** aumenta a quantidade disponível.
- **Realização de vendas:** reduz a quantidade em estoque, desde que haja unidades suficientes.
- **Alteração de preço:** permite atualizar o preço respeitando as regras de validação.
- **Tratamento de erros:** identifica entradas numéricas inválidas e operações não permitidas.

## 🛠️ Tecnologias utilizadas

- Java 21 (LTS)
- Oracle OpenJDK
- IntelliJ IDEA (ambiente de desenvolvimento)
- Programação Orientada a Objetos (POO)
- Git e GitHub para versionamento

## 📚 Conceitos praticados

- Classes e objetos
- Atributos e métodos
- Construtores
- Encapsulamento e modificadores de acesso
- Getters
- Retornos booleanos
- Estruturas condicionais e de repetição
- `Scanner` para entrada de dados
- `try/catch` para tratamento de exceções
- `IllegalArgumentException` para validação de dados

## 🏗️ Estrutura do projeto

O sistema está dividido em duas classes principais:

**Produto.java**

Responsável por armazenar as informações do produto e implementar as regras de negócio, incluindo validações e operações sobre o estoque e o preço.

**ControleEstoque.java**

Responsável pela execução do programa, apresentação do menu, leitura dos dados e interação com o usuário.

## ▶️ Como executar

1. Instale o JDK 21.
2. Clone ou baixe este repositório.
3. Abra o projeto no IntelliJ IDEA ou em outra IDE compatível com Java.
4. Configure o Project SDK para Java 21, se estiver utilizando o IntelliJ IDEA.
5. Execute a classe `ControleEstoque`, que contém o método `main`.
6. Utilize o menu exibido no terminal.

## ⚠️ Limitações

Esta é uma aplicação educacional, ainda em desenvolvimento.

- Gerencia apenas um produto por execução.
- Não utiliza banco de dados.
- Os dados não são salvos após o encerramento do programa.
- A interface funciona exclusivamente pelo terminal.

## 🎯 Objetivo de aprendizado

Este projeto foi desenvolvido durante meus estudos de Java para compreender, na prática, como organizar uma aplicação utilizando Programação Orientada a Objetos.

Durante o desenvolvimento, pratiquei a separação de responsabilidades entre classes, a criação de regras de negócio, o encapsulamento e o tratamento de entradas inválidas.

O projeto também será utilizado para praticar Git, GitHub e refatoração de código.

## 🔄 Próximos passos

- Padronizar os nomes das classes, métodos e atributos em inglês.
- Melhorar a organização e a legibilidade do código.
- Continuar aplicando os conhecimentos adquiridos nos estudos de Java.