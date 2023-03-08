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
        Personal empleado1 = new Personal(dni, salario); // Crea el objeto "empleado1".
        // Comprueba que no haya DNI repetido:
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDni().equalsIgnoreCase(dni)) {
                System.out.println("Ya hay un usuario con ese DNI. No se pudo añadir.");
                break;
            }
            Personal inserta = new Personal(dni,salario);
            lista.add(inserta);
            System.out.println("El empleado se ha añadido.");
        }
    }

    // MÉTODO PARA BORRAR EMPLEADOS:
    public void borra_empleado(String dni) {
        for (Personal i : lista) { // Se crea un bucle "for each" para recorrer la lista.
        }
    }
    
    // MÉTODO PARA LISTAR EMPLEADOS:
    public void lista_empleados(){
       Iterator<Personal> it1 = lista.iterator(); // Se crea el iterador para la lista.
       while (it1.hasNext()) { // Se recorre con el iterador.
           System.out.println(it1.next());
       }
    }
}


