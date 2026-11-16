package org.espe.decorator;

/**
 * Decorador concreto que agrega un disco SSD de 1 TB.
 */
public class ConDiscoSsd extends DecoradorComputadora {

    private static final double PRECIO_EXTRA = 120.00;

    /**
     * Envuelve una computadora y le agrega un disco SSD.
     *
     * @param computadora computadora que recibirá el extra
     */
    public ConDiscoSsd(IComputadora computadora) {
        super(computadora);
    }

    @Override
    public String getDescripcion() {
        return computadora.getDescripcion() + " + Disco SSD 1TB";
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
