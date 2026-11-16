package org.espe.decorator;

/**
 * Decorador concreto que agrega una tarjeta gráfica RTX.
 */
public class ConTarjetaGrafica extends DecoradorComputadora {

    private static final double PRECIO_EXTRA = 250.00;

    /**
     * Envuelve una computadora y le agrega una tarjeta gráfica.
     *
     * @param computadora computadora que recibirá el extra
     */
    public ConTarjetaGrafica(IComputadora computadora) {
        super(computadora);
    }

    @Override
    public String getDescripcion() {
        return computadora.getDescripcion() + " + Tarjeta grafica RTX";
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
