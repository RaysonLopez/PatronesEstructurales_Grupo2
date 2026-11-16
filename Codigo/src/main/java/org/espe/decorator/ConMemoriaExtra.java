package org.espe.decorator;

/**
 * Decorador concreto que agrega memoria RAM extra de 16 GB.
 */
public class ConMemoriaExtra extends DecoradorComputadora {

    private static final double PRECIO_EXTRA = 80.00;

    /**
     * Envuelve una computadora y le agrega memoria RAM extra.
     *
     * @param computadora computadora que recibirá el extra
     */
    public ConMemoriaExtra(IComputadora computadora) {
        super(computadora);
    }

    @Override
    public String getDescripcion() {
        return computadora.getDescripcion() + " + Memoria RAM extra 16GB";
    }

    @Override
    public double getPrecio() {
        return computadora.getPrecio() + PRECIO_EXTRA;
    }
}
    /**
     * {@inheritDoc}
     */
    /**
     * {@inheritDoc}
     */
