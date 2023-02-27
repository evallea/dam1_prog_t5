package paquete1.ejemplolistas;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // CREACIÓN DE UNA "LINKED LIST" DE UNA CLASE CON OBJETOS:
        LinkedList<Clase> listaAlumnos = new LinkedList();

        // Creación de los objetos:
        Clase alumno1 = new Clase("Enrique", 1);
        Clase alumno2 = new Clase("Rocío", 3);
        Clase alumno3 = new Clase("Juan", 7);

        listaAlumnos.add(alumno1); // Añade el primer alumno a la lista.
        listaAlumnos.add(alumno2); // Añade el segundo alumno a la lista.
        listaAlumnos.add(alumno3); // Añade el tercer alumno a la lista.

        listaAlumnos.remove(1); // Elimina el segundo alumno de la lista, ya que el primero sería 0.

        // Imprimir mediante un "for":
        for (int i = 0; i < listaAlumnos.size(); i++) {
            Clase alumno = listaAlumnos.get(i);
            System.out.println("Nombre: " + alumno.getNombre() + ", Grupo: " + alumno.getGrupo());
        }

        System.out.println("**********");

        // Imprimir mediante un "for each":
        // Para poder mostrar el objeto correctamente y no su información cifrada, hay que llamar al método toString creado en la clase "Clase".
        for (Clase i : listaAlumnos) {
            System.out.println(i); // Incluso sin poner el método toString, este es llamado implícitamente. Aunque también podría ponerse "i.toString()".
        }

        System.out.println("**********");

        // CREACIÓN DE UNA "LINKED LIST" DE STRINGS:
        LinkedList<String> listaCompra = new LinkedList();

        listaCompra.add("manzanas");
        listaCompra.add("peras");
        listaCompra.add("naranjas");

        System.out.println(listaCompra); // Imprime la lista completa.

        System.out.println("**********");

        System.out.println(listaCompra.get(0)); // Imprime solo el primer elemento de la lista.

        System.out.println("**********");

        // Imprimir mediante un "for":
        for (int i = 0; i < listaCompra.size(); i++) {
            System.out.println(listaCompra.get(i));
        }

        System.out.println("**********");

        // Imprimir mediante un "for each":
        for (String i : listaCompra) {
            System.out.println(i);
        }

        // CREACIÓN DE UNA "ARRAY LIST" DE STRINGS:
        ArrayList<String> listaDias = new ArrayList();

        listaDias.add("Lunes");
        listaDias.add("Martes");
        listaDias.add("Miércoles");
        listaDias.add("Jueves");
        listaDias.add("Viernes");

        listaDias.remove(1);

        System.out.println("**********");

        System.out.println(listaDias);
        System.out.println(listaDias.size());

    }

}
