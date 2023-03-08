package paquete1.ejercicio5;

import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        try {
            System.out.println("Introduce un dividendo entero:");
            int dividendo = Integer.parseInt(lectura.next());
            System.out.println("Introduce un divisor entero:");
            int divisor = Integer.parseInt(lectura.next());
            System.out.println("Resultado: " + dividir(dividendo, divisor));
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida.");
        } catch (ArithmeticException e) {
            System.out.println("No puedes dividir por 0.");
        } finally {
            System.out.println("\nPrograma finalizado.");
        }
    }

    private static int dividir(int dividendo, int divisor) {
        return dividendo / divisor;
    }
}
