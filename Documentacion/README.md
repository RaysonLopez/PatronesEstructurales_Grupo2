# Documentación y diagramas

Esta carpeta reúne la documentación técnica y los diagramas UML que respaldan la exposición sobre los patrones estructurales **Adapter** y **Decorator**.

## Responsables

- Sebastian Daniel Quinga Pinto
- Christian David Ramos Alava

## Contenido

```text
Documentacion/
├── adapter/
│   ├── 01_Diagrama_Clases/
│   ├── 02_Diagrama_Casos_Uso/
│   └── 03_Diagrama_Secuencia/
├── decorator/
│   ├── 01_Diagrama_Clases/
│   ├── 02_Diagrama_Casos_Uso/
│   └── 03_Diagrama_Secuencia/
└── adapter_decorator/
    ├── 01_Diagrama_Clases/
    ├── 02_Diagrama_Casos_Uso/
    └── 03_Diagrama_Secuencia/
```

## Patrón Adapter

La documentación de `adapter/` explica cómo una interfaz moderna de pagos puede comunicarse con una librería bancaria heredada sin modificar ninguna de las dos.

- **Diagrama de clases:** muestra al cliente, la interfaz objetivo, el adaptador y la clase heredada.
- **Diagrama de casos de uso:** representa el proceso de cobro desde la perspectiva del usuario y del sistema.
- **Diagrama de secuencia:** detalla la traducción de `cobrar(monto)` hacia la operación bancaria antigua y el retorno del resultado.

## Patrón Decorator

La documentación de `decorator/` explica cómo se construye una computadora configurable agregando extras sobre una computadora base.

- **Diagrama de clases:** presenta el componente, la computadora base, el decorador abstracto y los decoradores concretos.
- **Diagrama de casos de uso:** representa la configuración de una computadora con componentes adicionales.
- **Diagrama de secuencia:** muestra cómo cada decorador delega y suma su comportamiento al objeto que envuelve.

## Diagramas combinados

La carpeta `adapter_decorator/` contiene diagramas de apoyo que permiten relacionar ambos patrones dentro del mismo escenario de compra: configurar un equipo y procesar su pago.

## Uso en la exposición

Los diagramas sirven como evidencia visual de la arquitectura explicada en el código. Se pueden insertar directamente en la presentación y usar para explicar participantes, responsabilidades, relaciones y flujo de ejecución de cada patrón.
