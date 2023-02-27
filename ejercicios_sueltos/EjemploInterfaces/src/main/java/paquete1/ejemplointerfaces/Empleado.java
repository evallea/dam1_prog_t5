package paquete1.ejemplointerfaces;

public class Empleado implements Empresa, Gobierno{ // Se añade "implements" y el nombre de la interfaz a implementar (si son varias interfaces, separadas por comas).

    String nombre;
    String apellido;
    double sueldo;

    public Empleado(String nombre, String apellido, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public double pagaExtra(double sueldo) {
        return sueldo;
    }

}
