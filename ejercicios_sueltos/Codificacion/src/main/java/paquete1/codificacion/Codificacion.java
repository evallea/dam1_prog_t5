package paquete1.codificacion;

import java.util.*;

public class Codificacion {

    // Este programa encripta las palabras introducidas por teclado.
    public static void main(String[] args) {

        HashMap<String, String> mapa = new HashMap<>();

        mapa.put("A", "4");
        mapa.put("B", "6");
        mapa.put("C", "(");
        mapa.put("D", "[)");
        mapa.put("E", "&");
        mapa.put("F", "]]=");
        mapa.put("G", "&");
        mapa.put("H", "#");
        mapa.put("I", "!");
        mapa.put("J", ",|");
        mapa.put("L", "#");
        mapa.put("M", "(V)");
        mapa.put("N", "(/)");
        mapa.put("O", "()");
        mapa.put("P", "$%");
        mapa.put("Q", "=?");
        mapa.put("R", "+-");
        mapa.put("S", "¿*");
        mapa.put("T", "]}");
        mapa.put("U", "5=");
        mapa.put("V", "@+");
        mapa.put("W", "$%");
        mapa.put("X", "]<");
        mapa.put("Y", "&()");
        mapa.put("Z", "-]]");

        System.out.println(mapa);
    }
}
