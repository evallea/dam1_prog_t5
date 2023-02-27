package paquete1.tarea5;

public class Contacto {

    // ATRIBUTOS:
    String nombre;
    String apellido;

    // CONSTRUCTOR POR DEFECTO:
    Contacto() {
        nombre = "Enrique";
        apellido = "Valle";
    }

    // CONSTRUCTOR POR PARÁMETROS:
    Contacto(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    // MÉTODO PARA MOSTRAR INFORMACIÓN:
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

}