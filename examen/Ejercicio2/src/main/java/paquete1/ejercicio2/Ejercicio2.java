package paquete1.ejercicio2;

/**
 *
 * @author damt124
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        // Se crea el array bidimensional:
        String caracteres[][] = new String[4][5];  // 4 filas y 5 columnas.

        // Se establecen los valores del array para las dimensiones (manualmente):
        /*
        caracteres[0][0] = "+";
        caracteres[0][1] = "-";
        caracteres[0][2] = "+";
        caracteres[0][3] = "-";
        caracteres[0][4] = "+";

        caracteres[1][0] = "+";
        caracteres[1][1] = "-";
        caracteres[1][2] = "+";
        caracteres[1][3] = "-";
        caracteres[1][4] = "+";

        caracteres[2][0] = "+";
        caracteres[2][1] = "-";
        caracteres[2][2] = "+";
        caracteres[2][3] = "-";
        caracteres[2][4] = "+";

        caracteres[3][0] = "+";
        caracteres[3][1] = "-";
        caracteres[3][2] = "+";
        caracteres[3][3] = "-";
        caracteres[3][4] = "+";
        */
        
        // Mediante el bucle for, se recorren las dimensiones del array:
        for (int i = 0; i < caracteres.length; i++) { // Recorre la primera dimensión del array.
            for (int j = 0; j < caracteres[i].length; j++) { // Recorre la segunda dimensión del array.
                if (j % 2 != 0) { // Si es par, se escribe '-'.
                    caracteres[i][j] = "-";
                } else {
                    caracteres[i][j] = "+"; // Si es impar, se escribe '+'.
                }
                System.out.print(caracteres[i][j] + " ");
            }
            System.out.println(); // Se utiliza para dar el formato adecuado al array por pantalla.
        }
    }
}
