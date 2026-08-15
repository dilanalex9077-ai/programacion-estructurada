# Programación Estructurada

Colección de ejercicios académicos desarrollados en Java para practicar vectores, ciclos, métodos, búsquedas y operaciones con arreglos.

## Colección de ciclos

El documento [`ejercicios-ciclos-java.pdf`](documentacion/ejercicios-ciclos-java.pdf) reúne 34 ejercicios realizados en Java:

- 7 ejercicios con ciclo `for`.
- 8 ejercicios con ciclo `while`.
- 3 ejercicios con ciclo `do-while`.
- 16 ejercicios de elección libre del tipo de ciclo.

Los ejemplos incluyen promedios, tablas de multiplicar, descuentos, salarios, clasificación de datos, sucesiones, factoriales, números primos, máximos, mínimos y series matemáticas.

Los ejercicios están separados uno por uno dentro de [`src/ejercicios`](src/ejercicios), organizados por tipo de ciclo:

- [`ciclo_for`](src/ejercicios/ciclo_for): 7 archivos.
- [`ciclo_while`](src/ejercicios/ciclo_while): 8 archivos.
- [`ciclo_do_while`](src/ejercicios/ciclo_do_while): 3 archivos.
- [`ciclo_libre`](src/ejercicios/ciclo_libre): 16 archivos.

Las implementaciones reutilizables y verificadas también se conservan en [`src/ciclos`](src/ciclos).

## Ejercicios incluidos

### Ejercicio 4: búsqueda en un vector

Lee los elementos de un vector y un número a buscar. El programa muestra la posición del número o informa que no fue encontrado.

### Ejercicio 5: multiplicación inversa de vectores

Genera aleatoriamente dos vectores `A` y `B`. Después multiplica el primer elemento de `A` por el último de `B`, el segundo de `A` por el penúltimo de `B` y así sucesivamente. Cada resultado se almacena en el vector `C`.

## Tecnologías y conceptos

- Java
- Programación estructurada
- Vectores y arreglos
- Ciclos `for` y `do-while`
- Métodos
- Búsqueda lineal
- Generación de números aleatorios

## Ejecución

Desde la raíz del repositorio:

```powershell
javac -d out src\Ejercicio4BuscarNumero.java src\Ejercicio5MultiplicarVectores.java
java -cp out Ejercicio4BuscarNumero
java -cp out Ejercicio5MultiplicarVectores
```

## Autor

Dilan Alejandro Martínez Mercado  
Universidad Tecnológica de Tula-Tepeji
