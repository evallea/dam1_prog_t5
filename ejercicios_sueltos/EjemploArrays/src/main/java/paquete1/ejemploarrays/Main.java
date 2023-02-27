package paquete1.ejemploarrays;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // CREACIÓN DEL ARRAY:
        int numeros[] = new int[3];

        numeros[0] = 17;
        numeros[1] = 13;
        numeros[2] = 54;

        // Se rellena el array:
        // Arrays.fill(miArray, 42); // Rellena el array enteramente con el valor indicado (incluso sustituye los ya existentes).
        
        // Se muestra el array:
        for (int i : numeros) {
            System.out.println(i);
        }

        // Búsqueda de elementos del array:
        // System.out.println(Arrays.binarySearch(numeros, 2)); // Se muestra el valor del elemento en el índice del array.

        // CREACIÓN DEL ARRAY:
        String palabras[] = new String[3];

        palabras[0] = "burro";
        palabras[1] = "abeja";
        palabras[2] = "cabra";

        for (String i : palabras) {
            System.out.println(i);
        }

        // Búsqueda de elementos del array:
        // System.out.println(Arrays.binarySearch(palabras, 2)); // Se muestra el valor del elemento en el índice del array.

    }
    
}
