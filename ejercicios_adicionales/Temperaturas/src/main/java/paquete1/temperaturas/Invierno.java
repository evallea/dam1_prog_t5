package paquete1.temperaturas;

import java.util.*;

public class Invierno {

    // ATRIBUTO:
    private double temperaturas[];

    // CONSTRUCTOR POR DEFECTO:
    Invierno(int n) {
        temperaturas = new double[n];
        Scanner lectura = new Scanner(System.in);
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("");
        }
    }
}
