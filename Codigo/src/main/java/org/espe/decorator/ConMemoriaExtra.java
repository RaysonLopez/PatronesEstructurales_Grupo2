package org.espe.decorator;

/**
 * Agrega memoria RAM extra de 16 GB a una configuración existente.
 *
 * <p>Esta clase recibe una {@link IComputadora} ya creada. Al pedir la
 * descripción o el precio, primero obtiene el resultado de esa configuración
 * y luego agrega solamente lo correspondiente a la memoria RAM.</p>
 */
public class ConMemoriaExtra extends DecoradorComputadora {

    /** Costo adicional de la memoria RAM. */
    private static final double PRECIO_EXTRA = 80.00;

    /**
     * Crea una capa que añade memoria RAM a la configuración recibida.
     *
     * @param computadora configuración previa que se desea ampliar
     */
    public ConMemoriaExtra(IComputadora computadora) {
        super(computadora);
    }

    /**
     * Conserva la descripción previa y añade el nombre de la memoria RAM.
     *
     * @return descripción previa más el extra de memoria
     */
    @Override
    public String getDescripcion() {
        return computadora.getDescripcion() + " + Memoria RAM extra 16GB";
    }

    /**
     * Conserva el precio previo y suma el costo de la memoria RAM.
     *
     * @return precio previo más {@value #PRECIO_EXTRA}
     */
    @Override
    public double getPrecio() {
        return computadora.getPrecio() + PRECIO_EXTRA;
    }
}
