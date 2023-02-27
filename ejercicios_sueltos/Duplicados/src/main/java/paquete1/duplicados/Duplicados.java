package paquete1.duplicados;

import java.util.LinkedList;

public class Duplicados {

    public static void main(String[] args) {

        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(4);
        lista.add(1);
        lista.add(3);
        lista.add(4); // Repetido.
        lista.add(6);
        lista.add(8);
        lista.add(3); // Repetido.
        lista.add(9);

        System.out.println(lista.size());

        // Se recorre la lista con un bucle for:
        for (int i = 0; i < lista.size(); i++) {

            for (int j = i + 1; j < lista.size(); j++) {

                // Compara cada uno con todos los siguientes:
                if (lista.get(i).equals(lista.get(j))) {
                    // lista.remove(i); // Elimina el primer duplicado que encuentra.
                    lista.remove(j); // Elimina el segundo duplicado que encuentra.
                }

            }

        }

        System.out.println(lista);

        System.out.println(lista.size());

    }

}
