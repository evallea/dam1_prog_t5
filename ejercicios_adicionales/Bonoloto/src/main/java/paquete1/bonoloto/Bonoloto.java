package paquete1.bonoloto;

import java.util.*;

/**
 *
 * @author Enrique Valle Alcega
 */
public class Bonoloto {

    // ATRIBUTO:
    private int numeros[] = new int[6];

    Random aleatorio = new Random();

    // CONSTRUCTOR POR DEFECTO:
    public Bonoloto() {

        for (int i = 0; i < numeros.length; i++) {

            int numAleatorio;

            do {
                numAleatorio = aleatorio.nextInt(49) + 1;
            } while (contiene(numAleatorio, numeros, i) == true); // Se generará un número distinto mientras "contiene" devuelva "true";

            numeros[i] = numAleatorio;
        }

    }

    // MÉTODOS:
    /*
    * El método "contiene" se utiliza en el constructor para comprobar si un número ya está presente en el array. 
    * Recibe como argumentos el número a comprobar, el nombre del array y la longitud del array hasta el momento (para no comprobar los elementos vacíos). 
    * Utiliza un bucle for para recorrer el array y comprobar si el número ya está presente. 
    * Si el número está presente, el método devuelve true, indicando que el número no es válido y debe generarse otro número aleatorio. 
    * Si el número no está presente, el método devuelve false, indicando que el número es válido y puede ser utilizado.
    */
    private boolean contiene(int numAleatorio, int nombreArray[], int longArray) {
        for (int i = 0; i < longArray; i++) {
            if (nombreArray[i] == numAleatorio) {
                return true;
            }
        }
        return false;
    }

    // Este método se utiliza en la clase Main para mostrar el array con su contenido generado previamente.
    public String mostrar() {
        return Arrays.toString(numeros);
    }
    
}
