package paquete1.arrayrandom0a99;

public class ArrayRandom0a99 {

    public static void main(String[] args) {

        int numeros[][] = new int[4][3];
        int sumas[] = new int[3];

        System.out.println("Array de números aleatorios entre 0 y 99 (de 4 filas y 3 columnas):");
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                numeros[i][j] = (int) (Math.random() * 100);
                sumas[j] += numeros[i][j];
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Suma de cada columna:");
        
        for (int i : sumas) {
            System.out.println(i + " ");
        }
        
    }
    
}
