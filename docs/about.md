A Stack foi criada com o intuito de gerar projetos Kotlin/Java usando Rest Assured para criar projetos de testes automatizados para backend.

####Ao utilizar a stack você terá os seguintes benefícios:

- Estrutura organizada.
- Padronização de código.
- Atuação com tecnologias do mercado.


### Estrutura do projeto:

- **model**
  - **User** - Onde fica todas a variáveis para as rotas e a url principal.
- **service** - Onde fica todos as funçoes para executar as requests.
- **tests** - Onde fica todas as classes de testes.
- **Support**
  - **utils**
    - **BaseRest** - Onde fica todas as principais funções do Rest Assured.
    - **GetVariable** - Uma classe para pegar os valores dos properties para poder usar a mesma variável mas com valores diferentes dependendo do ambiente.
  - **enums**
    - **Paths** - Onde fica todas a variáveis para as rotas e a url principal.
  - **SuiteTest** - Classe para rodar todos os testes automatizados.
- **resources** - Onde fica as variáveis com os valores por ambiente. 

### Usando a stack

**1. Importar nossa stack com o comando abaixo:**

```bash
stk import stack https://github.com/brunobatista25/stack-rest-assured 
```

**2. Você precisa escolher qual linguagem vai usar e instalar o projeto com os comandos abaixo:**

### Para utilizar o projeto com a linguagem Java execute o comando abaixo:

```bash
stk create app nome_do_seu_projeto -t stack-rest-assured/template-rest-assured-java
```

### Para utilizar o projeto com a linguagem Kotlin execute o comando abaixo:

```bash
stk create app nome_do_seu_projeto -t stack-rest-assured/template-rest-assured-kotlin
```