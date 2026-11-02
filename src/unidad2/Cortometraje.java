package unidad2;

public class Cortometraje extends ContenidoAudiovisual {
    private int presupuesto; 
    private String trama;
        
    public Cortometraje(String titulo, int duracionEnMinutos, String genero, int presupuesto, String trama) {
        super(titulo, duracionEnMinutos, genero);
        this.presupuesto = presupuesto;
        this.trama = trama;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Cortometraje:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Presupuesto: $" + presupuesto);
        System.out.println("Trama: " + trama);
        System.out.println();
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getTrama() {
        return trama;
    }

    public void setTrama(String trama) {
        this.trama = trama;
    }
}