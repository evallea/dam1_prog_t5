package paquete1.generasagas;

import java.util.*; // Importa la clase java.util que incluye la clase LinkedList.

public class GeneraSagas {

    public static void main(String[] args) {
        // Crea una lista de tipo LinkedList llamada "sagaTest1":
        LinkedList<Libro> sagaTest1 = new LinkedList();
        // Crea cuatro objetos de tipo "Libro":
        Libro L1 = new Libro("saga1", "titulo1", "autor1");
        Libro L2 = new Libro("saga1", "titulo1", "autor1");
        Libro L3 = new Libro("saga1", "titulo1", "autor1");
        Libro L4 = new Libro("saga1", "titulo1", "autor1");
        // Agrega los objetos "Libro" a la lista "sagaTest1":
        sagaTest1.add(L1);
        sagaTest1.add(L2);
        sagaTest1.add(L3);
        sagaTest1.add(L4);

        // Crea una segunda lista de tipo LinkedList llamada "sagaTest2":
        LinkedList<Libro> sagaTest2 = new LinkedList();
        // Crea cuatro objetos de tipo "Libro".
        Libro L5 = new Libro("saga2", "titulo2", "autor2");
        Libro L6 = new Libro("saga2", "titulo2", "autor2");
        Libro L7 = new Libro("saga2", "titulo2", "autor2");
        Libro L8 = new Libro("saga2", "titulo2", "autor2");
        // Agrega los objetos "Libro" a la lista "sagaTest2":
        sagaTest2.add(L5);
        sagaTest2.add(L6);
        sagaTest2.add(L7);
        sagaTest2.add(L8);

        // Crea una tercera lista de tipo LinkedList llamada "listaSagas":
        LinkedList<Libro> listaSagas = new LinkedList();
        // Agrega todos los elementos de las listas "sagaTest1" y "sagaTest2" a "listaSagas":
        listaSagas.addAll(sagaTest1);
        listaSagas.addAll(sagaTest2);

        // Imprime el título y la saga de cada libro en la lista "listaSagas":
        for (Libro i : listaSagas) {
            System.out.println(i.getTituloLibro() + " " + i.getTituloSaga());
        }
    }
}