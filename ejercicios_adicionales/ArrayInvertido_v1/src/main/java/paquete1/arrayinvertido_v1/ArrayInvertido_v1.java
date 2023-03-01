package paquete1.arrayinvertido_v1;

import java.util.*;

/**
 *
 * @author Enrique Valle Alcega
 */
public class ArrayInvertido_v1 {

    public static void main(String[] args) {

        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Array sin invertir:");
        System.out.println(Arrays.toString(numeros));

        int numerosInver[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numerosInver[9 - i] = numeros[i];
        }

        System.out.println("Array invertido:");
        System.out.println(Arrays.toString(numerosInver));

    }

}
