package paquete1.taller;

/**
 *
 * @author Enrique Valle Alcega
 */
public class Coche {

    // Atributos:
    private String color;
    private String marca;

    // Constructor con parámetros:
    public Coche(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }

    // Métodos get y set:
    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    // Método para mostrar atributos de los objetos:
    @Override
    public String toString() {
        return "Color: " + color + "\nMarca: " + marca;
    }

}
