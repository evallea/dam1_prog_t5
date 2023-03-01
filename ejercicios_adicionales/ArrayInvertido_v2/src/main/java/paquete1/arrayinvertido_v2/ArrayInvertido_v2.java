package paquete1.arrayinvertido_v2;

/**
 *
 * @author Enrique Valle Alcega
 */
public class ArrayInvertido_v2 {

    public static void main(String[] args) {

        // Crea un array de 10 números:
        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Declara una variable temporal para almacenar temporalmente un elemento:
        int temp;

        // Recorre el array desde el primer elemento hasta la mitad del array:
        for (int i = 0; i < numeros.length / 2; i++) {
            // Almacena temporalmente el valor del elemento actual en la variable temp:
            temp = numeros[i];

            // Intercambia el elemento actual con el elemento simétrico (el elemento en la posición opuesta):
            numeros[i] = numeros[numeros.length - 1 - i];
            // Y viceversa con el valor guardado anteriormente en temp:
            numeros[numeros.length - 1 - i] = temp;
        }

        // Muestra el array invertido:
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

    }

}
