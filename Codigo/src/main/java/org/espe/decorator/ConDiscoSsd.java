package org.espe.decorator;

/**
 * Agrega un disco SSD de 1 TB a una configuración existente.
 *
 * <p>Esta capa puede envolver una computadora básica o una que ya tenga otros
 * extras. Por eso no necesita saber qué extras se agregaron antes: consulta el
 * resultado del objeto interno y añade únicamente el disco SSD.</p>
 */
public class ConDiscoSsd extends DecoradorComputadora {

    /** Costo adicional del disco SSD de 1 TB. */
    private static final double PRECIO_EXTRA = 120.00;

    /**
     * Crea una capa que añade un disco SSD a la configuración recibida.
     *
     * @param computadora configuración previa que se desea ampliar
     */
    public ConDiscoSsd(IComputadora computadora) {
        super(computadora);
    }

    /**
     * Conserva la descripción previa y añade el nombre del disco SSD.
     *
     * @return descripción previa más el disco SSD
     */
    @Override
    public String getDescripcion() {
        return computadora.getDescripcion() + " + Disco SSD 1TB";
    }

    /**
     * Conserva el precio previo y suma el costo del disco SSD.
     *
     * @return precio previo más {@value #PRECIO_EXTRA}
     */
    @Override
    public double getPrecio() {
        return computadora.getPrecio() + PRECIO_EXTRA;
    }
}
