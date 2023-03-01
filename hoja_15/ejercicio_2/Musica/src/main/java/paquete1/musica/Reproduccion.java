package paquete1.musica;

import java.util.*;

public class Reproduccion {

    // ATRIBUTOS:
    private LinkedList<Cancion> lista;

    // CONSTRUCTOR POR DEFECTO:
    public Reproduccion() {
        Cancion cancion1 = new Cancion("Canción 1", "Autor 1");
        Cancion cancion2 = new Cancion("Canción 2", "Autor 2");
        Cancion cancion3 = new Cancion("Canción 3", "Autor 3");
        Cancion cancion4 = new Cancion("Canción 4", "Autor 4");
        Cancion cancion5 = new Cancion("Canción 5", "Autor 5");
        lista.add(cancion1);
        lista.add(cancion2);
        lista.add(cancion3);
        lista.add(cancion4);
        lista.add(cancion5);
    }

    // MÉTODOS:
    public String reproduceCancion(int posicion) {
        return lista.get(posicion).getTitulo() + lista.get(posicion).getAutor();
    }

    public String cancionSiguiente(int posicion) {
        if (posicion == 4) {
            return lista.get(0).getTitulo();
        } else {
            return lista.get(posicion + 1).getTitulo();
        }
    }

    public String cancionAnterior(int posicion) {
        if (posicion == 0) {
            return lista.getLast().getTitulo();
        } else {
            return lista.get(posicion - 1).getTitulo();
        }
    }

    public String cancionInicial() {
        return lista.getFirst().getTitulo();
    }

    public String cancionFinal() {
        return lista.getLast().getTitulo();
    }

    public String cancionAleatoria() {
        int aleatorio = (int) Math.random() * lista.size(); // Se castea "int" para almacenar el valor aleatorio en una variable de tipo entero.
        return lista.get(aleatorio).getTitulo(); // Devuelve el título de la posición aleatoria generada entre 0 y 4.
    }
}
