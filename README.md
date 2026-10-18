# Gestão de Empréstimo de Equipamentos

## Sobre o projeto

O **Gestão de Empréstimo de Equipamentos** é um sistema desenvolvido para organizar e controlar o empréstimo de equipamentos em uma empresa, permitindo acompanhar os equipamentos disponíveis, os funcionários responsáveis e as movimentações de empréstimo e devolução.

O objetivo é facilitar o controle dos recursos da empresa, reduzir falhas nos registros e melhorar o acompanhamento dos equipamentos.

## Funcionalidades

- [ ] Cadastro de funcionários.
- [ ] Cadastro de equipamentos.
- [ ] Consulta de equipamentos disponíveis.
- [ ] Registro de empréstimos de equipamentos.
- [ ] Registro de devoluções.
- [ ] Consulta do histórico de empréstimos.
- [ ] Controle dos equipamentos emprestados e disponíveis.

## Tecnologias utilizadas

- **Java** — linguagem de programação.
- **Spring Boot** — desenvolvimento da aplicação backend.
- **Git e GitHub** — versionamento e gerenciamento do código.

## Regras de negócio

- Um equipamento não pode ser emprestado a mais de um funcionário simultaneamente.
- Somente equipamentos disponíveis podem ser emprestados.
- Cada empréstimo deve estar associado a um funcionário e a um equipamento.
- A devolução deve atualizar a disponibilidade do equipamento.
- O histórico deve permitir identificar quem realizou o empréstimo e quando ocorreu a movimentação.

## Como executar o projeto

1. Clone o repositório:

   ```bash
   git clone URL_DO_REPOSITORIO
   ```

2. Acesse a pasta do projeto:

   ```bash
   cd sistema-de-emprestimo-de-equipamentos
   ```

3. Abra o projeto em sua IDE, como IntelliJ IDEA.

4. Configure as dependências e as variáveis de ambiente necessárias.

5. Execute a aplicação Spring Boot.

> **Observação:** os passos de configuração do banco de dados devem ser adicionados conforme a implementação do projeto.

## Próximas melhorias

- Implementar validações para evitar empréstimos inválidos.
- Adicionar filtros de pesquisa.
- Criar documentação da API com Swagger/OpenAPI.
- Implementar testes automatizados.
- Desenvolver uma interface para facilitar a utilização do sistema.

## Autor

**Mizael Santos**

- GitHub: [@mimipub](https://github.com/mimipub)
- LinkedIn: [mizaelmsantos](https://www.linkedin.com/in/mizaelmsantos)
