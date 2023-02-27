package paquete1.generasagas;

public class Saga {

    String tituloSaga;
    String autor;

    public Saga(String tituloSaga, String autor) {
        this.tituloSaga = tituloSaga;
        this.autor = autor;
    }

    public String getTituloSaga() {
        return tituloSaga;
    }

    public void setTituloSaga(String tituloSaga) {
        this.tituloSaga = tituloSaga;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
