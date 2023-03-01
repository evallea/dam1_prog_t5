package paquete1.musica;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, Cancion> disco1 = new HashMap<>();
        disco1.put(1, new Cancion("Cancion 1", "Artista 1"));
        disco1.put(2, new Cancion("Cancion 2", "Artista 2"));
        disco1.put(3, new Cancion("Cancion 3", "Artista 3"));
        disco1.put(4, new Cancion("Cancion 4", "Artista 4"));
        disco1.put(5, new Cancion("Cancion 5", "Artista 5"));

        HashMap<Integer, Cancion> disco2 = new HashMap<>();
        disco2.put(1, new Cancion("Cancion 6", "Artista 1"));
        disco2.put(2, new Cancion("Cancion 7", "Artista 2"));
        disco2.put(3, new Cancion("Cancion 8", "Artista 3"));
        disco2.put(4, new Cancion("Cancion 4", "Artista 4"));
        disco2.put(5, new Cancion("Cancion 5", "Artista 5"));

        Scanner lectura = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Elige CD (1 o 2):");
            opcion = lectura.nextInt();
        } while (opcion < 1 || opcion > 2);

        System.out.println("Estas son las canciones del CD elegido:");

        if (opcion == 1) {
            for (int i : disco1.keySet()) {
                System.out.println(disco1.get(i).getTitulo() + " " + disco1.get(i).getAutor());
            }
        }

        if (opcion == 2) {
            for (int i : disco2.keySet()) {
                System.out.println(disco2.get(i).getTitulo() + " " + disco2.get(i).getAutor());
            }
        }
    }
}
