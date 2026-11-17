package org.espe.adapter;

import java.util.Locale;
import org.espe.decorator.IComputadora;

/**
 * Client del patron Adapter.
 * Depende solo de la abstraccion IProcesadorPago (Principio DIP),
 * por eso no sabe ni le importa que detras haya una libreria antigua.
 */
public class ServicioCheckout {

    private final IProcesadorPago procesadorPago;

    public ServicioCheckout(IProcesadorPago procesadorPago) {
        this.procesadorPago = procesadorPago;
    }

    public void finalizarCompra(IComputadora computadora) {
        double total = computadora.getPrecio();
        System.out.printf(Locale.US, "   [CHECKOUT] Total a pagar: $%.2f%n", total);

        boolean aprobado = procesadorPago.cobrar(total);

        if (aprobado) {
            System.out.println("   [CHECKOUT] Pago APROBADO. Gracias por su compra.");
        } else {
            System.out.println("   [CHECKOUT] Pago RECHAZADO. Intente con otro metodo.");
        }
    }
}
