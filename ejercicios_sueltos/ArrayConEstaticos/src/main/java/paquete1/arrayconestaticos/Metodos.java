package paquete1.arrayconestaticos;

import java.util.*;

public class Metodos {

    // Método estático que recibe un valor entero para conformar el tamaño del array y devolver el array de unos:
    public static int[] array_unos(int n) {
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }
        return array;
    }

    // Método estático que recibe un array de enteros y devuelve la suma de todos:
    public static int suma_array(int array[]) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        return suma;
    }
}
