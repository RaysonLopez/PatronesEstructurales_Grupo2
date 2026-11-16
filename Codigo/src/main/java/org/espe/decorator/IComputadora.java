package org.espe.decorator;

/**
 * Componente del patrón Decorator.
 *
 * <p>Define el contrato común para la computadora base y para cada extra que
 * pueda envolverla. Esto permite combinar configuraciones sin depender de una
 * clase concreta.</p>
 */
public interface IComputadora {

    /**
     * Obtiene la descripción completa de la configuración.
     *
     * @return descripción de la computadora y sus extras
     */
    String getDescripcion();

    /**
     * Obtiene el precio total de la configuración.
     *
     * @return precio total en dólares estadounidenses
     */
    double getPrecio();
}
