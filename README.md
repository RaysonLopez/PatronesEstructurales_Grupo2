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

| Integrante | Rol | Responsabilidad |
| --- | --- | --- |
| Melanie Brigith Reimundo Llumiquinga | Teoría y analogías | Adapter y analogía del adaptador de enchufe. |
| Cristina Nicole Carvajal Lozada | Teoría y analogías | Decorator y analogía de extras para café. |
| Sebastian Daniel Quinga Pinto | Análisis de arquitectura | UML de Adapter e integración con sistemas legacy. |
| Christian David Ramos Alava | Análisis de arquitectura | UML de Decorator y relación con OCP. |
| Rayson Steve Lopez de la Cruz | Desarrollo y live coding | Implementación del Adapter: pasarela de pago. |
| Mateo Orlando Salvador Tulcan | Desarrollo y live coding | Implementación del Decorator: computadora configurable. |

## Ejecución

Las instrucciones definitivas para compilar y ejecutar `Principal.java` se documentarán cuando se cree el proyecto Java en [`Codigo/`](Codigo/README.md).

## Evidencia de colaboración

Cada integrante debe trabajar desde una rama propia y realizar commits descriptivos. Ejemplos: `feat: agrega adaptador de pago antiguo` y `feat: implementa decorador de memoria extra`.
