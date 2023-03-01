package paquete1.ejercicio2;

import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {

        dividir();
    }

    public static void dividir() {

        boolean seguir = true;
        Scanner lectura = new Scanner(System.in);

        while (seguir) {
            try {
                System.out.println("Introduce dividendo:");
                int dividendo = Integer.parseInt(lectura.next());
                System.out.println("Introduce divisor:");
                int divisor = Integer.parseInt(lectura.next());
                System.out.println("el resultado es " + dividendo / divisor);
                seguir = false;
            } catch (NumberFormatException eNF) {
                System.err.println("Número incorrecto.");
            } catch (ArithmeticException eAE) {
                System.err.println("No se puede dividir un número entre 0.");
            } catch (Exception e) {
                System.err.println("Error genérico.");
            }
        }
    }
}
