package org.espe.adapter;
/**
 * Target del patron Adapter.
 * Es la interfaz moderna que conoce nuestro sistema web.
 */
public interface IProcesadorPago {
    boolean cobrar(double monto);
}
