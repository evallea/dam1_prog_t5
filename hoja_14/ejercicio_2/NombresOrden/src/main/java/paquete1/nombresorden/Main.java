package paquete1.nombresorden;

import java.util.*;

/**
 *
 * @author Enrique Valle Alcega
 */
public class Main {

    public static void main(String[] args) {

        // ATRIBUTOS:
        Scanner lectura = new Scanner(System.in);
        String continuar = "s"; // Se inicializa en "s" para que comience entrando en el bucle "while" la primera vez.

        ArrayList<String> nombres = new ArrayList<>();
        // LinkedList<String> nombres = new LinkedList<>();

        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("Introduce un nombre:");
            String nombre = lectura.nextLine();
            nombres.add(nombre);

            System.out.println("¿Quiere insertar otro nombre? s/n:");
            continuar = lectura.nextLine();
        }

        System.out.println("\nNombres en orden de introducción:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println((i + 1) + ". " + nombres.get(i));
        }

        System.out.println("\nNombres en orden inverso:");
        for (int i = nombres.size() - 1; i >= 0; i--) {
            System.out.println((i + 1) + ". " + nombres.get(i));
        }

    }

}
