package paquete1.metodosarrays;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // CREACIÓN DEL ARRAY:
        int numeros[] = new int[3];

        numeros[0] = 13;
        numeros[1] = 54;
        numeros[2] = 17;

        // Se rellena el array:
        // Arrays.fill(numeros, 42); // Rellena el array enteramente con el valor indicado (incluso sustituye los ya existentes).
        
        // Se ordena el array:
        Arrays.sort(numeros);

        // Se muestra el array:
        for (int i : numeros) {
            System.out.println(i);
        }

        // El método "binarySearch" utiliza el algoritmo de búsqueda binaria para buscar un elemento en un array ordenado. Si encuentra el elemento, devuelve su índice en el array.
        // Búsqueda de elementos del array:
        System.out.println(Arrays.binarySearch(numeros, 54)); // Devuelve el índice del elemento del array indicado.
        System.out.println(Arrays.binarySearch(numeros, 15)); // Si no lo encuentra, devuelve un valor negativo que indica el punto de inserción del elemento si se decidiera insertar en el array.

        // CREACIÓN DEL ARRAY:
        String palabras[] = new String[3];

        palabras[0] = "burro";
        palabras[1] = "abeja";
        palabras[2] = "cabra";

        for (String i : palabras) {
            System.out.println(i);
        }

        // Búsqueda de elementos del array:
        System.out.println(Arrays.binarySearch(palabras, "cabra")); // Devuelve el índice del elemento del array indicado.
        System.out.println(Arrays.binarySearch(palabras, "lobo")); // Si no lo encuentra, devuelve un valor negativo que indica el punto de inserción del elemento si se decidiera insertar en el array.

    }

}
