# Patrones Estructurales: Adapter y Decorator

Presentación del **Grupo 2** para la asignatura **Aplicaciones Distribuidas**, exposición sobre patrones de diseño estructurales.

Archivo: `Patrones_Estructurales_Grupo2.pptx` (22 diapositivas, formato 16:9, editable en PowerPoint o Google Slides).

## Integrantes

- Melanie Reimundo
- Nicole Carvajal
- Rayson López
- Mateo Salvador
- Sebastián Quinga
- David Ramos

## Objetivo

Explicar de forma sencilla y visual dos patrones estructurales de la programación orientada a objetos, para que cualquier estudiante que esté aprendiendo POO entienda qué son, cómo funcionan, cuándo usarlos y cuáles son sus ventajas y límites.

| Patrón | Idea clave | Analogía | Ejemplo del grupo |
| --- | --- | --- | --- |
| Adapter | Traduce, no modifica | Enchufe de viaje | Tienda en línea que cobra a través de un banco antiguo |
| Decorator | Envuelve, no modifica | Café con ingredientes extra | Computadora básica con memoria extra y tarjeta gráfica |

## Estructura de la presentación

| N.º | Diapositiva | Contenido |
| --- | --- | --- |
| 1 | Portada del grupo | Tema, integrantes y las dos partes |
| **Parte 1** | **Adapter** | |
| 2 | Portada de Adapter | Sistema moderno → Adapter → sistema antiguo |
| 3 | ¿Qué es Adapter? | Explicación sencilla, definición técnica y propósito |
| 4 | Analogía: el enchufe de viaje | Cargador, adaptador y tomacorriente (fotos reales) |
| 5 | ¿Cuándo usar Adapter? | Cuatro situaciones y ejemplo app móvil / sistema de 2005 |
| 6 | Ventajas | Cinco ventajas y el principio Abierto/Cerrado (SOLID) |
| 7 | Límites y desventajas | Un adaptador contra muchas capas |
| 8 | Ejercicio del grupo | E-commerce y pasarela de pago |
| 9 | ¿Cómo funciona por dentro? | Piezas del patrón y recorrido de un cobro de 100 USD |
| 10 | Idea clave | "Traduce, no modifica" |
| **Parte 2** | **Decorator** | |
| 11 | Portada de Decorator | Un objeto envuelto por capas de funcionalidades |
| 12 | ¿Qué es Decorator? | Explicación sencilla (funda del celular) y definición técnica |
| 13 | Analogía: la cafetería | Café básico → con leche → con chocolate → completo |
| 14 | ¿Cuándo usar Decorator? | Cuatro situaciones; 8 subclases contra 4 clases |
| 15 | Ventajas | Cuatro ventajas y el principio Abierto/Cerrado (SOLID) |
| 16 | Límites y desventajas | Demasiadas capas esconden el objeto original |
| 17 | Ejemplo: la computadora | $500 base + memoria + tarjeta gráfica = $800 |
| 18 | Idea clave | "Envolver, no modificar" |
| 19 | ¿Cómo funciona por dentro? | Piezas del patrón y recorrido de `precio()` |
| **Parte 3** | **Diagramas UML** | |
| 20 | Diagrama de casos de uso | Operador y los 7 casos de uso del simulador e-commerce («include») |
| 21 | Diagrama de clases | 11 clases: Adapter (azul) y Decorator (verde) con sus relaciones |
| 22 | Diagrama de secuencia | Cálculo del precio (500 → 950 USD) y cobro con el banco antiguo |

## Diagramas UML

Los diagramas describen el simulador de e-commerce que implementa el grupo, donde los dos patrones trabajan juntos:

- **Decorator** arma la computadora por capas: `ComputadoraBasica` (500.00) envuelta por `ConTarjetaGrafica` (+250.00), `ConMemoriaExtra` (+80.00) y `ConDiscoSsd` (+120.00). Total: 950.0 USD.
- **Adapter** cobra ese total: `ServicioCheckout` usa la interfaz `IProcesadorPago`, y `AdaptadorPagoAntiguo` traduce la llamada `cobrar(total)` a `chargeAccountWithCurrency(total, "USD")` de `LibreriaBancoAntiguo`.
- El banco devuelve un código (`0` aprobado, `51` rechazado) y el adaptador lo convierte en `boolean`. En la demostración el banco devuelve `0`, así que se imprime "Pago APROBADO".

Los diagramas están dibujados con formas de PowerPoint, así que se pueden editar. En el diagrama de clases, las clases concretas de Decorator muestran solo el precio extra y los métodos principales.

## Cómo usar la presentación

- **Notas del orador:** cada diapositiva trae en sus notas un guion con lo que se debe explicar. En PowerPoint se ven en *Vista > Página de notas* o en el modo Moderador.
- **Duración estimada:** unos 9 minutos por parte, entre 1 y 1,5 minutos por diapositiva.
- **Exposición:** las partes 1 y 2 cubren la teoría y la parte 3 los diagramas UML. La implementación en Java la presentan los integrantes responsables del código.
- **Tipografía:** Arial y Courier New, para que se vea igual en cualquier computadora.

## Créditos de imágenes

- Fotos de la analogía del enchufe (diapositiva 4): Wikimedia Commons · "Samsung Travel Adapter 3" (CC BY-SA 4.0) · "AC Converter Adapter USA-EU" y "Small-outline Schuko socket module 01" (CC0).
- Íconos: Font Awesome (vía react-icons).
- Diagramas, ilustraciones y diagramas UML: elaboración propia del Grupo 2.

## Referencias

- Freeman, E., y Robson, E. (2020). *Head First Design Patterns* (2.ª ed.). O'Reilly Media.
- Gamma, E., Helm, R., Johnson, R., y Vlissides, J. (1994). *Design patterns: Elements of reusable object-oriented software*. Addison-Wesley.
- Martin, R. C. (2014, 12 de mayo). *The Open Closed Principle*. The Clean Code Blog. https://blog.cleancoder.com/uncle-bob/2014/05/12/TheOpenClosedPrinciple.html
- Meyer, B. (1988). *Object-oriented software construction*. Prentice Hall.
- Refactoring.Guru. (s. f.). *Decorator*. https://refactoring.guru/design-patterns/decorator
- Shalloway, A., y Trott, J. R. (2001). *Design patterns explained: A new perspective on object-oriented design*. Addison-Wesley.
