# WaterBottle

## Sobre o projeto

Projeto da Aula 2 de Programação Orientada a Objetos. Na aula passada,
criamos a classe `WaterBottle` só com atributos (a garrafa "parada").
Nesta aula, demos comportamento a ela: agora a garrafa tem ações que
alteram seu estado.

## O que a classe representa

`WaterBottle` representa uma garrafa térmica física. No mundo real, ela
tem uma tampa que abre e fecha, e um volume de líquido que sobe (quando
enchemos) e desce (quando bebemos/despejamos). A classe modela
exatamente esse comportamento.

## Diagrama de classe (UML)

```
┌─────────────────────────────────────────┐
│               WaterBottle                 │
├─────────────────────────────────────────┤
│ + cor: String                              │
│ + construcao: String                       │
│ + capacidadeML: double                     │
│ + volumeAtualML: double                    │
│ + tampaAberta: boolean                     │
├─────────────────────────────────────────┤
│ + abrirTampa(): void                       │
│ + adicionarLiquido(volumeML: double): void │
│ + despejarLiquido(volumeML: double): void  │
└─────────────────────────────────────────┘
```

Os atributos `volumeAtualML` e `tampaAberta` e os 3 métodos abaixo são
novos nesta etapa (na aula passada só existiam `cor`, `construcao` e
`capacidadeML`).

## Métodos

- **`abrirTampa()`** — alterna a tampa entre aberta e fechada.

- **`adicionarLiquido(volumeML)`** — coloca líquido na garrafa, somando
  ao `volumeAtualML`.
  **Regras de negócio:**
  - a tampa precisa estar aberta;
  - o volume deve ser maior que zero.

- **`despejarLiquido(volumeML)`** — retira líquido da garrafa, subtraindo
  de `volumeAtualML`.
  **Regras de negócio:**
  - a tampa precisa estar aberta;
  - não é possível despejar mais líquido do que existe na garrafa.

Se qualquer regra for violada, o método imprime um erro e o estado do
objeto não muda.

## Como usar

```java
WaterBottle garrafa = new WaterBottle("Preta", "Suporte MagSafe", 500);

garrafa.adicionarLiquido(300);   // inválido: tampa fechada
garrafa.abrirTampa();            // abre a tampa
garrafa.adicionarLiquido(300);   // válido: volume vai para 300ml
garrafa.adicionarLiquido(-50);   // inválido: volume negativo
garrafa.despejarLiquido(100);    // válido: volume vai para 200ml
garrafa.despejarLiquido(9999);   // inválido: não há líquido suficiente
```

## Como rodar

Abra `MainSystem.java` no IntelliJ e execute o `main`. O console mostra
cada teste (válido e inválido) e o estado final da garrafa.

## Estrutura

```
src/br/com/waterbottle/
├── model/WaterBottle.java
└── main/MainSystem.java
```

## Versionamento

```bash
git add .
git commit -m "feat: adiciona métodos de comportamento e atualiza README"
git push origin main
```
