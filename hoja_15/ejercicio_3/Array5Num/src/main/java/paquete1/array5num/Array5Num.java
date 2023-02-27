package paquete1.array5num;

import java.util.*;

public class Array5Num {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        // ARRAY DE 5 ELEMENTOS:
        int numeros[] = new int[5];

        // INTRODUCCIÓN DE NÚMEROS SIN BUCLE:
        /*System.out.println("Introduce el primer número:");
        numeros[0] = lectura.nextInt();

        System.out.println("Introduce el segundo número:");
        numeros[1] = lectura.nextInt();

        System.out.println("Introduce el tercer número:");
        numeros[2] = lectura.nextInt();

        System.out.println("Introduce el cuarto número:");
        numeros[3] = lectura.nextInt();

        System.out.println("Introduce el quinto número:");
        numeros[4] = lectura.nextInt();*/
                
        // SE MUESTRA EL ARRAY CON FOR EACH:
        /*System.out.println("\nHas introducido:");
        for (int i : numeros) {
            System.out.print(i + " ");
        }*/
                
        // INTRODUCCIÓN DE NÚMEROS CON BUCLE FOR:
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número:");
            numeros[i] = lectura.nextInt();
        }

        // SE MUESTRA EL ARRAY CON toString:
        System.out.println("\n" + Arrays.toString(numeros));

        int mayor = numeros[0];
        int menor = numeros[0];
        int posicionMayor = 0;
        int posicionMenor = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posicionMayor = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posicionMenor = i;
            }
        }

        System.out.println("\nEl mayor es: " + mayor + ", y su posición es: " + (posicionMayor + 1));
        System.out.println("\nEl menor es: " + menor + ", y su posición es: " + (posicionMenor + 1));

    }

}
