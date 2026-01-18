# 📦 Estudo sobre Map em Java (HashMap e TreeMap)

Este mini projeto tem como objetivo demonstrar o uso da interface `Map` em Java, explorando as implementações `HashMap` e `TreeMap`, além de conceitos importantes como:

- Inserção, remoção e busca de elementos
- Diferença entre chaves e valores
- Ordenação automática com `TreeMap`
- Uso de objetos como chave em um `Map`
- Importância dos métodos `equals()` e `hashCode()`

---

## 🛠️ Tecnologias Utilizadas

- Java 17+ (compatível com Java 8+)
- JDK padrão
- IDE de sua preferência (IntelliJ, Eclipse, VS Code)

---

## 📁 Estrutura do Projeto

```text
src/
└── application/
|    ├── Program.java
└── entity/
     ├── Product.java
```

---

### 📌 Conceitos Importantes sobre Map

- Um `Map` armazena dados no formato **chave → valor**
- **Chaves não podem se repetir**
- **Valores podem se repetir**
- Cada chave aponta para exatamente um valor
- Se uma chave já existir, o valor será **substituído**

---

## 🌳 TreeMap — Mapa Ordenado por Chave

O `TreeMap` mantém os elementos **ordenados pela chave**.

No caso de chaves do tipo `String`, a ordenação é **alfabética (ordem lexicográfica)**.

### Exemplo:
```java
Map<String, String> cookies = new TreeMap<>();
```

Operações demonstradas:

-  `put()` → Inserir ou atualizar
- `remove()` → Remover por chave
- `containsKey()` → Verificar existência
- `get()` → Buscar valor pela chave
- `size()` → Quantidade de elementos
- Iteração com `entrySet()`


### 🔁 Substituição de Valores -  `put()`

```java
cookies.put("phone", "1199887766");
cookies.put("phone", "1199887733");
```

- O segundo valor substitui o primeiro porque a chave é a mesma.
- O `Map` não aceita chaves duplicadas.


## 📦 HashMap com Objeto como Chave

**Este projeto também demonstra o uso de objetos personalizados como chave em um HashMap.**

```java
Map<Product, Double> stock = new HashMap<>();
```

### ⚠️ Muito Importante!

**Quando um objeto é usado como chave em um Map, é obrigatório sobrescrever:**

- `equals()`
- `hashCode()`

**Caso contrário, o Map não conseguirá identificar corretamente chaves logicamente iguais.**


### 🧠 Classe Product

A classe Product sobrescreve corretamente `equals()` e `hashCode()` com base em seus atributos (name e price).

Isso garante que dois objetos com os mesmos dados sejam tratados como a mesma chave no Map.

### ✅ Exemplo Prático

```java
Product p1 = new Product("Notebook", 1200.0);
System.out.println(stock.containsKey(p1));
```

## 📌 Resumo do projeto

- Diferença entre `HashMap` e `TreeMap`
- Ordenação automática de chaves
- Substituição de valores por chave duplicada
- Uso correto de `containsKey`, `get`, `remove`
- Iteração eficiente com `entrySet()`

