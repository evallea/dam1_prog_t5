package paquete1.ejercicio4;

import java.util.*;

/**
 *
 * @author damt124
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        String palabra; // Variable utilizada para guardar la palabra introducida.

        // Se crea un ArrayList llamado lista:
        ArrayList<String> lista = new ArrayList();

        do {
            System.out.println("Introduce palabras:");
            palabra = lectura.next();
            lista.add(palabra);
            // El bucle "if" elimina la palabra fin utilizada para salir del "do-while".
            if (palabra.equalsIgnoreCase("fin")) {
                lista.remove(palabra);
            }
            System.out.println(lista); // Se muestra la lista.
        } while (!palabra.equalsIgnoreCase("fin")); // Se ejecutará hasta escribirse "fin".
    }
}
