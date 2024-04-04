# Loteria - Sistema de Apostas Simples
Este é um programa Java simples que simula um sistema de apostas em uma loteria. O programa oferece três opções de apostas:

1. Aposta em um número de 0 a 100.
2. Aposta em uma letra de A a Z.
3. Aposta em um número par ou ímpar.

## Como Utilizar

### 1. Compilação e Execução:
* Certifique-se de ter o JDK (Java Development Kit) instalado em seu sistema.
* Compile o arquivo Loteria.java com o seguinte comando no terminal:

```java
    javac Loteria.java
```

* Execute o programa compilado com o seguinte comando:
```java
    java Loteria
```

### 2. Menu de Opções:
* Ao iniciar o programa, você será apresentado a um menu com as opções disponíveis.
* Escolha uma das opções digitando o número correspondente e pressionando Enter.

### 3. Entrada de Dados:
1. Dependendo da opção selecionada, o programa solicitará entrada de dados específicos.
    * Para a opção 1, você deve inserir um número inteiro de 0 a 100.
    * Para a opção 2, você deve inserir uma letra de A a Z.
    * Para a opção 3, você deve inserir um número inteiro.

### 4. Saída:
* Após inserir os dados, o programa mostrará se você ganhou ou perdeu, dependendo do resultado sorteado.
* Em caso de ganho, o programa informará o valor do prêmio.

## Importações Necessárias
Este programa requer as seguintes importações:

```java
import java.util.Scanner;
import java.util.Locale;
import java.util.Random;
```

Estas importações são usadas para lidar com entrada de usuário, geração de números aleatórios e formatação de localidade.

