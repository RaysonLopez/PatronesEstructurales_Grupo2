package org.espe.decorator;

/**
 * Representa la computadora inicial, antes de agregar extras.
 *
 * <p>Esta clase es la capa más interna del patrón Decorator. Solo conoce su
 * nombre y su precio base. No contiene condiciones para RAM, SSD o tarjeta
 * gráfica; esos cambios se realizan mediante clases separadas que la envuelven.
 * Así la clase permanece simple aunque aparezcan nuevos extras.</p>
 */
public class ComputadoraBasica implements IComputadora {

    /** Precio de la computadora sin extras. */
    private static final double PRECIO_BASE = 500.00;

    /**
     * Devuelve el nombre de la configuración inicial.
     *
     * @return {@code "Computadora basica"}
     */
    @Override
    public String getDescripcion() {
        return "Computadora basica";
    }

    /**
     * Devuelve el precio inicial. Los decoradores suman sus costos sobre este
     * valor, pero esta clase nunca calcula extras.
     *
     * @return {@value #PRECIO_BASE}
     */
    @Override
    public double getPrecio() {
        return PRECIO_BASE;
    }
}
