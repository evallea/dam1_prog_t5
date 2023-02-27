package paquete1.taller;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Enrique Valle Alcega
 */
public class Taller {

    // Atributos:
    private HashMap<String, Coche> vehiculos;

    // Constructor por defecto:
    public Taller() {
        vehiculos = new HashMap<>();
    }

    // Métodos:
    public void anade_elemento(String color, String marca, String matricula) {
        Coche coche = new Coche(color, marca);
        if (!vehiculos.containsKey(matricula)) {
            vehiculos.put(matricula, coche);
            System.out.println("El coche se ha añadido al taller.");
        } else {
            System.out.println("Error, no se ha podido añadir el coche al taller porque la matrícula ya ha sido registrada.");
        }
    }

    public void elimina_elemento(String matricula) {
        if (vehiculos.containsKey(matricula)) {
            vehiculos.remove(matricula);
            System.out.println("Se ha eliminado el coche.");
        } else {
            System.out.println("La matrícula no está registrada, no se ha podido eliminar ningún coche.");
        }
    }

    public void visualiza_matriculas() {
        System.out.println("\nLista de las matrículas registradas:");
        for (String matricula : vehiculos.keySet()) {
            System.out.println(matricula);
        }
    }

    public void visualiza_coches() {
        System.out.println("\nLista de coches registrados:");
        for (Coche coche : vehiculos.values()) {
            System.out.println(coche.toString());
        }
    }

    public void visualiza_taller() {
        System.out.println("\nLista de coches registrados con su matrícula correspondiente:");
        for (Map.Entry<String, Coche> registro : vehiculos.entrySet()) {
            System.out.println(registro.getValue().toString() + "\nMatrícula: " + registro.getKey());
        }
    }
}
