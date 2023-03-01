package paquete1.ejercicio3;

import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {

        rango2();
        boolean seguir = true;

        while (seguir) {
            try {
                rango();
                seguir = false;
            } catch (NumberFormatException e) {
                System.out.println("Error de formato.");
                System.err.println("");
            }
        }

    }

    // Sí lanza excepciones:        
    private static void rango() throws Exception, NumberFormatException {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce un número de 0 a 100:");
        int numero = Integer.parseInt(lectura.next());
        if (numero < 0 || numero > 100) {
            throw new Exception("Rango no válido.");
        }
        System.out.println("El número " + numero + " es válido");
    }

    // No lanza excepciones:
    private static void rango2() {
        boolean seguir = true;
        while (seguir) {
            Scanner lectura = new Scanner(System.in);
            try {
                System.out.println("Introduce un número de 0 a 100:");
                int numero = Integer.parseInt(lectura.next());
                if (numero < 0 || numero > 100) {
                    throw new Exception("Rango no válido.");
                }
                System.out.println("El número " + numero + " es válido");
                seguir = false;
            } catch (NumberFormatException ime) {
                System.err.println("Error de conversión");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
    
}
