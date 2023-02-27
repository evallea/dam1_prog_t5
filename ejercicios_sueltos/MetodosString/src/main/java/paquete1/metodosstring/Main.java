package paquete1.metodosstring;

/**
 *
 * @author Enrique Valle Alcega
 */
public class Main {

    public static void main(String[] args) {

        // ATRIBUTOS:
        String palabra1 = "Hoy es jueves";
        String palabra2 = "Hoy es viernes";

        // COMPARAR STRINGS (MÉTODOS "compare" o "equals"):
        // "compare" devuelve 0 si los String son iguales, o un número si no lo son.
        System.out.println(palabra1.compareToIgnoreCase(palabra2)); // También existe una versión "IgnoreCase".
        // "equals" devuelve true o false dependiendo si los Strings son iguales o no:
        System.out.println(palabra1.equals(palabra2));

        System.out.println("\n**********\n");

        // CONCATENAR STRINGS:
        System.out.println(palabra1.concat(palabra2)); // Une ambas cadenas.

        System.out.println("\n**********\n");

        // ÍNDICE DEL STRING:
        // Retorna posición de la primera letra o palabra del String:
        System.out.println(palabra1.indexOf("es")); // Retornará 4, la primera posición donde se encuentra ("e"s), contando desde 0.
        System.out.println(palabra1.indexOf("e", 5)); // Empieza a contar desde la posición 5, por lo que obvia la primera "e", y muestra el índice "e" posterior (el 9).
        
    }
    
}
