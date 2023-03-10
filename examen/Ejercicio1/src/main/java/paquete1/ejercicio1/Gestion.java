package paquete1.ejercicio1;

import java.util.*;

/**
 *
 * @author damt124
 */
public class Gestion {

    // ATRIBUTO PRIVADO:
    private LinkedList<Personal> lista;

    // CONSTRUCTOR POR DEFECTO QUE INICIALIZA COLECCIÓN:
    Gestion() {
        lista = new LinkedList();
    }

    // MÉTODO PARA AÑADIR EMPLEADOS:
    public void inserta_empleado(String dni, int salario) {
        boolean encontrado = false;
        Personal persona = new Personal(dni, salario);
        if (lista.isEmpty()) {
            lista.add(persona);
        } else {
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getDni().equalsIgnoreCase(dni)) {
                    encontrado = true;
                    i = lista.size();
                }
            }
            if (encontrado) {
                System.out.println("El elemento está duplicado. No se añadirá.");
            } else {
                lista.add(persona);
            }
        }
    }

    // MÉTODO PARA BORRAR EMPLEADOS:
    public void borra_empleado(String dni) {
        boolean encontrado = false;
        for (Personal persona : lista) {
            if (persona.getDni().equalsIgnoreCase(dni)) {
                encontrado = true;
                lista.remove(persona);
            }
        }
        if (encontrado = false) {
            System.out.println("No se pudo eliminar. No se encontró el DNI.");
        }
    }

    // MÉTODO PARA LISTAR EMPLEADOS:
    public void lista_empleados() {
        Iterator<Personal> it1 = lista.iterator(); // Se crea el iterador para la lista.
        Personal persona;
        do {
            persona = it1.next();
            System.out.println("DNI: " + persona.getDni() + " Salario: " + persona.getSalario());
        } while (it1.hasNext());
    }
}
