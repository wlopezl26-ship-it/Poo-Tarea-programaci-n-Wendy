package Encapsulacion;

public class Jugador {

    private String nombre;
    private int puntajeActual;
    private int puntajeMaximo;

    // Constructor
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntajeActual = 0;
        this.puntajeMaximo = 0;
    }


    public void actualizarPuntaje(int nuevoPuntaje) throws Exception {
      
        if (nuevoPuntaje < 0) {
            throw new Exception("El puntaje no puede ser negativo.");
        }

        
        this.puntajeActual = nuevoPuntaje;

        
        if (this.puntajeActual > this.puntajeMaximo) {
            this.puntajeMaximo = this.puntajeActual;
            System.out.println("¡Nuevo récord personal para " + nombre + "!");
        }
    }

 
    public int getPuntajeActual() { return puntajeActual; }
    public int getPuntajeMaximo() { return puntajeMaximo; }
    public String getNombre() { return nombre; }
}