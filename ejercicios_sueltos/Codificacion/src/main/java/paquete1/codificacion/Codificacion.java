package paquete1.codificacion;

import java.util.*;

public class Codificacion {

    public static void main(String[] args) {
        // Definimos el HashMap con las correspondencias de letras a símbolos:
        HashMap<Character, String> mapa = new HashMap<>();
        mapa.put('A', "4");
        mapa.put('B', "6");
        mapa.put('C', "(");
        mapa.put('D', "[)");
        mapa.put('E', "&");
        mapa.put('F', "]]=");
        mapa.put('G', "&");
        mapa.put('H', "#");
        mapa.put('I', "!");
        mapa.put('J', ",|");
        mapa.put('L', "#");
        mapa.put('M', "(V)");
        mapa.put('N', "(/)");
        mapa.put('O', "()");
        mapa.put('P', "$%");
        mapa.put('Q', "=?");
        mapa.put('R', "+-");
        mapa.put('S', "¿*");
        mapa.put('T', "]}");
        mapa.put('U', "5=");
        mapa.put('V', "@+");
        mapa.put('W', "$%");
        mapa.put('X', "]<");
        mapa.put('Y', "&()");
        mapa.put('Z', "-]]");

        // Leemos la palabra a encriptar por teclado:
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la palabra a encriptar:");
        String palabra = sc.nextLine();

        // Creamos una cadena vacía para ir añadiendo los símbolos correspondientes a cada letra de la palabra:
        StringBuilder cadenaEncriptada = new StringBuilder();
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            // Si la letra está en el mapa, añadimos el símbolo correspondiente, si no, dejamos la letra original:
            cadenaEncriptada.append(mapa.getOrDefault(Character.toUpperCase(letra), String.valueOf(letra)));
        }

        // Mostramos la cadena encriptada por pantalla:
        System.out.println("Palabra encriptada: " + cadenaEncriptada.toString());
    }
}
