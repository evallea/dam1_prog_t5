package paquete1.ejemplocolaspilas;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // EJERCICIOS:
        // Primero creamos la cola:
        Queue<String> cola = new LinkedList<>();

        // Añadimos elementos (puede usarse "offer" o "add"):
        cola.add("Lunes");
        cola.add("Martes");
        cola.offer("Miércoles");

        // 15. Consultar el primer elemento de la cola
        System.out.println(cola.peek());

        // 16. Consultar y eliminar el primer elemento de la cola
        System.out.println(cola.poll());

        // 17. Volver a consultar el primer elemento de la cola
        System.out.println(cola.peek());

        // 18. Añadir un elemento a la cola.
        cola.offer("Jueves");

        // 19. Ver el listado.
        System.out.println(cola);

        // Primero creamos la pila:
        Stack<String> pila = new Stack<>();

        // Añadimos elementos (puede usarse "push" o "add"):
        pila.add("Enero");
        pila.add("Febrero");
        pila.push("Marzo");

        // 20. Consultar el primer elemento de la pila.
        System.out.println(pila.peek());

        // 21. Consultar y eliminar el primer elemento de la pila.
        System.out.println(pila.pop());

        // 22. Volver a consultar el primer elemento de la pila.
        System.out.println(pila.peek());

        // 23. Añadir un elemento a la pila.
        pila.push("Abril");

        // 24. Ver el listado.
        System.out.println(pila);

    }

}
