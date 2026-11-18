package org.espe.adapter;

import org.espe.decorator.IComputadora;

/** Ejemplo independiente de la integracion de pagos con Adapter. */
public final class DemoAdapter {
    private DemoAdapter() { }

    public static void main(String[] args) {
        IComputadora pedido = new IComputadora() {
            @Override public String getDescripcion() { return "Pedido de demostracion"; }
            @Override public double getPrecio() { return 950.00; }
        };
        IProcesadorPago procesador =
                new AdaptadorPagoAntiguo(new LibreriaBancoAntiguo());
        new ServicioCheckout(procesador).finalizarCompra(pedido);
    }
}