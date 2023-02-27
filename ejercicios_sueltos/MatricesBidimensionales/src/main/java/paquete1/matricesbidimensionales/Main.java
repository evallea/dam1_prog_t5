package paquete1.matricesbidimensionales;

public class Main {

    /*
     Este código crea un array bidimensional llamado "miMatriz" que consiste en 4 filas y 5 columnas. 
     Después, se muestra el contenido de ese array bidimensional en dos formas diferentes:

     1. Utilizando dos bucles anidados "for" normales: el primer bucle "for" recorre las filas (índice "i") y el segundo bucle "for" recorre las columnas (índice "j").
     Cada vez que el segundo bucle "for" recorre una columna, imprime el valor correspondiente en la posición "miMatriz[i][j]".

     2. Utilizando dos bucles "for each" anidados: el primer bucle "for each" recorre las filas y el segundo bucle "for each" recorre las columnas de cada fila.
     Cada vez que el segundo bucle "for each" recorre una columna, imprime el valor correspondiente en esa columna.
    */
    
    public static void main(String[] args) {

        // CREACIÓN Y DECLARACÍON DE ARRAY BIDIMENSIONAL POR SEPARADO:
        /*
        int miMatriz[][] = new int[4][5];

        miMatriz[0][0] = 23;
        miMatriz[0][1] = 24;
        miMatriz[0][2] = 25;
        miMatriz[0][3] = 26;
        miMatriz[0][4] = 27;

        miMatriz[1][0] = 28;
        miMatriz[1][1] = 29;
        miMatriz[1][2] = 30;
        miMatriz[1][3] = 31;
        miMatriz[1][4] = 32;

        miMatriz[2][0] = 33;
        miMatriz[2][1] = 34;
        miMatriz[2][2] = 35;
        miMatriz[2][3] = 36;
        miMatriz[2][4] = 37;

        miMatriz[3][0] = 38;
        miMatriz[3][1] = 39;
        miMatriz[3][2] = 40;
        miMatriz[3][3] = 41;
        miMatriz[3][4] = 42;
        */ 
        
        // CREACIÓN Y DECLARACÍON DE ARRAY BIDIMENSIONAL EN UNA SOLA LÍNEA:
        int miMatriz[][] = {{23, 24, 25, 26, 27}, {28, 29, 30, 31, 32}, {33, 34, 35, 36, 37}, {38, 39, 40, 41, 42}};

        // MOSTRAR EL ARRAY BIDIMENSIONAL RECORRIÉNDOLO CON BUCLES FOR ANIDADOS:
        // Imprimirá un salto de línea e inmediatamente después ejecutará el siguiente bucle para imprimir los valores de "j" para ese valor de "i".
        for (int i = 0; i < 4; i++) {
            System.out.println("");

            for (int j = 0; j < 5; j++) {
                System.out.print(miMatriz[i][j] + " "); // Se quita el "ln" al "print" para mostrarlo en formato horizontal.
            }
        }

        System.out.println(""); // Esta línea es únicamente para separar ambos "arrays".

        // MOSTRAR EL ARRAY BIDIMENSIONAL RECORRIÉNDOLO CON BUCLES FOR EACH ANIDADOS:
        for (int i[] : miMatriz) { // Primera iteración: i = miMatriz[0]; Segunda iteración: i = miMatriz[1]; Tercera iteración: i = miMatriz[2]; Cuarta iteración: i = miMatriz[3];
            System.out.println("");

            for (int j : i) {
                System.out.print(j + " "); // En la primera iteración de la fila i, j = i[0]; en la segunda iteración de la fila i, j = i[1]; en la tercera iteración de la fila i, j = i[2]; etc.
            }
        }

    }

}
