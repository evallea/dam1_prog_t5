package paquete1.tarea5;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // CREACIÓN DE "usuario1" CON CONSTRUCTOR POR DEFECTO:
        Contacto usuario1 = new Contacto(); // Creación de la instancia "usuario1" con los datos del constructor por defecto.
        System.out.println("\nCONTACTO DEL CONSTRUCTOR POR DEFECTO:");
        usuario1.mostrarInformacion(); // Muestra por pantalla los datos de "usuario1".

        // LINKED LIST CON 5 OBJETOS DE CONTACTO:
        LinkedList<Contacto> listaLinked = new LinkedList(); // Creación de la lista.
        // Se añaden cinco objetos a la lista:
        listaLinked.add(new Contacto("Juan", "San Miguel"));
        listaLinked.add(new Contacto("Adrián", "Trueba"));
        listaLinked.add(new Contacto("Fernando", "Abascal"));
        listaLinked.add(new Contacto("Juan", "Cabrerizo"));
        listaLinked.add(new Contacto("Rocío", "Sancho"));
        // Se muestran por pantalla los contactos de "listaLinked" mediante un bucle "for each":
        System.out.println("\nLINKEDLIST DE CONTACTOS:");
        for (Contacto i : listaLinked) {
            i.mostrarInformacion();
            System.out.println("********************");
        }

        // ARRAY LIST CON 5 OBJETOS DE CONTACTO:
        ArrayList<Contacto> listaArray = new ArrayList<>();
        // Se añaden cinco objetos a la lista:
        listaArray.add(new Contacto("Juan", "San Miguel"));
        listaArray.add(new Contacto("Adrián", "Trueba"));
        listaArray.add(new Contacto("Fernando", "Abascal"));
        listaArray.add(new Contacto("Juan", "Cabrerizo"));
        listaArray.add(new Contacto("Rocío", "Sancho"));
        // Se muestran por pantalla los contactos de "ArrayLinked" mediante un bucle "for each":
        System.out.println("\nARRAYLIST DE CONTACTOS:");
        for (Contacto i : listaArray) {
            i.mostrarInformacion();
            System.out.println("********************");
        }

        // LINKED LIST CON 7 STRINGS DE DÍAS DE LA SEMANA:
        LinkedList<String> listaSemana = new LinkedList();
        // Se añaden cinco objetos a la lista:
        listaSemana.add("Lunes");
        listaSemana.add("Martes");
        listaSemana.add("Miércoles");
        listaSemana.add("Jueves");
        listaSemana.add("Viernes");
        listaSemana.add("Sábado");
        listaSemana.add("Domingo");
        // Se muestran por pantalla los objetos de "listaSemana" mediante un bucle "for each":
        System.out.println("\nLINKEDLIST DE DÍAS:");
        for (String i : listaSemana) {
            System.out.println(i);
        }

        // ARRAY BIDIMENSIONAL 3x3 CON NÚMEROS ALEATORIOS ENTRE 1 Y 15 EN LA COLUMNA Nº3:
        int numAleatorios[][] = new int[3][3];
        Random aleatorio = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    numAleatorios[i][j] = aleatorio.nextInt(15) + 1; // Se añade +1 para que comience desde 1 y finalice en 15 (y no sea de 0 a 14).
                } else {
                    numAleatorios[i][j] = 0;
                }
            }
        }
        // Se muestra por pantalla:
        System.out.println("\nArray bidimensional 3x3 con números aleatorios (del 1 al 15) en la tercera columna:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numAleatorios[i][j] + " ");
            }
            System.out.println(); // Salto de línea.
        }
    }
}
