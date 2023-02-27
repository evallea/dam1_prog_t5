package paquete1.operacionescolecciones;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<Candidatos> coleccion1 = new LinkedList();
        LinkedList<Candidatos> coleccion2 = new LinkedList();

        Candidatos candidato1 = new Candidatos("Ana", 53);
        Candidatos candidato2 = new Candidatos("Bea", 57);
        Candidatos candidato3 = new Candidatos("Oliver", 59);
        Candidatos candidato4 = new Candidatos("Leo", 63);
        Candidatos candidato5 = new Candidatos("Lia", 55);
        Candidatos candidato6 = new Candidatos("Anais", 51);

        coleccion1.add(candidato1);
        coleccion1.add(candidato2);
        coleccion1.add(candidato3);
        coleccion1.add(candidato4); // Leo estará repetido.

        coleccion2.add(candidato4);
        coleccion2.add(candidato5);
        coleccion2.add(candidato6);

        System.out.println("\nCOLECCIÓN 1:");
        for (Candidatos i : coleccion1) {
            System.out.println(i.muestraInfo());
            System.out.println("**********");
        }

        System.out.println("\nCOLECCIÓN 2:");
        for (Candidatos i : coleccion2) {
            System.out.println(i.muestraInfo());
            System.out.println("**********");
        }

        // Añade a la primera colección todos los candidatos que tiene la segunda:
        System.out.println("\nCOLECCION 1 (COLECCIÓN 1 + COLECCIÓN 2):");
        coleccion1.addAll(coleccion2); // "addAll" no pisa repetidos, si hay repetidos se mantienen los dos.
        for (Candidatos i : coleccion1) {
            System.out.println(i.muestraInfo());
            System.out.println("**********");
        }

        // Borra de la primera todos los candidatos de la otra:
        System.out.println("\nCOLECCIÓN 2 (COLECCIÓN 1 - COLECCIÓN 2):");
        coleccion1.removeAll(coleccion2); // "removeAll" elimina repetidos.
        for (Candidatos i : coleccion1) {
            System.out.println(i.muestraInfo());
            System.out.println("**********");
        }

        // Borra de la segunda colección todos los candidatos que estén en la otra:
        System.out.println("\nCOLECCIÓN 1 (COLECCIÓN 2 - COLECCIÓN 1):");
        coleccion2.removeAll(coleccion1); // "removeAll" elimina repetidos.
        for (Candidatos i : coleccion1) {
            System.out.println(i.muestraInfo());
            System.out.println("**********");
        }

        // Borra todos los candidatos de la primera colección:
        System.out.println("\nCOLECCIÓN 1 SIN CANDIDATOS):");
        coleccion1.removeAll(coleccion1); // "removeAll" elimina repetidos.
        for (Candidatos i : coleccion1) {
            System.out.println(i.muestraInfo());
            System.out.println("**********");
        }

    }

}
