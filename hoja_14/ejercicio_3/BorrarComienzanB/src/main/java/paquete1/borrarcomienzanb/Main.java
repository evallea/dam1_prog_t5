package paquete1.borrarcomienzanb;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> listaCadenas = new ArrayList<>();

        listaCadenas.add("hola");
        listaCadenas.add("buenos días");
        listaCadenas.add("buenas tardes");
        listaCadenas.add("hasta luego");

        System.out.println("CONTENIDO DE LA LISTA:");
        System.out.println(listaCadenas);

        // Se eliminarán los elementos (e) que cumplan la condición detrás de "->":
        listaCadenas.removeIf(e -> e.toLowerCase().startsWith("b")); // e=elemento (se puede poner la letra que sea, se autodeclara).

        System.out.println("\nLISTA TRAS ELIMINAR LOS ELEMENTOS QUE COMIENZAN POR 'B':");
        System.out.println(listaCadenas);

    }

}
