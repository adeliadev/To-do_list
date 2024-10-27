# ✅ To-do list API
<p>
  Este é um aplicativo simples de gerenciamento de tarefas, desenvolvido com Spring Boot, 
  que utiliza o banco de dados H2 em memória. A API permite criar, visualizar, atualizar e
  excluir tarefas.
</p>

## 🛠️ Tecnologias utilizadas:
- Java 17
- Spring Boot
- H2

## 📝 Estrutura da task:
A entidade Task possui os seguintes atributos:
- id [Long]: Identificador único da tarefa.
- description [String]: Descrição da tarefa.
- completed [Boolean]: Status da tarefa (se foi concluída ou não).

## 🔗 Endpoints:
Todas as requisições foram testadas no Postman, mas você pode usar a ferramenta da sua
preferência para realizar as requisições
- Obter todas as tarefas `[GET]`:
```
localhost:8080/tasks
```
- Obter tarefa por id `[GET]`:
```
localhost:8080/tasks/id
```
- Criar uma nova tarefa `[POST]`:
```
localhost:8080/tasks
```
- Atualizar tarefa existente `[PUT]`:
```
localhost:8080/tasks/id
```
- Excluir uma tarefa `[DELETE]`:
```
localhost:8080/tasks/id
```

## 🚀 Rodando o projeto:
### 1. Requisitos:
- Java 17
- IDE como `Intellij IDEA`,  `Eclipse`, `VsCode` ou outra que tenha suporte para Java

### 2. Clonar o repositório [no git bash]:
- crie uma pasta
- abra a pasta criada no git bash
```
git clone https://github.com/seu-usuario/to-do-list.git
cd sua-pasta-escolhida
```

### 3. Executar o projeto:
- abra a pasta que contém o conteúdo do repositório clonado na sua IDE
- execute o arquivo `ToDoListApplication`

### 4. Fazer requisições
- instale `Postman`, `Insomnia` ou alguma outra ferramenta em que você possa fazer as
requisições
- Execute a de sua escolha (listadas em `Endpoints`)

### 5. Exemplo de estrutura JSON:
```
{
  "id": 1,
  "description": "Estudar Spring Boot",
  "completed": false
}
```
- obs: para o `POST` o "id" não é necessário, por que ele é gerado e incrementado automaticamente

## 💾 Sobre o banco de dados H2:
- O banco de dados H2 é reiniciado toda vez que o aplicativo é reiniciado,
então todas as tarefas criadas serão perdidas ao parar o servidor.
- Link para acessar o banco de dados no navegador: `http://localhost:8080/h2-console`
- Você decide o usuário e senha do banco de dados em `application.properties`
```
spring.datasource.username=usuario
spring.datasource.password=senha
```

## 📧 Contato:
Em caso de dúvidas ou sugestões, entre em contato com [arodriguesthamyres@gmail.com](mailto:arodriguesthamyres@gmail.com)
.
