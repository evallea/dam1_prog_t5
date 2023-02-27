package paquete1.divisionexcepciones;

import java.util.*;

public class DivisionExcepciones {

    public static void main(String[] args) {

        int divisor;
        int dividendo;
        int cociente;
        Scanner lectura = new Scanner(System.in);

        try {
            System.out.println("Introduce un dividendo entero:");
            dividendo = lectura.nextInt();
            System.out.println("Introduce un divisor entero:");
            divisor = lectura.nextInt();
            cociente = dividendo / divisor;
            System.out.println("Resultado: " + cociente);
        } catch (InputMismatchException e) {
            System.out.println("Dividendo y divisor deben ser enteros.");
        } catch (ArithmeticException e) {
            System.out.println("No puedes dividir por 0.");
        } finally {
            System.out.println("\nPrograma finalizado.");
        }
    }
}
