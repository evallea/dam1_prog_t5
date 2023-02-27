package paquete1.generasagas;

public class Libro extends Saga {
    
    String tituloLibro;
    
    public Libro (String tituloSaga, String tituloLibro, String autor){
        super(tituloSaga, autor);
        this.tituloLibro=tituloLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }
    
}
