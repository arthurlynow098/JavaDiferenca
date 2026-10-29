<p align="center">
  <img src="assets/banner.png" alt="JavaDiferença" width="100%">
</p>

<p align="center">
  Utilitário de linha de comando em Java para leitura de quatro inteiros e avaliação da expressão algébrica <code>DIFERENCA = (A × B − C × D)</code>.
</p>

<p align="center">
  <img alt="Java" src="https://img.shields.io/badge/Java-Console_App-C52E36?style=for-the-badge&logo=openjdk&logoColor=white">
  <img alt="Algoritmo" src="https://img.shields.io/badge/F%C3%B3rmula-A*B_--_C*D-11120F?style=for-the-badge">
  <img alt="Scanner" src="https://img.shields.io/badge/I%2FO-java.util.Scanner-18181B?style=for-the-badge">
</p>

## Sobre o projeto

Exercício clássico de programação competitiva e lógica em **Java** que consiste em ler quatro valores inteiros (A, B, C e D) a partir da entrada padrão (System.in), calcular a diferença entre o produto dos dois primeiros e o produto dos dois últimos e imprimir o resultado formatado.

O programa exemplifica o fluxo essencial de entrada e saída em Java com a classe java.util.Scanner, precedência de operadores aritméticos e liberação adequada do recurso de leitura (sc.close()).

## Principais recursos

| Recurso | Como funciona |
|---|---|
| Leitura tipada no console | Captura quatro números inteiros sequenciais (positivos ou negativos) via sc.nextInt(). |
| Cálculo determinístico | Avalia a expressão (A * B - C * D) respeitando a precedência nativa da multiplicação sobre a subtração. |
| Saída padronizada | Exibe o resultado exatamente no formato DIFERENCA = <valor>, compatível com juízes online. |
| Gestão de recursos | Fecha o objeto Scanner ao término da leitura para evitar vazamento de descritores de entrada. |

## Tecnologias

<p>
  <img alt="Java" src="https://img.shields.io/badge/Java-C52E36?style=flat-square&logo=openjdk&logoColor=white">
  <img alt="CLI" src="https://img.shields.io/badge/Terminal_I%2FO-11120F?style=flat-square">
</p>

- **Java Standard Edition (java.util.Scanner)** para leitura de fluxo de entrada e aritmética inteira.

## Arquitetura

`mermaid
flowchart LR
    A[Entrada Padrão · 4 Inteiros] --> B[Scanner.nextInt : A, B, C, D]
    B --> C[Cálculo : A * B - C * D]
    C --> D[Saída : DIFERENCA = resultado]
`

## Estrutura do repositório

`	ext
JavaDiferenca/
├── assets/
│   ├── banner.png                  Banner principal do projeto
│   └── project-animal.png          Símbolo da tesourinha
├── DifencaJava.Java                Código-fonte da classe Main
└── README.md
`

## Executando o código

1. Clone o repositório:
   `ash
   git clone https://github.com/arthurlynow098/JavaDiferenca.git
   cd JavaDiferenca
   `
2. Como a classe pública declarada é Main, copie o arquivo para Main.java, compile e execute:
   `ash
   cp DifencaJava.Java Main.java
   javac Main.java
   java Main
   `
3. Digite quatro números inteiros (ex.: 5 6 7 8) para obter DIFERENCA = -26.

---

<p align="center"><sub>Estudo · construção · evolução</sub><br><a href="https://github.com/arthurlynow098">Perfil</a> · <a href="https://arthurentsev.vercel.app/">Portfólio</a> · <a href="https://www.linkedin.com/in/entsevarthur/">LinkedIn</a></p>
