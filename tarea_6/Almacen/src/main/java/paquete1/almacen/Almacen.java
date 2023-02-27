package paquete1.almacen;

import java.util.ArrayList;

/**
 *
 * @author Enrique Valle Alcega
 */
public class Almacen {

    // ATRIBUTOS:
    private ArrayList<Coche> vehiculos;

    // CONSTRUCTOR POR DEFECTO:
    public Almacen() {
        vehiculos = new ArrayList<>();
    }

    // CONSTRUCTOR COPIA:
    public Almacen(Almacen copia) {
        this.vehiculos = new ArrayList<>();
        for (Coche coche : copia.vehiculos) {
            this.vehiculos.add(new Coche(coche.getColor(), coche.getMarca()));
        }
    }

    // MÉTODOS:
    // Método para añadir un coche según el objeto:
    public void anadir_coche(Coche coche) {
        vehiculos.add(coche);
    }

    // Método para añadir un coche según la posición y el objeto:
    public void anadir_coche(int posicion, Coche coche) {
        vehiculos.add(posicion, coche);
    }

    // Método para eliminar un coche según el objeto:
    public void eliminar_coche(Coche coche) {
        if (vehiculos.contains(coche)) {
            vehiculos.remove(coche);
        } else {
            System.out.println("\nEse coche no está en el almacén, no se puede eliminar.\n");
        }
    }

    // Método para eliminar un coche según su posición en la lista:
    public void eliminar_coche(int posicion) {
        if (posicion >= 0 && posicion < vehiculos.size()) {
            vehiculos.remove(posicion);
        } else { // Si la posición del coche elegido para eliminar está fuera de los límites de la lista, se muestra este mensaje:
            System.out.println("\nEsa posición no existe en el almacén, no se puede eliminar.\n");
        }
    }

    // Método para mostrar un listado de los coches del almacén:
    public void mostrar_coches() {
        System.out.println("\nCOCHES EN EL ALMACÉN:\n");
        for (Coche coche : vehiculos) {
            System.out.println("Nº: " + vehiculos.indexOf(coche)); // Esta línea añade el índice correspondiente al coche.
            System.out.println(coche.toString());
            System.out.println("******");
        }
    }

    // Método para buscar un coche según su posición en la lista:
    public void buscar(int posicion) {
        if (posicion >= 0 && posicion < vehiculos.size()) {
            Coche coche = vehiculos.get(posicion);
            System.out.println("\nNº: " + posicion + "\n" + coche.toString());
        } else {
            System.out.println("\nNo existe ningún coche con la posición " + posicion + ".");
        }
    }

    // Método para buscar un coche según su nombre y color en la lista:
    public void buscar(String color, String marca) {
        boolean encontrado = false;
        for (Coche coche : vehiculos) {
            if (coche.getColor().equalsIgnoreCase(color) && coche.getMarca().equalsIgnoreCase(marca)) {
                encontrado = true;
                System.out.println("\nSe encontró el siguiente coche:\n" + coche.toString());
            }
        }
        if (!encontrado) {
            System.out.println("\nNo existe ningún coche con esos datos.");
        }
    }

    // Método para mostrar el tamaño ocupado del almacén:
    public void tamano_almacen() {
        System.out.println("\nTamaño del almacén: " + vehiculos.size() + "\n");
    }

}
