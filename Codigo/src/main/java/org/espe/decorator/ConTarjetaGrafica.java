package org.espe.decorator;

/**
 * Agrega una tarjeta gráfica RTX a una configuración existente.
 *
 * <p>La clase conserva la computadora que recibe y no modifica su código.
 * Cuando se consulta el resultado, reutiliza el valor anterior y aporta el
 * nombre y costo de la tarjeta gráfica.</p>
 */
public class ConTarjetaGrafica extends DecoradorComputadora {

    /** Costo adicional de la tarjeta gráfica RTX. */
    private static final double PRECIO_EXTRA = 250.00;

    /**
     * Crea una capa que añade una tarjeta gráfica a la configuración recibida.
     *
     * @param computadora configuración previa que se desea ampliar
     */
    public ConTarjetaGrafica(IComputadora computadora) {
        super(computadora);
    }

    /**
     * Conserva la descripción previa y añade el nombre de la tarjeta gráfica.
     *
     * @return descripción previa más la tarjeta gráfica
     */
    @Override
    public String getDescripcion() {
        return computadora.getDescripcion() + " + Tarjeta grafica RTX";
    }

    /**
     * Conserva el precio previo y suma el costo de la tarjeta gráfica.
     *
     * @return precio previo más {@value #PRECIO_EXTRA}
     */
    @Override
    public double getPrecio() {
        return computadora.getPrecio() + PRECIO_EXTRA;
    }
}
