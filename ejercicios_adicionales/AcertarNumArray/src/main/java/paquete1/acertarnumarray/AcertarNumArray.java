package paquete1.acertarnumarray;

import java.util.*;

/**
 *
 * @author Enrique Valle Alcega
 */
public class AcertarNumArray {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        // Se crea un array con 10 números:
        int numeros[] = {23, 45, 65, 12, 32, 65, 98, 34, 12, 56};
        Arrays.sort(numeros); // Se ordena el array en orden ascendente (para que el método binarySearch funcione correctamente, debe estar ordenado).

        System.out.println("Introduce un número para ver si está en el array:");
        int numElegido = lectura.nextInt();
        int posicion = Arrays.binarySearch(numeros, numElegido);

        // Con binarySearch, se devolverá siempre un número negativo si este no se encuentra dentro del array, por lo tanto...
        if (posicion >= 0) { // Si encontramos el número, mostramos su posición:
            System.out.println("El número " + numElegido + " se encuentra en la posición " + posicion + ".");
        } else { // Si no se encuentra el número, se muestra el mensaje de error:
            System.out.println("Número no encontrado.");
        }

    }

}
