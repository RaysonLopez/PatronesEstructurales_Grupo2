package org.espe;

import java.util.Locale;
import org.espe.decorator.ComputadoraBasica;
import org.espe.decorator.ConDiscoSsd;
import org.espe.decorator.ConMemoriaExtra;
import org.espe.decorator.ConTarjetaGrafica;
import org.espe.decorator.IComputadora;

/**
 * Punto de entrada que ejecuta una demostración del patrón Decorator.
 *
 * <p>El método principal crea una computadora básica y después construye otras
 * configuraciones envolviéndola con extras. La variable sigue teniendo el tipo
 * {@link IComputadora} en todos los casos, aunque el objeto real tenga varias
 * capas. Esto permite usar las tres configuraciones con los mismos métodos.</p>
 */
public class Main {

    /**
     * Construye y muestra tres configuraciones.
     *
     * <p>La primera no tiene extras. La segunda añade tarjeta gráfica y RAM.
     * La tercera usa la configuración gamer como base y añade un SSD. Cada
     * llamada a {@code getPrecio()} recorre las capas internas para sumar el
     * costo de todos los extras.</p>
     *
     * @param args argumentos de línea de comandos no utilizados
     */
    public static void main(String[] args) {
        IComputadora basica = new ComputadoraBasica();
        IComputadora gamer = new ConMemoriaExtra(
                new ConTarjetaGrafica(new ComputadoraBasica()));
        IComputadora completa = new ConDiscoSsd(gamer);

        System.out.println("=== DEMOSTRACIÓN DEL PATRÓN DECORATOR ===");
        mostrarConfiguracion("Computadora básica", basica);
        mostrarConfiguracion("Computadora gamer", gamer);
        mostrarConfiguracion("Computadora completa", completa);
    }

    /**
     * Imprime la descripción y el precio de cualquier configuración.
     *
     * <p>El método depende de la interfaz y no de una clase concreta. Por eso
     * puede recibir una computadora básica o una computadora decorada sin
     * cambiar su lógica.</p>
     *
     * @param nombre título que se muestra antes de la configuración
     * @param computadora configuración cuyo resultado se desea mostrar
     */
    private static void mostrarConfiguracion(String nombre, IComputadora computadora) {
        System.out.printf("%n%s%n", nombre);
        System.out.printf("Descripción: %s%n", computadora.getDescripcion());
        System.out.printf(Locale.US, "Precio: $%.2f%n", computadora.getPrecio());
    }
}
