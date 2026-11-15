package ec.edu.espe.patrones.decorator;

/**
 * Concrete Decorator: agrega "Disco SSD 1TB" y suma $120.00 al precio.
 */
public class ConDiscoSsd extends DecoradorComputadora {

    private static final double PRECIO_EXTRA = 120.00;

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
