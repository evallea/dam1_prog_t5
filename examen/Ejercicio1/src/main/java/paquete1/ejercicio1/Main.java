package paquete1.ejercicio1;

/**
 *
 * @author damt124
 */
public class Main {

    public static void main(String[] args) {

        // Se crea el objeto de la clase Gestión:
        Gestion empresa = new Gestion();

        // Se insertan 5 empleados:
        empresa.inserta_empleado("23232434A", 2500);
        empresa.inserta_empleado("24564256R", 1300);
        empresa.inserta_empleado("14562234P", 1200);
        empresa.inserta_empleado("56776465H", 1100);
        empresa.inserta_empleado("59232256J", 2000);

        empresa.lista_empleados(); // Se muestra la lista de empleados.
        empresa.borra_empleado("59232256J"); // Se borra un empleado.
        System.out.println("**********");
        empresa.lista_empleados(); // Se vuelve a mostrar la lista de empleados con los restantes.
    }
}
