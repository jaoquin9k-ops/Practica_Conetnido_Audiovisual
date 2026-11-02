
package unidad2;

public class YoutubeShort extends ContenidoAudiovisual{

    public String canalDelcreador;
    public int visualizaciones;
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del YouTube Short:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en segundos/minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Canal: " + canalDelcreador);
        System.out.println("Visualizaciones: " + visualizaciones);
        System.out.println();
    }

    public YoutubeShort(String canalDecreador, int visualisaciones, String titulo, int duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        this.canalDelcreador = canalDecreador;
        this.visualizaciones = visualisaciones;
    }

    public String getCanalDecreador() {
        return canalDelcreador;
    }

    public void setCanalDecreador(String canalDecreador) {
        this.canalDelcreador = canalDecreador;
    }

    public int getVisualisaciones() {
        return visualizaciones;
    }

    public void setVisualisaciones(int visualisaciones) {
        this.visualizaciones = visualisaciones;
    }
    
    
}
