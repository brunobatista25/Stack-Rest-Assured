A Stack foi criada com o intuito de gerar projetos Kotlin/Java usando Rest Assured para criar projetos de testes automatizados para backend.

Ao utilizar a stack você terá os seguintes benefícios:

- Estrutura organizada.
- Padronização de código.
- Atuação com tecnologias do mercado.


### Usando a stack

1. Importar nossa stack com o comando abaixo:

```bash
stk import stack https://github.com/brunobatista25/stack-rest-assured 
```

2. Você precisa escolher qual linguagem vai usar e instalar o projeto com os comandos abaixo:

### Para utilizar o projeto com a linguagem Java execute o comando abaixo:

```bash
stk create app nome_do_seu_projeto -t stack-rest-assured/template-rest-assured-java
```

### Para utilizar o projeto com a linguagem Kotlin execute o comando abaixo:

```bash
stk create app nome_do_seu_projeto -t stack-rest-assured/template-rest-assured-kotlin
```