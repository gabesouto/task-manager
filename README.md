# Task Manager ☕

Este projeto consiste em uma API REST em Java para gerenciar tarefas em um ToDo List. A aplicação oferece funcionalidades básicas, como adicionar, remover e marcar tarefas como concluídas. Abaixo estão listadas as principais funcionalidades e rotas disponíveis.

## Funcionalidades

1. **Listar todas as tarefas:** 
   - **Rota:** `GET /tasks`
   - **Descrição:** Retorna todas as tarefas cadastradas no sistema.

2. **Listar uma tarefa específica:** 
   - **Rota:** `GET /tasks/{id}`
   - **Descrição:** Retorna os detalhes de uma tarefa específica com base no identificador único.

3. **Adicionar uma nova tarefa:** 
   - **Rota:** `POST /tasks`
   - **Descrição:** Adiciona uma nova tarefa ao ToDo List.
   - **Corpo da Requisição:**
     - **Formato:** JSON
     - **Parâmetros:**
       - `title` (string): Título da tarefa.
       - `description` (string): Descrição da tarefa.
       - `ownerName` (string): Nome do responsável pela tarefa.
   - 
4. **Atualiza o status de uma task:** 
   - **Rota:** `PUT /tasks/{id}`
   - **Descrição:** Altera o status de uma task.
   

5. **Remover uma tarefa:** 
   - **Rota:** `DELETE /tasks/{id}`
   - **Descrição:** Remove uma tarefa com base no identificador único.
  
## Como Rodar a Aplicação
#### Certifique-se de ter o Maven e o Java 17 instalados

### Clone o repositório
```sh

  git clone https://github.com/gabesouto/task-manager.git
```


### Acesse a pasta do projeto
```sh
cd task-manager
```



### Instale as dependências 
```sh
mvn install
```

### Rode o projeto
```sh
 mvn spring-boot:run

```
