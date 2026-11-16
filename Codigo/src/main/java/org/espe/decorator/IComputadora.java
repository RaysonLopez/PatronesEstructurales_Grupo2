package org.espe.decorator;

/**
 * Component del patron Decorator.
 * Contrato comun para la computadora base y todos sus extras.
 */
public interface IComputadora {

    String getDescripcion();

    double getPrecio();
}
