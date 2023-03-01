package paquete1.posicionesarray;

import java.util.*;

/**
 *
 * @author Enrique Valle Alcega
 */
public class PosicionesArray {

    public static void main(String[] args) {

        // Se crea el array:
        int miArray[] = new int[10];

        // Se rellena el array con -2 en todas las posiciones:
        Arrays.fill(miArray, -2);

        System.out.println(Arrays.toString(miArray));
        System.out.println("**********");

        // CON BUCLES FOR...
        // Se inicializan todas las posiciones a valor -1:
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = -1;
        }
        System.out.println(Arrays.toString(miArray));
        System.out.println("**********");

        // Se inicializa cada posición con un valor distinto
        Random numRandom = new Random(); // Para ello primero creamos un objeto de clase Random.

        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = numRandom.nextInt(100 + 1); // Genera un número aleatorio entre 1 y 100 (se pone +1 porque empieza contando desde 0 hasta 99).
        }
        System.out.println(Arrays.toString(miArray));

    }

}
