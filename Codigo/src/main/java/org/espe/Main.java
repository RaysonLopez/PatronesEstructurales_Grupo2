package org.espe;

import java.util.Locale;
import org.espe.decorator.ComputadoraBasica;
import org.espe.decorator.ConDiscoSsd;
import org.espe.decorator.ConMemoriaExtra;
import org.espe.decorator.ConTarjetaGrafica;
import org.espe.decorator.IComputadora;

/**
 * Punto de entrada para demostrar la composición dinámica del patrón Decorator.
 */
public class Main {

    /**
     * Construye configuraciones de computadora y muestra cómo cada decorador
     * agrega su comportamiento sin modificar la clase base.
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

    private static void mostrarConfiguracion(String nombre, IComputadora computadora) {
        System.out.printf("%n%s%n", nombre);
        System.out.printf("Descripción: %s%n", computadora.getDescripcion());
        System.out.printf(Locale.US, "Precio: $%.2f%n", computadora.getPrecio());
    }
}
