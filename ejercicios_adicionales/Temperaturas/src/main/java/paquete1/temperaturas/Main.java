package paquete1.temperaturas;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Invierno invierno = new Invierno(5);

        System.out.println("Valores del array de temperaturas: " + invierno.mostrar());

        System.out.println("Temperatura media: " + invierno.temp_media());

        double[] fahrenheit = invierno.fahrenheit();
        System.out.println("Temperaturas en grados Fahrenheit: " + Arrays.toString(fahrenheit));
    }
}
