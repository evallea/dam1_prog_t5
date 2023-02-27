package paquete1.ejemplomapas;

import java.util.*;

public class EjemploMapas {

    public static void main(String[] args) {

        // Se importa la clase:
        HashMap<String, Integer> t = new HashMap<>();

        // Se añaden los elementos al mapa con "put" (llave, valor).
        t.put("hola", 4);
        t.put("¿qué tal?", 9);
        t.put("adiós", 5);

        // No almacena llaves repetidas.
        // La llave sigue siendo "hola", y el valor será 6.
        t.put("hola", 6);

        // Vemos el mapa:
        System.out.println(t);

        // Se obtiene el valor asociado a una llave:
        System.out.println(t.get("adiós"));

        // Quitamos por llave y valor:
        t.remove("hola", 6);

        // Quitamos por llave:
        t.remove("hola");

        // Vemos el mapa sin el elemento de llave "hola":
        System.out.println(t);

        System.out.println("¿El mapa contiene la llave 'hasta luego?'");
        System.out.println(t.containsKey("hasta luego")); // Devuelve verdadero o falso.

        System.out.println("¿El mapa contiene el valor 10?"); // Devuelve verdadero o falso.
        System.out.println(t.containsValue(10));

        // Añadimos un nuevo elemento:
        t.put("aloha", 5);
        System.out.println("Vemos el mapa:");
        System.out.println(t);
        System.out.println("¿El mapa contiene el valor 5?");
        System.out.println(t.containsValue(5));
        System.out.println("Tamaño de mapa:");
        System.out.println(t.size());
        System.out.println("¿Está vacío?");
        System.out.println(t.isEmpty());
        t.clear();
        System.out.println("¿Está vacío después del 'clear'?");
        System.out.println(t.isEmpty());

        t.put("hola", 4);
        t.put("¿qué tal?", 9);
        t.put("adiós", 5);
        t.put("aloha", 5);

        System.out.println(t.keySet());

        // Imprime las llaves dentro del mapa que empiezan por "a":
        for (String s : t.keySet()) {
            if (s.startsWith("a")) {
                System.out.println(s);
            }
        }

        System.out.println(t.values());

        // Imprime los valores dentro del mapa mayores que 6:
        for (Integer i : t.values()) {
            if (i > 6) {
                System.out.println(i);
            }
        }

        System.out.println(t.entrySet());

    }

}
