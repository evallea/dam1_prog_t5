package paquete1.ejercicio1;

import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        boolean seguir = true;
        int entero;
        double decimal;

        while (seguir) {
            System.out.println("Introduce un número entero:");
            try {
                entero = Integer.parseInt(lectura.next());
                System.out.println("El número entero es: " + entero);
                seguir = false;
            } catch (NumberFormatException eNF) {
                System.out.println("Debes introducir un número entero.");
            } catch (Exception e) {
                System.out.println("Error genérico.");
            }
        }

        seguir = true;

        while (seguir) {
            System.out.println("Introduce un número decimal:");
            try {
                decimal = Double.parseDouble(lectura.next());
                System.out.println("El número decimal es: " + decimal);
                seguir = false;
            } catch (NumberFormatException eNF) {
                System.out.println("Debes introducir un número decimal.");
            } catch (Exception e) {
                System.out.println("Error genérico.");
            }
        }
    }
}
