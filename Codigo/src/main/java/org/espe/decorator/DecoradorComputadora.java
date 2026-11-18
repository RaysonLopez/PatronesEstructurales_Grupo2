package org.espe.decorator;

import java.util.Objects;

/**
 * Clase base de todos los extras que se pueden añadir a una computadora.
 *
 * <p>Un decorador también es una {@link IComputadora}, pero guarda otra
 * computadora en el campo {@link #computadora}. Esa referencia contiene la
 * configuración creada hasta ese momento. Por ejemplo, la RAM puede contener
 * una tarjeta gráfica, y la tarjeta gráfica puede contener una computadora
 * básica.</p>
 *
 * <p>Esta clase delega las operaciones al objeto interno. Las subclases solo
 * sobrescriben lo necesario para sumar su nombre y su precio.</p>
 */
public abstract class DecoradorComputadora implements IComputadora {

    /** Configuración existente sobre la que se agrega un nuevo extra. */
    protected final IComputadora computadora;

    /**
     * Crea un decorador para una configuración existente.
     *
     * @param computadora configuración que se va a ampliar; no puede ser nula
     * @throws NullPointerException si {@code computadora} es nula, ya que no
     *         habría un objeto del cual obtener descripción y precio
     */
    protected DecoradorComputadora(IComputadora computadora) {
        this.computadora = Objects.requireNonNull(
                computadora,
                "La computadora a decorar no puede ser nula");
    }

    /**
     * Devuelve la descripción del objeto interno sin añadir cambios.
     * Las subclases toman este resultado y agregan la descripción de su extra.
     *
     * @return descripción de la configuración que está envuelta
     */
    /**
     * Devuelve el precio del objeto interno sin añadir cambios.
     * Las subclases toman este resultado y agregan el costo de su extra.
     *
     * @return precio de la configuración que está envuelta
     */
    @Override
    public String getDescripcion() {
        return computadora.getDescripcion();
    }

    @Override
    public double getPrecio() {
        return computadora.getPrecio();
    }
}
