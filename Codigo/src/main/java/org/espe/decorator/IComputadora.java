package org.espe.decorator;

/**
 * Define las operaciones mínimas que una computadora configurable debe ofrecer.
 *
 * <p>Esta interfaz es el contrato común del módulo. Una computadora básica y
 * cada extra implementan los mismos métodos; por eso el programa puede usar
 * una sola variable de tipo {@code IComputadora} sin importar cuántos extras
 * tenga el objeto real.</p>
 *
 * <p>El patrón Decorator crea capas. Cada capa consulta el objeto que contiene,
 * añade su propia información y devuelve el resultado completo.</p>
 */
public interface IComputadora {

    /**
     * Obtiene un texto con la configuración actual.
     *
     * <p>La computadora básica entrega su nombre. Cada extra toma el texto
     * anterior y agrega el nombre del componente que representa.</p>
     *
     * @return descripción completa de la computadora y sus extras
     */
    String getDescripcion();

    /**
     * Calcula el precio total de la configuración.
     *
     * <p>La computadora básica devuelve su precio inicial. Cada extra consulta
     * ese precio, suma su costo y devuelve el nuevo total.</p>
     *
     * @return precio total en dólares estadounidenses
     */
    double getPrecio();
}
