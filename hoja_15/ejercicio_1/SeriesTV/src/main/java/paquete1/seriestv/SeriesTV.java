package paquete1.seriestv;

import java.util.*;

public class SeriesTV {

    public static void main(String[] args) {

        // CREACIÓN DEL MAPA:
        HashMap<Integer, String> serie = new HashMap<>();

        // INTRODUCCIÓN DE DATOS (LLAVE,VALOR):
        serie.put(1984, "Serie0");
        serie.put(1989, "Serie1");
        serie.put(1994, "Serie2");
        serie.put(1993, "Serie3");
        serie.put(2004, "Serie4");
        serie.put(1978, "Serie5");
        serie.put(2010, "Serie6");
        serie.put(2012, "Serie7");
        serie.put(2022, "Serie8");
        serie.put(2019, "Serie9");

        // RECORRIDO DEL MAPA MEDIANTE ITERADOR:
        Iterator it = serie.entrySet().iterator();

        while (it.hasNext()) { // Se ejecuta mientras "it" tenga un elemento siguiente.
            Map.Entry e = (Map.Entry) it.next(); // Cada "Map.Entry" es un objeto del mapa.
            System.out.println("[" + e.getValue() + " --> " + e.getKey() + "]");
        }

        System.out.println("\n*****************\n");

        // RECORRIDO DEL MAPA MEDIANTE FOR EACH:
        for (Map.Entry<Integer, String> e : serie.entrySet()) {
            System.out.println("[" + e.getValue() + " --> " + e.getKey() + "]");
        }

        System.out.println("\n*****************\n");

        // Solo llaves:
        for (Integer llave : serie.keySet()) {
            System.out.println(llave);
        }

        System.out.println("\n*****************\n");

        // Solo valores:
        for (String valor : serie.values()) {
            System.out.println(valor);
        }

    }

}
