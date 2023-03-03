package paquete1.temperaturas;

import java.util.*;

public class Invierno {

    // ATRIBUTO:
    private double[] temperaturas;

    // CONSTRUCTOR POR DEFECTO:
    Invierno(int n) {
        temperaturas = new double[n];
        Scanner lectura = new Scanner(System.in);
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Introduce la temperatura número " + (i + 1));
            temperaturas[i] = lectura.nextDouble();
        }
    }

    // MÉTODOS:
    public double temp_media() {
        double mediaTemp = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            mediaTemp = mediaTemp + temperaturas[i];
        }
        return mediaTemp / temperaturas.length;
    }

    public double[] fahrenheit() {
        double[] f = new double[temperaturas.length];
        for (int i = 0; i < temperaturas.length; i++) {
            f[i] = temperaturas[i] * 1.8 + 32;
        }
        return f;
    }

    public String mostrar() {
        return Arrays.toString(temperaturas);
    }
}
