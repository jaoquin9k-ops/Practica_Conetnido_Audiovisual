
package unidad2;

public class Actor {
    private String nombre;
    private String nacionalidad;

    public Actor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
   public void mostrarDetalles() {
        System.out.println("Detalles del Actor:");
        System.out.println("Nombre: " + nombre);
        System.out.println("La nacionalidad de el actor es: "+ nacionalidad);
        System.out.println();
    }
  
    
}
