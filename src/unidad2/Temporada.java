package unidad2;

public class Temporada {
    private int numeroTemporada;
    private int numeroEpisodios;

    public Temporada(int numeroTemporada, int numeroEpisodios) {
        this.numeroTemporada = numeroTemporada;
        this.numeroEpisodios = numeroEpisodios;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }

    public void mostrarDetalles() {
        System.out.println("Detalles de la Temporada:");
        System.out.println("Número de Temporada: " + numeroTemporada);
        System.out.println("Número de Episodios: " + numeroEpisodios);
        System.out.println();
    }
}