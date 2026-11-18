package org.espe.adapter;

import java.util.Locale;

/**
 * Adapter del patron Adapter.
 * Implementa la interfaz moderna (IProcesadorPago) y por dentro
 * traduce cada llamada a la API antigua del banco.
 */
public class AdaptadorPagoAntiguo implements IProcesadorPago {

    private static final String MONEDA_POR_DEFECTO = "USD";

    private final LibreriaBancoAntiguo libreriaBanco;

    public AdaptadorPagoAntiguo(LibreriaBancoAntiguo libreriaBanco) {
        this.libreriaBanco = libreriaBanco;
    }

    @Override
    public boolean cobrar(double monto) {
        System.out.printf(Locale.US, "   [ADAPTADOR] Traduciendo cobrar(%.2f) a la API antigua...%n", monto);
        int codigoRespuesta = libreriaBanco.chargeAccountWithCurrency(monto, MONEDA_POR_DEFECTO);
        return codigoRespuesta == LibreriaBancoAntiguo.CODIGO_APROBADO;
    }
}
