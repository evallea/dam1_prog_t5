package paquete1.musica;

public class Cancion {

    // ATRIBUTOS:
    private String titulo;
    private String autor;

    // CONSTRUCTOR POR DEFECTO:
    public Cancion() {
    }

    // CONSTRUCTOR CON PARÁMETROS:
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // MÉTODOS GET Y SET:
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
