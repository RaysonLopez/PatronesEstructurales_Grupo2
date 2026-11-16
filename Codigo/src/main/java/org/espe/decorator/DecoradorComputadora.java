package org.espe.decorator;

import java.util.Objects;

/**
 * Decorador abstracto del patrón Decorator.
 *
 * <p>Implementa el mismo contrato que una computadora y conserva una
 * computadora envuelta a la que delega el comportamiento base. Los
 * decoradores concretos extienden la descripción y el precio.</p>
 */
public abstract class DecoradorComputadora implements IComputadora {

    protected final IComputadora computadora;

    /**
     * Crea un decorador para una computadora existente.
     *
     * @param computadora computadora que se va a envolver
     * @throws NullPointerException si {@code computadora} es nula
     */
    protected DecoradorComputadora(IComputadora computadora) {
        this.computadora = Objects.requireNonNull(
                computadora,
                "La computadora a decorar no puede ser nula");
    }

    /**
     * {@inheritDoc}
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
    /**
     * {@inheritDoc}
     */
