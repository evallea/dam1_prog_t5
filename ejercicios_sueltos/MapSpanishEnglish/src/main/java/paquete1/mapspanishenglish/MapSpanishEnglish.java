package paquete1.mapspanishenglish;

import java.util.*;

public class MapSpanishEnglish {

    public static void main(String[] args) {

        String palabra;
        // boolean encontrado = false; // solo utilizado para la segunda solución:
        Scanner lectura = new Scanner(System.in);

        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("Perro", "Dog");
        diccionario.put("Gato", "Cat");
        diccionario.put("Burro", "Donkey");
        diccionario.put("Mono", "Monkey");

        System.out.println("Escribe un animal para traducirlo al inglés:");
        System.out.println("- Perro");
        System.out.println("- Gato");
        System.out.println("- Burro");
        System.out.println("- Mono");

        palabra = lectura.nextLine();

        // PRIMERA SOLUCIÓN:
        if (diccionario.containsKey(palabra)) {
            System.out.println(diccionario.get(palabra));
        } else {
            System.out.println("No se encontró el animal");
        }

        // SEGUNDA SOLUCIÓN:
        /*for (String i : diccionario.keySet()) {
            if (palabra.equalsIgnoreCase(i)) {
                System.out.println(diccionario.get(i));
                encontrado = true;
            }
            if (encontrado == false) {
                System.out.println("No se encontró el animal");
            }
        }*/
        
        // MOSTRAR TRADUCCIONES CON ITERADOR:
        Iterator it = diccionario.entrySet().iterator();

        // Se usa un bucle "While":
        System.out.println("\nDiccionario Español-Inglés");

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("[" + e.getKey() + " --> " + e.getValue() + "]");
        }

        // CON FOR EACH:
        System.out.println("\nDiccionario Inglés-Español");

        for (Map.Entry<String, String> e : diccionario.entrySet()) {
            System.out.println("[" + e.getValue() + " --> " + e.getKey() + "]");
        }

    }

}
