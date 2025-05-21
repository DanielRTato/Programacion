# Apuntes para Examen de Programación - Colecciones en Java

## 1. Tipos de Colecciones
- **Interfaces principales**:
    - `Iterable<E>`: Permite iterar sobre elementos (uso de `for-each`).
    - `Collection<E>`: Raíz de colecciones (excepto `Map`). Métodos comunes como `add`, `remove`, `size`.
    - `List<E>`: Colección ordenada que permite duplicados. Acceso posicional (`get`, `set`).
    - `Set<E>`: Colección sin duplicados. No tiene acceso posicional.
    - `Map<K,V>`: Pares clave-valor. No hereda de `Collection`.

---

## 2. List<E>
- **Características**:
    - Hereda de `Collection<E>`.
    - Permite duplicados y acceso posicional.
    - Métodos útiles: `indexOf`, `lastIndexOf`, `subList`.

- **Implementaciones comunes**:
    - `ArrayList<E>`: Tamaño dinámico, acceso rápido (O(1)). No sincronizada.
    - `LinkedList<E>`: Ideal para colas (`Queue`) o pilas (`Deque`). Inserción/eliminación rápida.
    - `Vector<E>`: Sincronizada (legacy, menos recomendada).

- **Creación**:
    - `List.of(...)`: Lista no modificable (Java 9+).
    - `Arrays.asList(...)`: Lista de tamaño fijo (modificable pero no extensible).

---

## 3. Set<E>
- **Características**:
    - Sin duplicados. Máximo un elemento `null`.
    - No acceso posicional.
    - `equals` compara elementos, no orden.

- **Implementaciones**:
    - `HashSet<E>`: Basado en tabla hash (O(1)). Sin orden.
    - `LinkedHashSet<E>`: Mantiene orden de inserción. Rendimiento similar a `HashSet`.
    - `TreeSet<E>`: Orden natural (requiere `Comparable`). Operaciones en O(log n).

- **Operaciones útiles**:
    - `TreeSet`: `first()`, `last()`, `subSet()`, `descendingIterator()`.

---

## 4. Map<K,V>
- **Características**:
    - Pares clave-valor. Claves únicas, valores pueden repetirse.
    - Permite una clave `null` y múltiples valores `null`.

- **Implementaciones**:
    - `HashMap<K,V>`: Tabla hash (O(1)). Sin orden.
    - `LinkedHashMap<K,V>`: Orden de inserción.
    - `TreeMap<K,V>`: Orden natural de claves (requiere `Comparable`).

- **Métodos clave**:
    - Añadir: `put`, `putIfAbsent`.
    - Consultar: `get`, `getOrDefault`.
    - Recorrer: `keySet()`, `values()`, `entrySet()`.

---

## 5. Comparación en Java
- **Interfaces**:
    - `Comparable<T>`: Orden natural (`compareTo`).
    - `Comparator<T>`: Orden personalizado (`compare`).

- **Uso en colecciones**:
    - `TreeSet` y `TreeMap` requieren `Comparable` o `Comparator` para ordenar.

---

## 6. Resumen de Elección de Colecciones
| **Criterio**               | **List**       | **Set**        | **Map**        |
|----------------------------|---------------|---------------|---------------|
| Duplicados                 | Sí            | No            | Claves únicas |
| Orden                      | Inserción     | Hash/Inserción/Natural | Hash/Inserción/Natural |
| Acceso posicional          | Sí            | No            | No (por clave) |
| Implementaciones comunes   | `ArrayList`, `LinkedList` | `HashSet`, `TreeSet` | `HashMap`, `TreeMap` |

---

## 7. Ejemplos de Código
```java
// List
List<String> lista = new ArrayList<>();
lista.add("A");
String elemento = lista.get(0);

// Set
Set<Integer> conjunto = new HashSet<>();
conjunto.add(1);
boolean existe = conjunto.contains(1);

// Map
Map<String, Integer> mapa = new HashMap<>();
mapa.put("clave", 10);
int valor = mapa.get("clave");