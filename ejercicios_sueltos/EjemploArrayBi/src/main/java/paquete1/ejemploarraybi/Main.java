package paquete1.ejemploarraybi;

public class Main {

    public static void main(String[] args) {

        // EJEMPLO DE ARRAY UNIDIMENSIONAL:
        
        int ejemplo1[] = new int[4];

        ejemplo1[0] = 1;
        ejemplo1[1] = 7;
        ejemplo1[2] = 32;
        ejemplo1[3] = 21;

        for (int i = 0; i < ejemplo1.length; i++) {

            // Este "for" interior ordena los números del array de menor a mayor, para ello se compara con el número siguiente:
            for (int j = i + 1; j < ejemplo1.length; j++) {
                int n;
                // Se invierten los valores [i] y [j] si se da la condición:
                if (ejemplo1[i] > ejemplo1[j]) {
                    // OPCIÓN 1:
                    // n = ejemplo1[i]; // Se guarda el valor de [i] en "n":
                    // ejemplo1[i] = ejemplo1[j];
                    // ejemplo1[j] = n;
                    // OPCIÓN 2:
                    n = ejemplo1[j]; // Se guarda el valor de [j] en "n":
                    ejemplo1[j] = ejemplo1[i];
                    ejemplo1[i] = n;
                }
            }
            // System.out.println(ejemplo1[i]);
        }

        // EJEMPLOS DE ARRAYS BIDIMENSIONALES:
        
        // Array declarado pero no iniciado:
        int ejemplo2[][] = new int[1][2]; // 1 fila y 2 columnas.
        
        // Array declarado e iniciado a la vez:
        // int ejemplo2[][] = {{16,42}};

        // Array declarado e iniciado a la vez:
        int ejemplo3[][] = {{16, 42, 33}, {32, 75, 53}}; // 2 filas y 3 columnas.
        // int ejemplo3[][] = new int[2][3];
        // System.out.println(ejemplo3[0].length);
        // System.out.println(ejemplo3[1].length);

        // Array con la segunda columna formada por números 1 y el resto por números aleatorios:
        int numeros[][] = new int[3][3];  // 3 filas y 3 columnas.

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                // Este "if" determina que si está en la segunda columna, escriba un 1:
                if (j == 1) {
                    numeros[i][j] = 1;
                } else {
                    numeros[i][j] = (int) Math.floor(Math.random() * 10);
                }
                suma = suma + numeros[i][j]; // Esta línea hace que se sumen los elementos del array.
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("la suma es: " + suma + "\n");

        // Array en el que la diagonal principal (desde arriba izquierda hasta abajo derecha) son números 1, y el resto 0:
        int numeros2[][] = new int[3][3];  // 3 filas y 3 columnas.

        for (int i = 0; i < numeros2.length; i++) {
            for (int j = 0; j < numeros2[i].length; j++) {
                if (i == j) {
                    numeros2[i][j] = 1;
                } else {
                    numeros2[i][j] = 0;
                }
                System.out.print(numeros2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
