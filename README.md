# Máquina Virtual Java - Simulador de ByteCode 🖥️

Un simulador educativo de máquina virtual desarrollado en Java que permite entender los conceptos básicos de programación orientada a objetos, manipulación de estructuras de datos y ejecución de bytecode.

## 📝 Descripción

Este proyecto implementa una máquina virtual simplificada que ejecuta un conjunto básico de instrucciones bytecode. La máquina virtual está diseñada con fines educativos para comprender:
- Programación Orientada a Objetos en Java
- Manipulación de Arrays y Enumerados
- Operaciones con la clase String
- Entrada/Salida por consola
- Funcionamiento básico de una máquina virtual
- Gestión de pilas y memoria

### Componentes Principales

1. **Memoria de Datos**: Almacena valores durante la ejecución del programa
2. **Pila de Operandos**: Gestiona las operaciones y almacena resultados temporales
3. **Conjunto de Instrucciones ByteCode**: Implementa operaciones básicas de programación

## 🔧 Características

### Comandos Disponibles

- `.HELP`: Muestra información sobre los comandos disponibles
- `.QUIT`: Cierra la aplicación
- `.NEWINST BC`: Añade una nueva instrucción bytecode al programa actual
- `.RUN`: Ejecuta el programa actual
- `.RESET`: Inicializa el programa, eliminando todas las instrucciones
- `.REPLACE n`: Reemplaza la instrucción n del programa por una nueva

### Instrucciones ByteCode Soportadas

| Instrucción | Descripción |
|-------------|-------------|
| `PUSH n`    | Apila el entero n en la pila de operandos |
| `LOAD pos`  | Lee el valor de la memoria en posición pos y lo apila |
| `STORE pos` | Guarda el valor de la cima de la pila en la memoria |
| `ADD`       | Suma los dos valores superiores de la pila |
| `SUB`       | Resta los dos valores superiores de la pila |
| `MUL`       | Multiplica los dos valores superiores de la pila |
| `DIV`       | Divide los dos valores superiores de la pila |
| `OUT`       | Muestra el valor en la cima de la pila |
| `HALT`      | Detiene la ejecución del programa |



## 💻 Ejemplo de Uso

```
> .NEWINST PUSH 5
Programa actual: [PUSH 5]

> .NEWINST PUSH 3
Programa actual: [PUSH 5, PUSH 3]

> .NEWINST ADD
Programa actual: [PUSH 5, PUSH 3, ADD]

> .RUN 
Estado de la máquina:
  Pila: [5]
  Pila: [5, 3]
  Pila: [8]
```

## 🎓 Valor Educativo

Este proyecto es ideal para aprender:
- Conceptos básicos de compiladores y máquinas virtuales
- Estructuras de datos (pilas, arrays)
- Programación orientada a objetos
- Manejo de excepciones
- Entrada/salida por consola
- Parsing de comandos
- Testing y depuración

## 🛠️ Requisitos Técnicos

- Java Development Kit (JDK) 8 o superior
- Entorno de desarrollo Java (recomendado: Eclipse, IntelliJ IDEA, o NetBeans)
- Conocimientos básicos de programación en Java

## 📚 Documentación

El código fuente está completamente documentado con JavaDoc, incluyendo:
- Descripción de cada clase y método
- Ejemplos de uso
- Manejo de errores
- Casos especiales



## ⚠️ Limitaciones Conocidas

- La memoria tiene un tamaño fijo
- No soporta operaciones con punto flotante
- Conjunto limitado de instrucciones bytecode


## ✍️ Autores
 Mayra



---










