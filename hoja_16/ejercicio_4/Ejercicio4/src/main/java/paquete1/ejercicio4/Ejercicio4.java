package paquete1.ejercicio4;

import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {

        boolean seguir = true;
        int contador = 0;

        while (seguir) {
            try {
                contador++;
                comprobar_num();
                System.out.println("Realizaste " + contador + " intento(s).");
                seguir = false;
            } catch (NumberFormatException eNF) {
                System.err.println("Error de conversión.");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private static void comprobar_num() throws Exception, NumberFormatException {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduce un número de 0 a 100:");
        int numero = Integer.parseInt(lectura.next());
        if (numero < 0 || numero > 100) {
            throw new Exception("Rango no válido.");
        }
        System.out.println("El número " + numero + " es válido.");
    }
}
