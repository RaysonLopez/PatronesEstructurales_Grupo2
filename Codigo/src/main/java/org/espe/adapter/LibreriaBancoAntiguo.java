package org.espe.adapter;

import java.util.Locale;

/**
 * Adaptee del patron Adapter.
 * Simula una libreria legacy del banco que NO podemos modificar.
 * Su API es incompatible: otro nombre de metodo, exige la moneda
 * y devuelve un codigo numerico en lugar de un boolean.
 */
public class LibreriaBancoAntiguo {

    public static final int CODIGO_APROBADO = 0;
    public static final int CODIGO_RECHAZADO = 51;

    public int chargeAccountWithCurrency(double amount, String currency) {
        System.out.printf(Locale.US, "   [BANCO LEGACY] chargeAccountWithCurrency(%.2f, \"%s\")%n", amount, currency);
        if (amount <= 0) {
            return CODIGO_RECHAZADO;
        }
        return CODIGO_APROBADO;
    }
}
