# Patrones Estructurales Grupo 2

Repositorio de trabajo para la exposición de Aplicaciones Distribuidas sobre los patrones estructurales **Adapter** y **Decorator**.

## Escenario práctico

El proyecto demostrará dos casos de e-commerce:

- **Adapter:** integración de una aplicación web moderna con una librería bancaria heredada. El adaptador traducirá `cobrar(monto)` a `chargeAccountWithCurrency(amount, currency)`.
- **Decorator:** configuración dinámica de una computadora base de $500 mediante extras como memoria adicional y tarjeta gráfica, sin crear una subclase por cada combinación.

## Estructura del repositorio

- [`Codigo/`](Codigo/README.md): implementación Java y pruebas de consola.
- [`Documentacion/`](Documentacion/README.md): diagramas UML y material de apoyo técnico.
- [`Presentacion/`](Presentacion/README.md): diapositivas y guion de la exposición.

## Integrantes y roles

Completar antes de la entrega:

| Integrante | Rol | Responsabilidad |
| --- | --- | --- |
| Estudiante 1 | Teoría | Adapter y analogía del adaptador de enchufe. |
| Estudiante 2 | Teoría | Decorator y analogía de extras para café. |
| Estudiante 3 | Análisis | UML y escenario de integración legacy. |
| Estudiante 4 | Análisis | UML y relación con OCP y DIP. |
| Estudiante 5 | Desarrollo | Live coding del Adapter. |
| Estudiante 6 | Desarrollo | Live coding del Decorator. |

## Ejecución

Las instrucciones definitivas para compilar y ejecutar `Principal.java` se documentarán cuando se cree el proyecto Java en [`Codigo/`](Codigo/README.md).

## Evidencia de colaboración

Cada integrante debe trabajar desde una rama propia y realizar commits descriptivos. Ejemplos: `feat: agrega adaptador de pago antiguo` y `feat: implementa decorador de memoria extra`.
