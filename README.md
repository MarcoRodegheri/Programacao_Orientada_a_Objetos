<div align="center">

# Sistema de Gerenciamento de Voos (MyFlight)

### Trabalho da disciplina de Programação Orientada a Objetos (POO) — PUCRS

![Java](https://img.shields.io/badge/Java_21-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![JUnit5](https://img.shields.io/badge/JUnit_5-25A162?style=for-the-badge&logo=junit5&logoColor=white)

</div>

---

## Sobre o projeto

Sistema de gerenciamento de voos desenvolvido em **Java puro**, como projeto acumulado ao longo da disciplina de **Programação Orientada a Objetos (PUCRS)**. O projeto modela o domínio de uma companhia aérea — aeroportos, aeronaves, companhias e rotas — e aplica, sobre esse domínio, os principais pilares da orientação a objetos trabalhados na disciplina: **modelagem**, **interfaces**, **herança** e **polimorfismo**.

## Como funciona

- **Modelagem** — as entidades do domínio (`Aeroporto`, `Aeronave`, `CiaAerea`, `Rota`, `Geo`) representam o problema com responsabilidades bem definidas, cada uma gerenciada por uma classe `Gerenciador*` dedicada (`GerenciadorAeroportos`, `GerenciadorAeronaves`, `GerenciadorCias`, `GerenciadorRotas`, `GerenciadorVoos`).
- **Interfaces** — `Aeronave` implementa `Contavel` (contagem de instâncias criadas) e `Comparable<Aeronave>`; `Aeroporto` e `Rota` também implementam `Comparable`, permitindo ordenação via `Collections.sort()` nos gerenciadores.
- **Herança** — `Voo` é uma classe abstrata que define o contrato comum (data/hora, status, `getRota()` e `getDuracao()` abstratos), especializada em duas subclasses:
  - `VooDireto` — um único trecho entre origem e destino.
  - `VooEscalas` — múltiplos trechos (rotas) encadeados, com cálculo de duração total somando cada trecho.
- **Polimorfismo** — o sistema trata voos diretos e com escalas de forma uniforme através do tipo `Voo`: cada subclasse calcula sua própria duração (`getDuracao()`) e formata sua própria descrição (`toString()`), sem que o código cliente precise saber qual subtipo está manipulando.
- **Cálculo de distância** — a distância entre aeroportos é calculada com a fórmula do **haversine** (`Geo.distancia`), usada para estimar a duração de voo com base em uma velocidade média de cruzeiro.

## Estrutura do projeto

```
MyFlight/
├── pom.xml
└── src/
    ├── main/java/edu/rodegheri/
    │   ├── App.java                      # Ponto de entrada / demonstração do sistema
    │   ├── Geo.java                       # Coordenadas e cálculo de distância (haversine)
    │   ├── Aeroporto.java                 # Modelo de aeroporto
    │   ├── Aeronave.java                  # Modelo de aeronave (Contavel, Comparable)
    │   ├── CiaAerea.java                  # Modelo de companhia aérea
    │   ├── Rota.java                      # Trecho entre dois aeroportos
    │   ├── Contavel.java                  # Interface de contagem de instâncias
    │   ├── Voo.java                       # Classe abstrata base (herança/polimorfismo)
    │   ├── VooDireto.java                 # Voo com um único trecho
    │   ├── VooEscalas.java                # Voo com múltiplos trechos
    │   ├── GerenciadorAeroportos.java
    │   ├── GerenciadorAeronaves.java
    │   ├── GerenciadorCias.java
    │   ├── GerenciadorRotas.java
    │   └── GerenciadorVoos.java
    └── test/java/edu/rodegheri/
        └── AppTest.java                  # Testes unitários (JUnit 5)
```

## Como rodar

```bash
mvn compile
mvn exec:java -Dexec.mainClass="edu.rodegheri.App"
```

## Como rodar os testes

```bash
mvn test
```

## Autor

- Marco Antônio De Carli Rodegheri
- Luiz Confortin
- Roger Rozales Ehlert
