package unidad2;

public class Unidad2 {
    public static void main(String[] args) {
        System.out.println("Prueba de contenido \n");

       //(Agregación)
        Pelicula pelicula = new Pelicula("Inception", 148, "Ciencia Ficción", "Warner Bros.");
        
        Actor actor1 = new Actor("Leonardo DiCaprio", "Britanico");
        Actor actor2 = new Actor("Joseph Gordon-Levitt", "Canadiense");

        pelicula.agregarActor(actor1);
        pelicula.agregarActor(actor2);
        pelicula.mostrarDetalles();

        // (Composición)
        SerieDeTV serie = new SerieDeTV("Breaking Bad", 47, "drama", 6);
        
        serie.agregarTemporada(1, 7);
        serie.agregarTemporada(2, 13);
        serie.agregarTemporada(3, 13);
        serie.mostrarDetalles();

        Investigador investigador = new Investigador("Dr. David Attenborough", "Naturalista y Biólogo");
        Documental documental = new Documental("Planeta Tierra", 60, "Naturaleza", "Vida Salvaje");
        documental.mostrarDetalles();
        
        Cortometraje cortometraje = new Cortometraje("Piper", 6, "Animación", 50000, "Un pequeño ave aprende a buscar comida.");
        cortometraje.mostrarDetalles();
        
        YoutubeShort shortVideo = new YoutubeShort("Tutos de Java", 34531,"Te enseño untruco de Java", 21, "educación");
        shortVideo.mostrarDetalles();
    }
}