# Java Online Store

Este é um projeto simples de uma loja online desenvolvido em Java, com foco em conceitos de orientação a objetos como composição, encapsulamento e reutilização de classes.

## 📦 Estrutura do Projeto

O projeto é composto por quatro classes principais:

### ✅ `Usuario.java`

Contém os dados básicos do comprador:
- Nome
- CPF
- E-mail

### ✅ `Produto.java`

Representa um produto disponível para venda. Os atributos incluem:
- Nome
- Preço unitário
- Conteúdo (ex: "5kg", "1L", "500g")

### ✅ `ItemVenda.java`

Associa um produto a uma quantidade específica em uma venda. Responsável por calcular o valor total daquele item:
- Produto (instância de `Produto`)
- Quantidade
- Valor total (preço × quantidade)

### ✅ `Venda.java`

Contém a lista de itens da venda e informações do comprador:
- Comprador (instância de `Usuario`)
- Lista de itens (`ArrayList<ItemVenda>`)
- Método para adicionar novos itens com produto e quantidade
- Cálculo e exibição do valor total da venda

### ✅ `Main.java`

Simula o uso do sistema:
- Criação de usuários
- Criação de produtos
- Associação de produtos a usuários por meio de vendas
- Exibição dos dados no console

## 🛠 Tecnologias Utilizadas

- Java 17+
- `ArrayList` para gerenciamento de listas de itens
- Formatação simples de valores numéricos (com `Math.round`)

## 💡 Objetivo

Este projeto tem como objetivo exercitar a estruturação de aplicações orientadas a objetos em Java, utilizando boas práticas de composição entre classes e separação de responsabilidades.

## 📂 Organização do Código

Todos os arquivos `.java` estão localizados na pasta `src/`.