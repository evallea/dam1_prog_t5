package paquete1.agenda;

public class Agenda {

    // ATRIBUTOS:
    private Persona array_personas[];
    int contador;

    // CONSTRUCTOR:
    public Agenda(int n) {
        array_personas = new Persona[n];
        contador = 0;
    }

    // GETS Y SETS:
    public Persona[] getArray_personas() {
        return array_personas;
    }

    public void setArray_personas(Persona[] array_personas) {
        this.array_personas = array_personas;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    // MÉTODOS:
    public void anadir(Persona p1) {
        if (array_personas.length >= contador) {
            array_personas[contador] = p1;
            contador++;
            System.out.println("Contacto añadido.");
        } else {
            System.out.println("No se pudo añadir.");
        }
    }

    public void mostrar() {
        for (int i = 0; i < contador; i++) {
            System.out.println("\nNombre: " + array_personas[i].getNombre() + "\nTeléfono: " + array_personas[i].getTelefono());
        }
    }

    public void buscar(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (array_personas[i].getNombre().equals(nombre)) {
                System.out.println("\nNombre: " + array_personas[i].getNombre() + "\nTeléfono: " + array_personas[i].getTelefono());
            }
        }
    }

    public void modificar(String nombre, int telefono) {
        for (int i = 0; i < contador; i++) {
            if (array_personas[i].getNombre().equals(nombre)) {
                array_personas[i] = new Persona(nombre, telefono);
                System.out.println("Contacto modificado.");
            }
        }
    }
}
