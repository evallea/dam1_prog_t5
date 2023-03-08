package paquete1.ejercicio1;

/**
 *
 * @author damt124
 */
public class Personal {
    
    // ATRIBUTOS PRIVADOS:
    private String dni;
    private int salario;

    // CONSTRUCTOR CON PARÁMETROS:
    public Personal(String dni, int salario) {
        this.dni = dni;
        this.salario = salario;
    }

    // CONSTRUCTOR POR DEFECTO:
    public Personal() {
    }

    // MÉTODOS GET Y SET:
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
