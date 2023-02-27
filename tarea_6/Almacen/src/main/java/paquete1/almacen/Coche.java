package paquete1.almacen;

/**
 *
 * @author Enrique Valle Alcega
 */
public class Coche {

    // ATRIBUTOS:
    private String color;
    private String marca;

    // CONSTRUCTOR CON PARÁMETROS:
    public Coche(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }

    // MÉTODOS:
    // Métodos get y set:
    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    // Método para mostrar los atributos de los objetos:
    @Override
    public String toString() {
        return "Color: " + color + "\nMarca: " + marca;
    }

}
