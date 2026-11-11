# Código Java

Esta carpeta contendrá el proyecto Java ejecutable de la demostración. La clase de entrada será `Principal.java`.

## Pendiente de implementar

### Adapter de pago

- Definir una abstracción moderna de pago con el método `cobrar(monto)`.
- Crear la librería simulada del banco legado con `chargeAccountWithCurrency(amount, currency)`.
- Implementar `AdaptadorPagoAntiguo` para traducir la llamada moderna a la API antigua.
- Mostrar en consola el flujo completo de un pago.

### Decorator de computadora

- Crear el componente base `Computadora` y `ComputadoraBasica` con precio inicial de $500.
- Crear un decorador base que conserve la abstracción `Computadora`.
- Implementar los extras `ConMemoriaExtra` y `ConTarjetaGrafica`.
- Demostrar la composición dinámica y el cálculo automático del precio final.

## Criterios de código

- Mantener una clase por archivo y nombres Java en PascalCase para clases y camelCase para métodos.
- Aplicar OCP y DIP: depender de interfaces o abstracciones, no de implementaciones concretas.
- Ejecutar desde IntelliJ IDEA y documentar aquí el comando de compilación y ejecución final.
