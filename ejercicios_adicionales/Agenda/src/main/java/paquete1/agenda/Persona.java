package paquete1.agenda;

public class Persona {

    // ATRIBUTOS:
    private String nombre;
    private int telefono;
    
    // CONSTRUCTOR CON PARÁMETROS:
    Persona(String nombre, int telefono) {
        this.nombre=nombre;
        this.telefono=telefono;
    }

    // GET Y SETS:
    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
