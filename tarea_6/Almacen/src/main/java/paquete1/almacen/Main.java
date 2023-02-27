package paquete1.almacen;

import java.util.Scanner;

/**
 *
 * @author Enrique Valle Alcega
 */
public class Main {

    public static void main(String[] args) {

        Almacen almacen = new Almacen(); // Creación del objeto llamando al constructor por defecto.

        int numero; // Variable para conformar el "switch".
        int posicion; // Variable para guardar el valor de la posición de los objetos.
        String color; // Variable para guardar el valor del color introducido por el usuario.
        String marca; // Variable para guardar el valor de la marca introducida por el usuario.
        Scanner teclado = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("Datos originales del almacén:");
        System.out.println("----------------------------------------");

        // Se rellena previamente el almacén con cuatro coches:
        almacen.anadir_coche(new Coche("rojo", "Audi"));
        almacen.anadir_coche(new Coche("azul", "Fiat"));
        almacen.anadir_coche(new Coche("gris", "BMW"));
        almacen.anadir_coche(new Coche("amarillo", "Ford"));

        // Se muestra el listado de coches del almacén:
        almacen.mostrar_coches();

        // Se muestra el tamaño del almacén:
        almacen.tamano_almacen();

        System.out.println("----------------------------------------");
        System.out.println("Se eliminan los 2 primeros coches:");
        System.out.println("----------------------------------------");

        // Se eliminan dos coches, los de las posiciones 0 y 1 (Audi y Fiat):
        // Se pone dos veces la posición 0, ya que al eliminar el primero, el siguiente índice (el 3) pasa a ser el 2 otra vez:
        almacen.eliminar_coche(0);
        almacen.eliminar_coche(0);

        // Se muestra el listado de coches del almacén:
        almacen.mostrar_coches();

        // Se muestra el tamaño del almacén:
        almacen.tamano_almacen();

        System.out.println("----------------------------------------");
        System.out.println("Se añaden los 2 primeros coches al final:");
        System.out.println("----------------------------------------");

        // Se añaden al final de la lista los dos primeros coches eliminados anteriormente.
        almacen.anadir_coche(2, new Coche("rojo", "Audi"));
        almacen.anadir_coche(3, new Coche("azul", "Fiat"));

        // Se muestra el listado de coches del almacén:
        almacen.mostrar_coches();

        // Se muestra el tamaño del almacén:
        almacen.tamano_almacen();

        // Copia de seguridad con el constructor copia:
        Almacen almacenCopia = new Almacen(almacen);

        do {
            System.out.println("\nSELECCIONA UNA OPCIÓN:");
            System.out.println("**********************");
            System.out.println("1. Buscar coche (por índice).");
            System.out.println("2. Buscar coche (por color y marca).");
            System.out.println("3. Añadir coche al almacén.");
            System.out.println("4. Eliminar coche del almacén.");
            System.out.println("5. Mostrar todos los coches del almacén.");
            System.out.println("6. Salir.");

            numero = teclado.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("\nIntroduce el número asignado (índice):");
                    posicion = teclado.nextInt();
                    almacen.buscar(posicion); // Llama al método para buscar un coche según la posición indicada previamente.
                    break;
                case 2:
                    System.out.println("\nIntroduce el color:");
                    color = teclado.next();
                    System.out.println("Introduce la marca:");
                    marca = teclado.next();
                    almacen.buscar(color, marca); // Llama al método para buscar un coche según el color y la marca indicados previamente.
                    break;
                case 3:
                    System.out.println("\nIntroduce el color:");
                    color = teclado.next();
                    System.out.println("Introduce la marca:");
                    marca = teclado.next();
                    almacen.anadir_coche(new Coche(color, marca)); // Llama al método para añadir un coche según el objeto con el color y la marca indicados previamente.
                    break;
                case 4:
                    System.out.println("\nIntroduce el número asignado (índice):");
                    posicion = teclado.nextInt();
                    almacen.eliminar_coche(posicion); // Llama al método para eliminar un coche según la posición indicada previamente.
                    break;
                case 5:
                    almacen.mostrar_coches(); // Llama al método para mostrar los coches añadidos al almacén.
                    break;
                case 6:
                    System.out.println("\nFinalizando programa...");
                    break;
                default:
                    System.out.println("\nDebes elegir una opción. ");
                    break;
            }
        } while (numero != 6); // El bucle se repetirá mientras se seleccione una opción distinta de 4 (la opción de salir).

    }

}
