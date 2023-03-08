package paquete1.ejercicio3;

import java.util.*;

/**
 *
 * @author damt124
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        // Se crea el array que va a contener los números aleatorios.
        int[] array_random = new int[30];

        // Se crea un HashMap:
        HashMap<Integer, Integer> mapa = new HashMap<>();

        Random aleatorio = new Random(); // Se crea el objeto aleatorio para utilizarlo al dar valor al array.

        // Se recorre el array mediante un bucle for:
        for (int i = 0; i < array_random.length; i++) {
            array_random[i] = aleatorio.nextInt(10); // Con cada vuelta, se va rellenando con números aleatorios del 0 al 9.
        }

        System.out.println(Arrays.toString(array_random)); // Se muestra el array generado.

        for (int i = 0; i < array_random.length; i++) {
            if (mapa.containsKey(array_random[i])) {
                int repetido = mapa.get(array_random[i]);
                mapa.put(array_random[i], repetido + 1);
            } else {
                mapa.put(array_random[i], 1);
            }
        }

        System.out.println("El HashMap con los valores repetidos es:");
        System.out.println(mapa);

        for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
            System.out.println("Hay " + entry.getValue() + " numeros " + entry.getKey() );
        }
    }
}
