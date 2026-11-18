# Código — Patrones Estructurales, Grupo 2

Esta carpeta contiene la implementación en Java de los patrones estructurales **Decorator** y **Adapter** para la asignatura de Aplicaciones Distribuidas.

El proyecto usa Maven, Java 21 y el paquete base `org.espe`.

## Autores

- Rayson Steve Lopez de la Cruz
- Mateo Orlando Salvador Tulcan

## Objetivo

Se muestran dos situaciones prácticas:

- **Decorator:** construir una computadora configurable añadiendo componentes sin crear una subclase por cada combinación posible.
- **Adapter:** permitir que el sistema de compras use una interfaz moderna de pagos mientras internamente se comunica con una librería bancaria heredada.

## Requisitos

- JDK 21 o superior.
- Maven 3.9 o superior, o el Maven Wrapper incluido en el proyecto.

## Compilar y ejecutar

Desde esta carpeta (`Codigo`):

```powershell
./mvnw.cmd compile
```

También se puede usar Maven instalado en el sistema:

```powershell
mvn compile
```

### Demostración de Decorator

```powershell
java -cp target/classes org.espe.Main
```

La salida muestra tres configuraciones: una computadora básica, una computadora gamer con GPU y RAM, y una computadora completa con SSD.

### Demostración de Adapter

```powershell
java -cp target/classes org.espe.adapter.DemoAdapter
```

La salida muestra el total del pedido, la traducción realizada por el adaptador y la respuesta de la librería bancaria antigua.

## Estructura

```text
Codigo/
├── pom.xml
└── src/main/java/org/espe/
    ├── Main.java
    ├── adapter/
    │   ├── IProcesadorPago.java
    │   ├── AdaptadorPagoAntiguo.java
    │   ├── LibreriaBancoAntiguo.java
    │   ├── ServicioCheckout.java
    │   └── DemoAdapter.java
    └── decorator/
        ├── IComputadora.java
        ├── ComputadoraBasica.java
        ├── DecoradorComputadora.java
        ├── ConTarjetaGrafica.java
        ├── ConMemoriaExtra.java
        └── ConDiscoSsd.java
```

## Patrón Decorator

`IComputadora` es el contrato común. Toda computadora, básica o decorada, ofrece:

```java
String getDescripcion();
double getPrecio();
```

| Elemento | Responsabilidad |
| --- | --- |
| `IComputadora` | Componente común que define descripción y precio. |
| `ComputadoraBasica` | Componente concreto inicial: representa la computadora sin extras. |
| `DecoradorComputadora` | Decorador abstracto: conserva una referencia a otra `IComputadora` y delega el comportamiento base. |
| `ConTarjetaGrafica` | Añade la tarjeta gráfica RTX y su costo. |
| `ConMemoriaExtra` | Añade memoria RAM adicional y su costo. |
| `ConDiscoSsd` | Añade un disco SSD y su costo. |
| `Main` | Cliente que crea y muestra configuraciones de ejemplo. |

Ejemplo de composición:

```java
IComputadora completa = new ConDiscoSsd(
        new ConMemoriaExtra(
                new ConTarjetaGrafica(
                        new ComputadoraBasica())));
```

Al invocar `getPrecio()`, cada capa consulta a la computadora que envuelve y suma únicamente su costo adicional. Por ello se pueden agregar o retirar extras sin modificar `ComputadoraBasica` ni crear clases como `ComputadoraConRamYDiscoYGpu`.

## Patrón Adapter

El sistema nuevo espera trabajar con la interfaz `IProcesadorPago`, que ofrece el método:

```java
boolean cobrar(double monto);
```

Sin embargo, el banco heredado usa otro contrato:

```java
int chargeAccountWithCurrency(double amount, String currency);
```

`AdaptadorPagoAntiguo` implementa la interfaz moderna y contiene una instancia de `LibreriaBancoAntiguo`. Su trabajo es traducir la llamada de pago y convertir el código del banco en un resultado booleano.

Flujo de la compra:

```text
ServicioCheckout
      │ cobrar(total)
      ▼
IProcesadorPago
      │ implementación concreta
      ▼
AdaptadorPagoAntiguo
      │ chargeAccountWithCurrency(total, "USD")
      ▼
LibreriaBancoAntiguo
      │ código de aprobación o rechazo
      ▼
AdaptadorPagoAntiguo → true / false
```

| Elemento | Responsabilidad |
| --- | --- |
| `IProcesadorPago` | Interfaz objetivo que conoce el sistema moderno. |
| `LibreriaBancoAntiguo` | Servicio heredado con una API incompatible. |
| `AdaptadorPagoAntiguo` | Adaptador que traduce el contrato moderno al heredado. |
| `ServicioCheckout` | Cliente que finaliza una compra sin depender de la librería antigua. |
| `DemoAdapter` | Punto de entrada para probar la integración. |

## Principios aplicados

- **Open/Closed Principle:** los extras de una computadora se añaden con nuevos decoradores, sin editar las clases existentes.
- **Dependency Inversion Principle:** `ServicioCheckout` depende de `IProcesadorPago`, no de la librería bancaria concreta.
- **Composición sobre herencia:** ambos patrones usan referencias a objetos para extender o adaptar comportamientos.

