# Simulando uma Conta Bancária pelo Terminal

Desafio de projeto do Santander Bootcamp 2024 (Backend com Java) na DIO.

O programa lê pelo terminal os dados de uma nova conta bancária e, no final, exibe uma mensagem confirmando a criação da conta com os dados informados.

## Dados lidos

| Campo           | Tipo     |
|-----------------|----------|
| Número da conta | `int`    |
| Agência         | `String` |
| Nome do cliente | `String` |
| Saldo           | `double` |

## Além do enunciado

- Todas as entradas são lidas com `nextLine()` e convertidas depois, evitando o problema clássico do `nextInt()` deixar a quebra de linha no buffer e pular o próximo campo.
- Validação de entrada: se o usuário digitar letras no número da conta ou no saldo, o programa avisa e pede de novo, em vez de encerrar com `InputMismatchException`.
- Campos vazios não são aceitos.
- O saldo aceita vírgula ou ponto como separador decimal (`1500,50` ou `1500.50`) e é exibido no formato brasileiro, com duas casas.

## Como executar

Requisito: JDK 17 ou superior.

```bash
cd src
javac ContaTerminal.java
java ContaTerminal
```

## Exemplo de execução

```
Por favor, digite o número da Conta!
1021
Por favor, digite o número da Agência!
067-8
Por favor, digite o nome do Cliente!
Matheus Ansel
Por favor, digite o Saldo!
237,48
Olá Matheus Ansel, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo R$ 237,48 já está disponível para saque.
```

## Autor

Matheus Ansel - [GitHub](https://github.com/MatheusAnsel) | [LinkedIn](https://www.linkedin.com/in/matheusansel)
