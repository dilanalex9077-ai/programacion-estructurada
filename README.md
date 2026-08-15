# Programación Estructurada en Java

Colección de 12 programas independientes para practicar lógica, ciclos, vectores, cadenas y matrices. Cada archivo incluye un método `main` y puede ejecutarse por separado.

## Ejercicios

| # | Programa | Conceptos |
|---|---|---|
| 01 | Promedio de calificaciones | Acumuladores y `for` |
| 02 | Tabla de multiplicar | Ciclo `for` |
| 03 | Número primo | Condiciones y divisores |
| 04 | Búsqueda en un vector | Búsqueda lineal |
| 05 | Multiplicación inversa de vectores | Arreglos e índices |
| 06 | Factorial | Validación y ciclos |
| 07 | Número mayor y menor | Comparaciones |
| 08 | Pares e impares | Módulo y contadores |
| 09 | Palíndromo | Cadenas de texto |
| 10 | Ordenamiento de un vector | Arreglos |
| 11 | Sucesión de Fibonacci | Acumuladores |
| 12 | Diagonal de una matriz | Ciclos anidados |

## Compilar

```powershell
New-Item -ItemType Directory -Path out -Force
javac -encoding UTF-8 -d out src\*.java
```

## Ejecutar

```powershell
java -cp out Ejercicio03NumeroPrimo
```

## Autor

Dilan Alejandro Martínez Mercado  
Universidad Tecnológica de Tula-Tepeji
