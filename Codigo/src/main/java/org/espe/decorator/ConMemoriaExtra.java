package ec.edu.espe.patrones.decorator;

/**
 * Concrete Decorator: agrega "Memoria RAM extra 16GB" y suma $80.00 al precio.
 */
public class ConMemoriaExtra extends DecoradorComputadora {

    private static final double PRECIO_EXTRA = 80.00;

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
