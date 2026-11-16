package org.espe.decorator;

/**
 * Componente concreto del patrón Decorator.
 * Representa la computadora inicial que puede envolverse con extras.
 */
public class ComputadoraBasica implements IComputadora {

    private static final double PRECIO_BASE = 500.00;

    /**
     * {@inheritDoc}
     */
    @Override
    public String getDescripcion() {
        return "Computadora basica";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getPrecio() {
        return PRECIO_BASE;
    }
}
