package paquete1.tempmediaciudades;

import java.util.*;

/**
 *
 * @author Enrique Valle Alcega
 */
public class TempMediaCiudades {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        int sumaTemps = 0;

        // Se crea el array para almacenar las 10 temperaturas:
        int temps[] = new int[10];

        // Con este bucle for se recorre el array y se establece manualmente en cada vuelta un valor para cada índice del array:
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Introduce temperatura" + "(" + (i + 1) + " de 10):");
            temps[i] = lectura.nextInt();
            sumaTemps = sumaTemps + temps[i]; // En cada vuelta, sumamos el valor introducido al anterior.
        }

        System.out.println(Arrays.toString(temps)); // Se muestra el array mediante el método toString.

        double mediaTemps = sumaTemps / temps.length; // Dividimos la suma de todas las temperaturas (sumaTemps) entre temps.length (o lo que es lo mismo, entre 10).

        System.out.println("La temperatura media es de: " + mediaTemps + ".");

    }

}
