package paquete1.ejemplolistas;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // CREACIÓN DE UNA "LINKED LIST" DE UNA CLASE CON OBJETOS:
        LinkedList<Clase> lista = new LinkedList();

        // Creación de los objetos:
        Clase alumno1 = new Clase("Enrique", 1);
        Clase alumno2 = new Clase("Rocío", 3);
        Clase alumno3 = new Clase("Juan", 7);

        lista.add(alumno1); // Añade el primer alumno a la lista.
        lista.add(alumno2); // Añade el segundo alumno a la lista.

        lista.remove(1); // Elimina el segundo alumno de la lista, ya que el primero sería 0.

        // CREACIÓN DE UNA "LINKED LIST" DE STRINGS:
        LinkedList<String> listaCompra = new LinkedList();

        listaCompra.add("manzanas");
        listaCompra.add("peras");
        listaCompra.add("naranjas");

        System.out.println("**********");
        System.out.println(listaCompra); // Imprime la lista completa.
        System.out.println(listaCompra.get(0)); // Imprime solo el primer elemento de la lista.
        System.out.println("**********");

        // Para imprimir los elementos uno a uno, mediante un "for":
        for (int i = 0; i < listaCompra.size(); i++) {
            System.out.println(listaCompra.get(i));
        }

        System.out.println("**********");

        // Para imprimir los elementos uno a uno, mediante un "for each":
        for (String i : listaCompra) {
            System.out.println(i);
        }

        // CREACIÓN DE UNA "ARRAY LIST" DE STRINGS:
        ArrayList<String> lista2 = new ArrayList();

        lista2.add("Lunes");
        lista2.add("Martes");
        lista2.add("Miércoles");
        lista2.add("Jueves");
        lista2.add("Viernes");

        lista2.remove(1);

        System.out.println("**********");
        System.out.println(lista2);
        System.out.println(lista2.size());
        System.out.println("**********");

    }
}
