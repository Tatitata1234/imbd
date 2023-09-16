package entity;

public class Seriado extends ProdutoAudiovisual{
    private int temporadas;
    private int numeroEpisodiosTemporada;

    public Seriado(int temporadas, int numeroEpisodiosTemporada) {
        this.temporadas = temporadas;
        this.numeroEpisodiosTemporada = numeroEpisodiosTemporada;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getNumeroEpisodiosTemporada() {
        return numeroEpisodiosTemporada;
    }

    public void setNumeroEpisodiosTemporada(int numeroEpisodiosTemporada) {
        this.numeroEpisodiosTemporada = numeroEpisodiosTemporada;
    }
}
