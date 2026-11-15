package ec.edu.espe.patrones.decorator;

/**
 * Concrete Component del patron Decorator.
 * Es el objeto base que vamos a "envolver" con extras.
 */
public class ComputadoraBasica implements IComputadora {

    private static final double PRECIO_BASE = 500.00;

    @Override
    public String getDescripcion() {
        return "Computadora basica";
    }

    @Override
    public double getPrecio() {
        return PRECIO_BASE;
    }
}
