package paquete1.ejercicio3;

import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        // Utilizando el método rango() que controla las excepciones:
        rango1();

        // Utilizando el método rango2() que lanza excepciones:
        boolean seguir2 = true;
        while (seguir2) {
            try {
                rango2();
                seguir2 = false;
            } catch (NumberFormatException eNF) {
                System.err.println("Error de conversión.");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

     // Controla excepciones:
    private static void rango1() {
        boolean seguir1 = true;
        while (seguir1) {
            Scanner lectura = new Scanner(System.in);
            try {
                System.out.println("Introduce un número de 0 a 100 (controla excepciones):");
                int numero = Integer.parseInt(lectura.next());
                if (numero < 0 || numero > 100) {
                    throw new Exception("Rango no válido.");
                }
                System.out.println("El número " + numero + " es válido.");
                seguir1 = false;
            } catch (NumberFormatException eNF) {
                System.err.println("Error de conversión.");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
    
    // Lanza excepciones:        
    private static void rango2() throws Exception, NumberFormatException {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce un número de 0 a 100 (lanza excepciones):");
        int numero = Integer.parseInt(lectura.next());
        if (numero < 0 || numero > 100) {
            throw new Exception("Rango no válido.");
        }
        System.out.println("El número " + numero + " es válido.");
    }
}
