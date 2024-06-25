# Projeto de Bate-Papo Prólixo

Este projeto implementa um sistema de bate-papo (chat) entre dois ou mais usuários utilizando Java. Diferentemente de um bate-papo convencional, as mensagens são transmitidas de forma mais verbosa, facilitando a compreensão do fluxo de mensagens.

## Estrutura do Projeto

O projeto é dividido em duas partes principais:

- **Server.java**: Responsável por gerenciar as conexões dos clientes e retransmitir as mensagens entre eles.
- **Client.java**: Interface de usuário que permite enviar e receber mensagens.

### Server.java

O servidor funciona escutando em uma porta específica e espera por conexões de clientes. Quando um cliente se conecta, uma nova thread é iniciada para lidar com a comunicação desse cliente. O servidor retransmite qualquer mensagem recebida de um cliente para todos os outros clientes conectados.

### Client.java

O cliente conecta-se ao servidor especificado, permite ao usuário digitar mensagens e as envia ao servidor. Também recebe mensagens de outros usuários através do servidor e exibe-as.

## Como Executar

### Pré-requisitos

Certifique-se de ter o Java instalado em sua máquina. Você pode verificar isso executando `java -version` no terminal ou prompt de comando.

### Compilando o Projeto

1. Abra o terminal ou prompt de comando.
2. Navegue até a pasta do projeto.
3. Compile os arquivos usando o seguinte comando:

```bash
javac Server.java Client.java
