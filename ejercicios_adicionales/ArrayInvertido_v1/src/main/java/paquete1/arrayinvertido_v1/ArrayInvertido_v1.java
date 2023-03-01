package paquete1.arrayinvertido_v1;

import java.util.*;

/**
 *
 * @author Enrique Valle Alcega
 */
public class ArrayInvertido_v1 {

    public static void main(String[] args) {

        int ordenado[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Array sin invertir:");
        System.out.println(Arrays.toString(ordenado));

        // int invertido[] = new int[10];
        int invertido[] = new int[ordenado.length];

        for (int i = 0; i < ordenado.length; i++) {
            // (invertido[9 - i] = ordenado[i];
            invertido[i] = ordenado[(ordenado.length - 1) - i];
        }

        System.out.println("Array invertido:");
        System.out.println(Arrays.toString(invertido));

    }

}
