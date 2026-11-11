# Sistema Financeiro em Java

  Um simulador simples de sistema bancário desenvolvido em Java que roda diretamente no terminal. O projeto foi criado com o objetivo de praticar lógica de programação, estruturas de controle e entrada de dados via console.

---

## Funcionalidades

* **Exibição de dados iniciais:** Mostra o nome do cliente, o tipo da conta e o saldo inicial ao iniciar o sistema.
* **Consultar saldo:** Exibe o saldo atual atualizado da conta.
* **Receber valor (Depósito):** Permite adicionar valores positivos ao saldo da conta.
* **Transferir / Sacar valor:** Permite realizar saques ou transferências, validando se há saldo suficiente disponível.
* **Menu interativo:** Loop contínuo via terminal até que o usuário escolha a opção de sair.

---

## Tecnologias Utilizadas

* **Java** (JDK 17 ou superior recomendado)
* **Classe `Scanner`** (`java.util.Scanner`) para leitura de dados no terminal
* **VS Code** como ambiente de desenvolvimento
* **Google Gemini** Para criar o código e ajudar a tirar os bugs

---

## Como executar o projeto

### Pré-requisitos
Certifique-se de ter o **Java Development Kit (JDK)** instalado em sua máquina. Você pode verificar rodando o comando abaixo no terminal:
```bash
java -version
```

### Passo a passo

1. **Clone este repositório** (ou baixe o arquivo `SistemaFinanceiro.java`):
   ```bash
   git clone https://github.com
   ```

2. **Acesse a pasta onde está o arquivo `.java`:**
   ```bash
   cd Sistema_Financeiro/src
   ```

3. **Compile o código:**
   ```bash
   javac SistemaFinanceiro.java
   ```

4. **Execute o programa:**
   ```bash
   java SistemaFinanceiro
   ```

---

## 💻 Exemplo de Uso

```text
***************************************
Dados iniciais do cliente:

Nome do cliente: João da Silva
Tipo conta:      Corrente
Saldo atual:     R\$ 2500,00
***************************************

Operações disponíveis:
1. Consultar saldo
2. Receber valor (Depósito)
3. Transferir / Sacar valor
4. Sair

Digite a opção desejada: 1

O seu saldo atual é: R\$ 2500,00
```

---

## 🔮 Próximas Melhorias

* [ ] Refatorar o código utilizando **Programação Orientada a Objetos (POO)** com uma classe `Conta`.
* [ ] Adicionar suporte para **múltiplas contas** e cadastro de clientes.
* [ ] Implementar um **extrato / histórico** de transações realizadas.
* [ ] Criar tratamento de exceções (`try-catch`) para evitar erros caso o usuário digite letras em vez de números.

---

## 👤 Autor

Desenvolvido por **[Seu Nome Aqui]**  
[![LinkedIn](https://shields.io)](https://linkedin.com)
[![GitHub](https://shields.io)](https://github.com)
## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
