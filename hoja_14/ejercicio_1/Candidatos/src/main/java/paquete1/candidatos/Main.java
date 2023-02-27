package paquete1.candidatos;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 1. Se almacenarán los candidatos a jefe de la sección 1 en una lista doblemente enlazada llamada "lista1".
        // CREACIÓN DE UNA LISTA DE UNA CLASE CON OBJETOS:
        LinkedList<Candidatos> lista1 = new LinkedList();

        // 2. Los candidatos serán seis.
        // Creación de los objetos:
        Candidatos candidato1 = new Candidatos("Ana", 53);
        Candidatos candidato2 = new Candidatos("Bea", 57);
        Candidatos candidato3 = new Candidatos("Oliver", 59);
        Candidatos candidato4 = new Candidatos("Leo", 63);
        Candidatos candidato5 = new Candidatos("Lia", 55);
        Candidatos candidato6 = new Candidatos("Anais", 51);

        // 3. Añado al listado los 4 primeros:
        lista1.add(candidato1);
        lista1.add(candidato2);
        lista1.add(candidato3);
        lista1.add(candidato4);

        // 4. Me doy cuenta de que el quinto candidato iría mejor en la segunda posición.
        lista1.add(1, candidato5); // Para ello se escribe primero la posición a ocupar, después el objeto que va a ir ahí.

        // Se usa un método para mostrar por pantalla un objeto concreto de la lista y comprobar que el "candidato5" está en la segunda posición:
        System.out.println(lista1.get(1).muestraInfo());
        System.out.println("**********");

        // Por haber movido el "candidato5" a la segunda posición, ahora el "candidato4" ocupa la quinta posición, ya que "add" añade y empuja al resto:
        System.out.println(lista1.get(4).muestraInfo());
        System.out.println("**********");

        // 5. El primer candidato llama y deja su puesto al sexto candidato, con lo cual este será sustituido.
        lista1.set(0, candidato6);
        System.out.println(lista1.get(0).muestraInfo());
        System.out.println("**********");

        // 6. El que inscribí como tercer candidato abandona.
        lista1.remove(candidato3);

        // 7. Me llaman de personal y me piden reducir el número de entrevistas a tres. He de eliminar el que ahora ocupa el último lugar (ya no recuerdo la longitud de mi lista).
        // Existen dos formas de hacer esto:
        // lista1.remove(lista1.size() - 1);
        lista1.removeLast();

        // 8. ¿Qué lugar ocupa "candidato5"?
        System.out.println("\nÍNDICE DE candidato5:");
        System.out.println(lista1.indexOf(candidato5));

        // 9. Quiero ver el contenido de la lista mediante:
        // FOR:
        System.out.println("\nlista1 CON BUCLE FOR:");
        for (int i = 0; i < lista1.size(); i++) {
            System.out.println(lista1.get(i).muestraInfo());
            System.out.println("**********");
        }
        // FOR EACH:
        System.out.println("\nlista1 CON BUCLE FOR EACH:");
        for (Candidatos i : lista1) {
            System.out.println(i.muestraInfo());
            System.out.println("**********");
        }
        // ITERADOR:
        Iterator<Candidatos> it1 = lista1.iterator();
        System.out.println("\nlista1 CON ITERADOR:");
        // Hay dos formas de hacerlo, usando una variable (en este caso "t"):
        /*while (it1.hasNext()) { // "HasNext" devuelve verdadero o falso mientras haya un elemento siguiente, por lo que se ejecutará el código siguiente si devuelve "true":
            Candidatos t = it1.next();
            System.out.println(t.nombre + ", " + t.edad);
        }*/
        // O sin usar variable:
        while (it1.hasNext()) {
            System.out.println(it1.next().muestraInfo());
            System.out.println("**********");
        }

        // 10. Hacemos una sublista desde la posición 2 (índice 1) hasta el final de la lista. Y vemos el contenido de esta nueva lista con un iterador.
        // Los sublistados tienen que ser de tipo List:
        List<Candidatos> sublista1 = lista1.subList(1, lista1.size());
        // Se muestra el contenido de esta sublista con un iterador:
        it1 = sublista1.iterator(); // Reciclamos el iterador "it1" en vez de crear otro.
        System.out.println("\nSUBLISTA CON ITERADOR:");
        while (it1.hasNext()) {
            System.out.println(it1.next().muestraInfo());
            System.out.println("**********");
        }

        // 11. Se almacenarán los candidatos a jefe de la sección 2 en una lista de tipo ArrayList lista2:
        ArrayList<Candidatos> lista2 = new ArrayList();
        Candidatos c1Seccion2 = new Candidatos("Tomás", 40);
        Candidatos c2Seccion2 = new Candidatos("Teresa", 43);
        lista2.add(c1Seccion2);
        lista2.add(c2Seccion2);

        // 12. Se añaden estos candidatos a "lista2" y vemos el contenido de los objetos, esta vez creando para ello un iterador.
        Iterator<Candidatos> it2 = lista2.iterator();
        System.out.println("\nCONTENIDO DE lista2:");
        while (it2.hasNext()) {
            System.out.println(it2.next().muestraInfo());
            System.out.println("**********");
        }

        // 13. Se unen las dos colecciones indicando la posición de "lista1" donde quiero introducir "lista2", por ejemplo, al principio.
        lista2.addAll(0, lista1);

        // 14. A partir de aquí "lista2" lleva a todos los candidatos. Lo vemos con el bucle "for each", y podrá ser tratado como LinkedList.
        System.out.println("\nlista2 CON TODOS LOS CANDIDATOS (lista1 + lista2):");
        for (Candidatos i : lista2) {
            System.out.println(i.muestraInfo());
            System.out.println("**********");
        }

    }

}
